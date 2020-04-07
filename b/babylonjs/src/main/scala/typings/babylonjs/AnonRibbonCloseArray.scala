package typings.babylonjs

import typings.babylonjs.BABYLON.Mesh
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRibbonCloseArray extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var cap: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var instance: js.UndefOr[Mesh] = js.undefined
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

object AnonRibbonCloseArray {
  @scala.inline
  def apply(
    path: js.Array[Vector3],
    shape: js.Array[Vector3],
    backUVs: Vector4 = null,
    cap: Int | Double = null,
    frontUVs: Vector4 = null,
    instance: Mesh = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    ribbonCloseArray: js.UndefOr[Boolean] = js.undefined,
    ribbonClosePath: js.UndefOr[Boolean] = js.undefined,
    rotationFunction: js.Any = null,
    scaleFunction: js.Any = null,
    sideOrientation: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonRibbonCloseArray = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonCloseArray)) __obj.updateDynamic("ribbonCloseArray")(ribbonCloseArray.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonClosePath)) __obj.updateDynamic("ribbonClosePath")(ribbonClosePath.asInstanceOf[js.Any])
    if (rotationFunction != null) __obj.updateDynamic("rotationFunction")(rotationFunction.asInstanceOf[js.Any])
    if (scaleFunction != null) __obj.updateDynamic("scaleFunction")(scaleFunction.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRibbonCloseArray]
  }
}

