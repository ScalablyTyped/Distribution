package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowPickingAppearance extends js.Object {
  var allowPicking: js.UndefOr[scala.Boolean] = js.undefined
  var appearance: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Appearance] = js.undefined
  var asynchronous: js.UndefOr[scala.Boolean] = js.undefined
  var compressVertices: js.UndefOr[scala.Boolean] = js.undefined
  var cull: js.UndefOr[scala.Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined
  var geometryInstances: js.UndefOr[js.Array[_] | cesiumLib.cesiumMod.CesiumNs.GeometryInstance] = js.undefined
  var interleave: js.UndefOr[scala.Boolean] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Matrix4] = js.undefined
  var releaseGeometryInstances: js.UndefOr[scala.Boolean] = js.undefined
  var shadows: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.ShadowMode] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var vertexCacheOptimize: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowPickingAppearance {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[scala.Boolean] = js.undefined,
    appearance: cesiumLib.cesiumMod.CesiumNs.Appearance = null,
    asynchronous: js.UndefOr[scala.Boolean] = js.undefined,
    compressVertices: js.UndefOr[scala.Boolean] = js.undefined,
    cull: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined,
    geometryInstances: js.Array[_] | cesiumLib.cesiumMod.CesiumNs.GeometryInstance = null,
    interleave: js.UndefOr[scala.Boolean] = js.undefined,
    modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = null,
    releaseGeometryInstances: js.UndefOr[scala.Boolean] = js.undefined,
    shadows: cesiumLib.cesiumMod.CesiumNs.ShadowMode = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    vertexCacheOptimize: js.UndefOr[scala.Boolean] = js.undefined
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

