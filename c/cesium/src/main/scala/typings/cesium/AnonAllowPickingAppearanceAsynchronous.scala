package typings.cesium

import typings.cesium.mod.Appearance
import typings.cesium.mod.ClassificationType
import typings.cesium.mod.GeometryInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowPickingAppearanceAsynchronous extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var appearance: js.UndefOr[Appearance] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var classificationType: js.UndefOr[ClassificationType] = js.undefined
  var compressVertices: js.UndefOr[Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugShowShadowVolume: js.UndefOr[Boolean] = js.undefined
  var geometryInstances: js.UndefOr[js.Array[_] | GeometryInstance] = js.undefined
  var interleave: js.UndefOr[Boolean] = js.undefined
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowPickingAppearanceAsynchronous {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    appearance: Appearance = null,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    classificationType: ClassificationType = null,
    compressVertices: js.UndefOr[Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugShowShadowVolume: js.UndefOr[Boolean] = js.undefined,
    geometryInstances: js.Array[_] | GeometryInstance = null,
    interleave: js.UndefOr[Boolean] = js.undefined,
    releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowPickingAppearanceAsynchronous = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (!js.isUndefined(compressVertices)) __obj.updateDynamic("compressVertices")(compressVertices.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowShadowVolume)) __obj.updateDynamic("debugShowShadowVolume")(debugShowShadowVolume.asInstanceOf[js.Any])
    if (geometryInstances != null) __obj.updateDynamic("geometryInstances")(geometryInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(interleave)) __obj.updateDynamic("interleave")(interleave.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseGeometryInstances)) __obj.updateDynamic("releaseGeometryInstances")(releaseGeometryInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(vertexCacheOptimize)) __obj.updateDynamic("vertexCacheOptimize")(vertexCacheOptimize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowPickingAppearanceAsynchronous]
  }
}

