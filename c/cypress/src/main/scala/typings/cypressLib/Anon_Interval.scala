package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: scala.Double
  /**
    * Globally disable all animations.
    */
  var off: scala.Boolean
  var speeds: Anon_Fast
  var step: js.Any
  def stop(): scala.Unit
  def tick(): scala.Unit
}

object Anon_Interval {
  @scala.inline
  def apply(
    interval: scala.Double,
    off: scala.Boolean,
    speeds: Anon_Fast,
    step: js.Any,
    stop: () => scala.Unit,
    tick: () => scala.Unit
  ): Anon_Interval = {
    val __obj = js.Dynamic.literal(interval = interval, off = off, speeds = speeds, step = step, stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick))
  
    __obj.asInstanceOf[Anon_Interval]
  }
}

