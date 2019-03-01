package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsDepthFaceColorsFaceUV extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var faceColors: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Vector4]] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var holes: js.UndefOr[js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]]] = js.undefined
  var shape: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BackUVsDepthFaceColorsFaceUV {
  @scala.inline
  def apply(
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    depth: scala.Int | scala.Double = null,
    faceColors: js.Array[babylonjsLib.BABYLONNs.Color4] = null,
    faceUV: js.Array[babylonjsLib.BABYLONNs.Vector4] = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    holes: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]] = null,
    sideOrientation: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BackUVsDepthFaceColorsFaceUV = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shape")(shape)
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors)
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (holes != null) __obj.updateDynamic("holes")(holes)
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_BackUVsDepthFaceColorsFaceUV]
  }
}

