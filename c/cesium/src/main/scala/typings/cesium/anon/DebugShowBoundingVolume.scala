package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugShowBoundingVolume extends js.Object {
  var center: js.UndefOr[Cartesian3] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var material: js.UndefOr[typings.cesium.mod.Material] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var radii: js.UndefOr[Cartesian3] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object DebugShowBoundingVolume {
  @scala.inline
  def apply(
    center: Cartesian3 = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    id: js.Any = null,
    material: typings.cesium.mod.Material = null,
    modelMatrix: Matrix4 = null,
    radii: Cartesian3 = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): DebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugShowBoundingVolume]
  }
}

