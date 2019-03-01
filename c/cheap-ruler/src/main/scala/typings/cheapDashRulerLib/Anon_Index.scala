package typings
package cheapDashRulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: scala.Double
  var point: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point
  var t: scala.Double
}

object Anon_Index {
  @scala.inline
  def apply(
    index: scala.Double,
    point: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point,
    t: scala.Double
  ): Anon_Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("t")(t)
    __obj.asInstanceOf[Anon_Index]
  }
}

