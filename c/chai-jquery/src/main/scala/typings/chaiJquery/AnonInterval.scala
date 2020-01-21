package typings.chaiJquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterval extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: Double
  /**
    * Globally disable all animations.
    */
  var off: Boolean
  var speeds: AnonFast
  var step: js.Any
  def stop(): Unit
  def tick(): Unit
}

object AnonInterval {
  @scala.inline
  def apply(interval: Double, off: Boolean, speeds: AnonFast, step: js.Any, stop: () => Unit, tick: () => Unit): AnonInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick))
  
    __obj.asInstanceOf[AnonInterval]
  }
}

