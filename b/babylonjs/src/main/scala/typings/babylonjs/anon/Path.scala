package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var cap: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var instance: js.UndefOr[typings.babylonjs.meshMod.Mesh] = js.undefined
  var invertUV: js.UndefOr[Boolean] = js.undefined
  var path: js.Array[Vector3]
  var ribbonCloseArray: js.UndefOr[Boolean] = js.undefined
  var ribbonClosePath: js.UndefOr[Boolean] = js.undefined
  var rotationFunction: js.UndefOr[js.Any] = js.undefined
  var scaleFunction: js.UndefOr[js.Any] = js.undefined
  var shape: js.Array[Vector3]
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object Path {
  @scala.inline
  def apply(
    path: js.Array[Vector3],
    shape: js.Array[Vector3],
    backUVs: Vector4 = null,
    cap: js.UndefOr[Double] = js.undefined,
    frontUVs: Vector4 = null,
    instance: typings.babylonjs.meshMod.Mesh = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    ribbonCloseArray: js.UndefOr[Boolean] = js.undefined,
    ribbonClosePath: js.UndefOr[Boolean] = js.undefined,
    rotationFunction: js.Any = null,
    scaleFunction: js.Any = null,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(cap)) __obj.updateDynamic("cap")(cap.get.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonCloseArray)) __obj.updateDynamic("ribbonCloseArray")(ribbonCloseArray.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonClosePath)) __obj.updateDynamic("ribbonClosePath")(ribbonClosePath.get.asInstanceOf[js.Any])
    if (rotationFunction != null) __obj.updateDynamic("rotationFunction")(rotationFunction.asInstanceOf[js.Any])
    if (scaleFunction != null) __obj.updateDynamic("scaleFunction")(scaleFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

