package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsDiameter extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var diameter: js.UndefOr[scala.Double] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var tessellation: js.UndefOr[scala.Double] = js.undefined
  var thickness: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BackUVsDiameter {
  @scala.inline
  def apply(
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    diameter: scala.Int | scala.Double = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    sideOrientation: scala.Int | scala.Double = null,
    tessellation: scala.Int | scala.Double = null,
    thickness: scala.Int | scala.Double = null
  ): Anon_BackUVsDiameter = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackUVsDiameter]
  }
}

