package typings.cesium

import typings.cesium.mod.Appearance
import typings.cesium.mod.ClassificationType
import typings.cesium.mod.GeometryInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebugShowShadowVolume extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var appearance: js.UndefOr[Appearance] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var classificationType: js.UndefOr[ClassificationType] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugShowShadowVolume: js.UndefOr[Boolean] = js.undefined
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.undefined
  var interleave: js.UndefOr[Boolean] = js.undefined
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonDebugShowShadowVolume {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    appearance: Appearance = null,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    classificationType: ClassificationType = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugShowShadowVolume: js.UndefOr[Boolean] = js.undefined,
    geometryInstances: js.Array[GeometryInstance] | GeometryInstance = null,
    interleave: js.UndefOr[Boolean] = js.undefined,
    releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined
  ): AnonDebugShowShadowVolume = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowShadowVolume)) __obj.updateDynamic("debugShowShadowVolume")(debugShowShadowVolume.asInstanceOf[js.Any])
    if (geometryInstances != null) __obj.updateDynamic("geometryInstances")(geometryInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(interleave)) __obj.updateDynamic("interleave")(interleave.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseGeometryInstances)) __obj.updateDynamic("releaseGeometryInstances")(releaseGeometryInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebugShowShadowVolume]
  }
}

