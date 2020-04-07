package typings.babylonjs

import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstance extends js.Object {
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.undefined
  var lines: js.Array[js.Array[Vector3]]
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}

object AnonInstance {
  @scala.inline
  def apply(
    lines: js.Array[js.Array[Vector3]],
    colors: Nullable[js.Array[js.Array[Color4]]] = null,
    instance: Nullable[LinesMesh] = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[Boolean] = js.undefined
  ): AnonInstance = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstance]
  }
}

