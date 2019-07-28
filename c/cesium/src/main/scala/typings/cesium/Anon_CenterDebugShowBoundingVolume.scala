package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Material
import typings.cesium.cesiumMod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterDebugShowBoundingVolume extends js.Object {
  var center: js.UndefOr[Cartesian3] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var radii: js.UndefOr[Cartesian3] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_CenterDebugShowBoundingVolume {
  @scala.inline
  def apply(
    center: Cartesian3 = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    id: js.Any = null,
    material: Material = null,
    modelMatrix: Matrix4 = null,
    radii: Cartesian3 = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_CenterDebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (id != null) __obj.updateDynamic("id")(id)
    if (material != null) __obj.updateDynamic("material")(material)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    if (radii != null) __obj.updateDynamic("radii")(radii)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_CenterDebugShowBoundingVolume]
  }
}

