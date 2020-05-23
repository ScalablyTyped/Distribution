package typings.babylonjs.anon

import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points extends js.Object {
  var colors: js.UndefOr[js.Array[Color4]] = js.undefined
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.undefined
  var points: js.Array[Vector3]
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}

object Points {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    colors: js.Array[Color4] = null,
    instance: js.UndefOr[Null | Nullable[LinesMesh]] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[Boolean] = js.undefined
  ): Points = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(instance)) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
}

