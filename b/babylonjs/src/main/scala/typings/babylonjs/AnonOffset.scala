package typings.babylonjs

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Mesh
import typings.babylonjs.BABYLON.Vector2
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var closeArray: js.UndefOr[Boolean] = js.undefined
  var closePath: js.UndefOr[Boolean] = js.undefined
  var colors: js.UndefOr[js.Array[Color4]] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var instance: js.UndefOr[Mesh] = js.undefined
  var invertUV: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var pathArray: js.Array[js.Array[Vector3]]
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var uvs: js.UndefOr[js.Array[Vector2]] = js.undefined
}

object AnonOffset {
  @scala.inline
  def apply(
    pathArray: js.Array[js.Array[Vector3]],
    backUVs: Vector4 = null,
    closeArray: js.UndefOr[Boolean] = js.undefined,
    closePath: js.UndefOr[Boolean] = js.undefined,
    colors: js.Array[Color4] = null,
    frontUVs: Vector4 = null,
    instance: Mesh = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    sideOrientation: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    uvs: js.Array[Vector2] = null
  ): AnonOffset = {
    val __obj = js.Dynamic.literal(pathArray = pathArray.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(closeArray)) __obj.updateDynamic("closeArray")(closeArray.asInstanceOf[js.Any])
    if (!js.isUndefined(closePath)) __obj.updateDynamic("closePath")(closePath.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (uvs != null) __obj.updateDynamic("uvs")(uvs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

