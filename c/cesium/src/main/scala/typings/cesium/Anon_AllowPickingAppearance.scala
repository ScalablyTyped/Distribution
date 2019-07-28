package typings.cesium

import typings.cesium.cesiumMod.Appearance
import typings.cesium.cesiumMod.GeometryInstance
import typings.cesium.cesiumMod.Matrix4
import typings.cesium.cesiumMod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowPickingAppearance extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var appearance: js.UndefOr[Appearance] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var compressVertices: js.UndefOr[Boolean] = js.undefined
  var cull: js.UndefOr[Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var geometryInstances: js.UndefOr[js.Array[_] | GeometryInstance] = js.undefined
  var interleave: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowPickingAppearance {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    appearance: Appearance = null,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    compressVertices: js.UndefOr[Boolean] = js.undefined,
    cull: js.UndefOr[Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    geometryInstances: js.Array[_] | GeometryInstance = null,
    interleave: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null,
    releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined,
    shadows: ShadowMode = null,
    show: js.UndefOr[Boolean] = js.undefined,
    vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowPickingAppearance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking)
    if (appearance != null) __obj.updateDynamic("appearance")(appearance)
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous)
    if (!js.isUndefined(compressVertices)) __obj.updateDynamic("compressVertices")(compressVertices)
    if (!js.isUndefined(cull)) __obj.updateDynamic("cull")(cull)
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (geometryInstances != null) __obj.updateDynamic("geometryInstances")(geometryInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(interleave)) __obj.updateDynamic("interleave")(interleave)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    if (!js.isUndefined(releaseGeometryInstances)) __obj.updateDynamic("releaseGeometryInstances")(releaseGeometryInstances)
    if (shadows != null) __obj.updateDynamic("shadows")(shadows)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(vertexCacheOptimize)) __obj.updateDynamic("vertexCacheOptimize")(vertexCacheOptimize)
    __obj.asInstanceOf[Anon_AllowPickingAppearance]
  }
}

