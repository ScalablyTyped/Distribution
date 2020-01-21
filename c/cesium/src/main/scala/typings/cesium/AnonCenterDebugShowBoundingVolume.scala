package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Material
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenterDebugShowBoundingVolume extends js.Object {
  var center: js.UndefOr[Cartesian3] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var radii: js.UndefOr[Cartesian3] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonCenterDebugShowBoundingVolume {
  @scala.inline
  def apply(
    center: Cartesian3 = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    id: js.Any = null,
    material: Material = null,
    modelMatrix: Matrix4 = null,
    radii: Cartesian3 = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): AnonCenterDebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenterDebugShowBoundingVolume]
  }
}

