package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceUV extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var custom: js.UndefOr[js.Any] = js.undefined
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  var flat: js.UndefOr[Boolean] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizeX: js.UndefOr[Double] = js.undefined
  var sizeY: js.UndefOr[Double] = js.undefined
  var sizeZ: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object FaceUV {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    custom: js.Any = null,
    faceColors: js.Array[Color4] = null,
    faceUV: js.Array[Vector4] = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    frontUVs: Vector4 = null,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    sizeX: js.UndefOr[Double] = js.undefined,
    sizeY: js.UndefOr[Double] = js.undefined,
    sizeZ: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): FaceUV = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors.asInstanceOf[js.Any])
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.get.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeX)) __obj.updateDynamic("sizeX")(sizeX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeY)) __obj.updateDynamic("sizeY")(sizeY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeZ)) __obj.updateDynamic("sizeZ")(sizeZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceUV]
  }
}

