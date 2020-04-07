package typings.babylonjs

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHoles extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var holes: js.UndefOr[js.Array[js.Array[Vector3]]] = js.undefined
  var shape: js.Array[Vector3]
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonHoles {
  @scala.inline
  def apply(
    shape: js.Array[Vector3],
    backUVs: Vector4 = null,
    depth: Int | Double = null,
    faceColors: js.Array[Color4] = null,
    faceUV: js.Array[Vector4] = null,
    frontUVs: Vector4 = null,
    holes: js.Array[js.Array[Vector3]] = null,
    sideOrientation: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonHoles = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors.asInstanceOf[js.Any])
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (holes != null) __obj.updateDynamic("holes")(holes.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHoles]
  }
}

