package typings.backo2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backoff extends js.Object {
  
  /**
    * The number of previous attempts
    */
  var attempts: Double = js.native
  
  /**
    * Compute the backoff duration and increment the number of attempts
    */
  def duration(): Double = js.native
  
  /**
    * The base to which the attempt is raised as an exponent
    */
  var factor: Double = js.native
  
  /**
    * An upper bound on the variance around the duration between attempts
    */
  var jitter: Double = js.native
  
  /**
    * An upper bound on the duration between attempts
    */
  var max: Double = js.native
  
  /**
    * A lower bound on the duration between attempts
    */
  var ms: Double = js.native
  
  /**
    * Reset the number of attempts
    */
  def reset(): Unit = js.native
  
  /**
    * Set the jitter
    */
  def setJitter(jitter: Double): Unit = js.native
  
  /**
    * Set the maximum duration between attempts
    */
  def setMax(max: Double): Unit = js.native
  
  /**
    * Set the minimum duration between attempts
    */
  def setMin(min: Double): Unit = js.native
}
object Backoff {
  
  @scala.inline
  def apply(
    attempts: Double,
    duration: () => Double,
    factor: Double,
    jitter: Double,
    max: Double,
    ms: Double,
    reset: () => Unit,
    setJitter: Double => Unit,
    setMax: Double => Unit,
    setMin: Double => Unit
  ): Backoff = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], duration = js.Any.fromFunction0(duration), factor = factor.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setJitter = js.Any.fromFunction1(setJitter), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin))
    __obj.asInstanceOf[Backoff]
  }
  
  @scala.inline
  implicit class BackoffOps[Self <: Backoff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: () => Double): Self = this.set("duration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetJitter(value: Double => Unit): Self = this.set("setJitter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMax(value: Double => Unit): Self = this.set("setMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMin(value: Double => Unit): Self = this.set("setMin", js.Any.fromFunction1(value))
  }
}
