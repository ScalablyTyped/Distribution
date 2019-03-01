package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsCustom extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var custom: js.UndefOr[js.Any] = js.undefined
  var faceColors: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Vector4]] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sizeX: js.UndefOr[scala.Double] = js.undefined
  var sizeY: js.UndefOr[scala.Double] = js.undefined
  var sizeZ: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BackUVsCustom {
  @scala.inline
  def apply(
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    custom: js.Any = null,
    faceColors: js.Array[babylonjsLib.BABYLONNs.Color4] = null,
    faceUV: js.Array[babylonjsLib.BABYLONNs.Vector4] = null,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    sideOrientation: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    sizeX: scala.Int | scala.Double = null,
    sizeY: scala.Int | scala.Double = null,
    sizeZ: scala.Int | scala.Double = null,
    `type`: scala.Int | scala.Double = null
  ): Anon_BackUVsCustom = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors)
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeX != null) __obj.updateDynamic("sizeX")(sizeX.asInstanceOf[js.Any])
    if (sizeY != null) __obj.updateDynamic("sizeY")(sizeY.asInstanceOf[js.Any])
    if (sizeZ != null) __obj.updateDynamic("sizeZ")(sizeZ.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackUVsCustom]
  }
}

