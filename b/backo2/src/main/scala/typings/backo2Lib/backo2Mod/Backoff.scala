package typings
package backo2Lib.backo2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backoff extends js.Object {
  def duration(): scala.Double
  /**
    * Reset the number of attempts.
    */
  def reset(): scala.Unit
  /**
    * Set the jitter
    */
  def setJitter(jitter: scala.Double): scala.Unit
  /**
    * Set the maximum duration
    */
  def setMax(max: scala.Double): scala.Unit
  /**
    * Set the minimum duration
    */
  def setMin(min: scala.Double): scala.Unit
}

object Backoff {
  @scala.inline
  def apply(
    duration: () => scala.Double,
    reset: () => scala.Unit,
    setJitter: scala.Double => scala.Unit,
    setMax: scala.Double => scala.Unit,
    setMin: scala.Double => scala.Unit
  ): Backoff = {
    val __obj = js.Dynamic.literal(duration = js.Any.fromFunction0(duration), reset = js.Any.fromFunction0(reset), setJitter = js.Any.fromFunction1(setJitter), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin))
  
    __obj.asInstanceOf[Backoff]
  }
}

