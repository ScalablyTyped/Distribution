package typings.babylonjs

import typings.babylonjs.BABYLON.Mesh
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRotation extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var cap: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var instance: js.UndefOr[Mesh] = js.undefined
  var invertUV: js.UndefOr[Boolean] = js.undefined
  var path: js.Array[Vector3]
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var shape: js.Array[Vector3]
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonRotation {
  @scala.inline
  def apply(
    path: js.Array[Vector3],
    shape: js.Array[Vector3],
    backUVs: Vector4 = null,
    cap: Int | Double = null,
    frontUVs: Vector4 = null,
    instance: Mesh = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    sideOrientation: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonRotation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRotation]
  }
}

