package typings.babylonjs

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.LinesMesh
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsInstance extends js.Object {
  var colors: js.UndefOr[js.Array[Color4]] = js.undefined
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.undefined
  var points: js.Array[Vector3]
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}

object AnonColorsInstance {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    colors: js.Array[Color4] = null,
    instance: Nullable[LinesMesh] = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[Boolean] = js.undefined
  ): AnonColorsInstance = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsInstance]
  }
}

