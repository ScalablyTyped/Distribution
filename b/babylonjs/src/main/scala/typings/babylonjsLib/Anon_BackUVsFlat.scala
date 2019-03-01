package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsFlat extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var radiusX: js.UndefOr[scala.Double] = js.undefined
  var radiusY: js.UndefOr[scala.Double] = js.undefined
  var radiusZ: js.UndefOr[scala.Double] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var subdivisions: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BackUVsFlat {
  @scala.inline
  def apply(
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    radius: scala.Int | scala.Double = null,
    radiusX: scala.Int | scala.Double = null,
    radiusY: scala.Int | scala.Double = null,
    radiusZ: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    subdivisions: scala.Int | scala.Double = null
  ): Anon_BackUVsFlat = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusX != null) __obj.updateDynamic("radiusX")(radiusX.asInstanceOf[js.Any])
    if (radiusY != null) __obj.updateDynamic("radiusY")(radiusY.asInstanceOf[js.Any])
    if (radiusZ != null) __obj.updateDynamic("radiusZ")(radiusZ.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackUVsFlat]
  }
}

