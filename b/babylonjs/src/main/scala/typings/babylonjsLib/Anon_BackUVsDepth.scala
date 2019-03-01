package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsDepth extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var faceColors: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Vector4]] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BackUVsDepth {
  @scala.inline
  def apply(
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    depth: scala.Int | scala.Double = null,
    faceColors: js.Array[babylonjsLib.BABYLONNs.Color4] = null,
    faceUV: js.Array[babylonjsLib.BABYLONNs.Vector4] = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    height: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_BackUVsDepth = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors)
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackUVsDepth]
  }
}

