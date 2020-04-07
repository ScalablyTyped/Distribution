package typings.babylonjs

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFaceColorsFaceUV extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonFaceColorsFaceUV {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    depth: Int | Double = null,
    faceColors: js.Array[Color4] = null,
    faceUV: js.Array[Vector4] = null,
    frontUVs: Vector4 = null,
    height: Int | Double = null,
    sideOrientation: Int | Double = null,
    size: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonFaceColorsFaceUV = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors.asInstanceOf[js.Any])
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFaceColorsFaceUV]
  }
}

