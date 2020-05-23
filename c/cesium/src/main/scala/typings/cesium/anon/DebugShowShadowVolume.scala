package typings.cesium.anon

import typings.cesium.mod.GeometryInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugShowShadowVolume extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var appearance: js.UndefOr[typings.cesium.mod.Appearance] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var classificationType: js.UndefOr[typings.cesium.mod.ClassificationType] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugShowShadowVolume: js.UndefOr[Boolean] = js.undefined
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.undefined
  var interleave: js.UndefOr[Boolean] = js.undefined
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object DebugShowShadowVolume {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    appearance: typings.cesium.mod.Appearance = null,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    classificationType: typings.cesium.mod.ClassificationType = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugShowShadowVolume: js.UndefOr[Boolean] = js.undefined,
    geometryInstances: js.Array[GeometryInstance] | GeometryInstance = null,
    interleave: js.UndefOr[Boolean] = js.undefined,
    releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined
  ): DebugShowShadowVolume = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.get.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.get.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowShadowVolume)) __obj.updateDynamic("debugShowShadowVolume")(debugShowShadowVolume.get.asInstanceOf[js.Any])
    if (geometryInstances != null) __obj.updateDynamic("geometryInstances")(geometryInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(interleave)) __obj.updateDynamic("interleave")(interleave.get.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseGeometryInstances)) __obj.updateDynamic("releaseGeometryInstances")(releaseGeometryInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugShowShadowVolume]
  }
}

