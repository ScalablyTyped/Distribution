package typings.cesium.anon

import typings.cesium.mod.GeometryInstance
import typings.cesium.mod.Matrix4
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appearance extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var appearance: js.UndefOr[typings.cesium.mod.Appearance] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var compressVertices: js.UndefOr[Boolean] = js.undefined
  var cull: js.UndefOr[Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.undefined
  var interleave: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
}

object Appearance {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    appearance: typings.cesium.mod.Appearance = null,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    compressVertices: js.UndefOr[Boolean] = js.undefined,
    cull: js.UndefOr[Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    geometryInstances: js.Array[GeometryInstance] | GeometryInstance = null,
    interleave: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null,
    releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined,
    shadows: ShadowMode = null,
    show: js.UndefOr[Boolean] = js.undefined,
    vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
  ): Appearance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.get.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compressVertices)) __obj.updateDynamic("compressVertices")(compressVertices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cull)) __obj.updateDynamic("cull")(cull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.get.asInstanceOf[js.Any])
    if (geometryInstances != null) __obj.updateDynamic("geometryInstances")(geometryInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(interleave)) __obj.updateDynamic("interleave")(interleave.get.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseGeometryInstances)) __obj.updateDynamic("releaseGeometryInstances")(releaseGeometryInstances.get.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertexCacheOptimize)) __obj.updateDynamic("vertexCacheOptimize")(vertexCacheOptimize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearance]
  }
}

