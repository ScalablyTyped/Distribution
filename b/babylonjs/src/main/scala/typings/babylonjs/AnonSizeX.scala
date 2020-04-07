package typings.babylonjs

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizeX extends js.Object {
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
}

object AnonSizeX {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    custom: js.Any = null,
    faceColors: js.Array[Color4] = null,
    faceUV: js.Array[Vector4] = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    frontUVs: Vector4 = null,
    sideOrientation: Int | Double = null,
    size: Int | Double = null,
    sizeX: Int | Double = null,
    sizeY: Int | Double = null,
    sizeZ: Int | Double = null,
    `type`: Int | Double = null
  ): AnonSizeX = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors.asInstanceOf[js.Any])
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeX != null) __obj.updateDynamic("sizeX")(sizeX.asInstanceOf[js.Any])
    if (sizeY != null) __obj.updateDynamic("sizeY")(sizeY.asInstanceOf[js.Any])
    if (sizeZ != null) __obj.updateDynamic("sizeZ")(sizeZ.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeX]
  }
}

