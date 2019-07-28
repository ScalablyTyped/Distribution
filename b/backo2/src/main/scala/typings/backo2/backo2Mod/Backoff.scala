package typings.backo2.backo2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backoff extends js.Object {
  def duration(): Double
  /**
    * Reset the number of attempts.
    */
  def reset(): Unit
  /**
    * Set the jitter
    */
  def setJitter(jitter: Double): Unit
  /**
    * Set the maximum duration
    */
  def setMax(max: Double): Unit
  /**
    * Set the minimum duration
    */
  def setMin(min: Double): Unit
}

object Backoff {
  @scala.inline
  def apply(
    duration: () => Double,
    reset: () => Unit,
    setJitter: Double => Unit,
    setMax: Double => Unit,
    setMin: Double => Unit
  ): Backoff = {
    val __obj = js.Dynamic.literal(duration = js.Any.fromFunction0(duration), reset = js.Any.fromFunction0(reset), setJitter = js.Any.fromFunction1(setJitter), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin))
  
    __obj.asInstanceOf[Backoff]
  }
}

