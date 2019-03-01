package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var normal: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var position: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var size: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
}

object Anon_Angle {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    normal: babylonjsLib.BABYLONNs.Vector3 = null,
    position: babylonjsLib.BABYLONNs.Vector3 = null,
    size: babylonjsLib.BABYLONNs.Vector3 = null
  ): Anon_Angle = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (position != null) __obj.updateDynamic("position")(position)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Angle]
  }
}

