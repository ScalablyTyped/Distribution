package typings.backo2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backoff extends js.Object {
  /**
    * The number of previous attempts
    */
  var attempts: Double
  /**
    * The base to which the attempt is raised as an exponent
    */
  var factor: Double
  /**
    * An upper bound on the variance around the duration between attempts
    */
  var jitter: Double
  /**
    * An upper bound on the duration between attempts
    */
  var max: Double
  /**
    * A lower bound on the duration between attempts
    */
  var ms: Double
  /**
    * Compute the backoff duration and increment the number of attempts
    */
  def duration(): Double
  /**
    * Reset the number of attempts
    */
  def reset(): Unit
  /**
    * Set the jitter
    */
  def setJitter(jitter: Double): Unit
  /**
    * Set the maximum duration between attempts
    */
  def setMax(max: Double): Unit
  /**
    * Set the minimum duration between attempts
    */
  def setMin(min: Double): Unit
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
}

