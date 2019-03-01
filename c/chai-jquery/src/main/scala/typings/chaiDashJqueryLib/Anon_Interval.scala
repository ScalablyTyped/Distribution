package typings
package chaiDashJqueryLib

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
    stop: js.Function0[scala.Unit],
    tick: js.Function0[scala.Unit]
  ): Anon_Interval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("speeds")(speeds)
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("tick")(tick)
    __obj.asInstanceOf[Anon_Interval]
  }
}

