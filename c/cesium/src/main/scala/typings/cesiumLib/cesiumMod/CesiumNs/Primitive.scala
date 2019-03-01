package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Primitive extends js.Object {
  val allowPicking: scala.Boolean
  var appearance: Appearance
  val asynchronous: scala.Boolean
  val compressVertices: scala.Boolean
  var cull: scala.Boolean
  var debugShowBoundingVolume: scala.Boolean
  var depthFailAppearance: Appearance
  val geometryInstances: js.Array[GeometryInstance] | GeometryInstance
  val interleave: scala.Boolean
  var modelMatrix: Matrix4
  val ready: scala.Boolean
  val readyPromise: js.Promise[Primitive]
  val releaseGeometryInstances: scala.Boolean
  var shadows: ShadowMode
  var show: scala.Boolean
  val vertexCacheOptimize: scala.Boolean
  def destroy(): scala.Unit
  def getGeometryInstanceAttributes(id: js.Any): js.Any
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

object Primitive {
  @scala.inline
  def apply(
    allowPicking: scala.Boolean,
    appearance: Appearance,
    asynchronous: scala.Boolean,
    compressVertices: scala.Boolean,
    cull: scala.Boolean,
    debugShowBoundingVolume: scala.Boolean,
    depthFailAppearance: Appearance,
    destroy: js.Function0[scala.Unit],
    geometryInstances: js.Array[GeometryInstance] | GeometryInstance,
    getGeometryInstanceAttributes: js.Function1[js.Any, js.Any],
    interleave: scala.Boolean,
    isDestroyed: js.Function0[scala.Boolean],
    modelMatrix: Matrix4,
    ready: scala.Boolean,
    readyPromise: js.Promise[Primitive],
    releaseGeometryInstances: scala.Boolean,
    shadows: ShadowMode,
    show: scala.Boolean,
    update: js.Function0[scala.Unit],
    vertexCacheOptimize: scala.Boolean
  ): Primitive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowPicking")(allowPicking)
    __obj.updateDynamic("appearance")(appearance)
    __obj.updateDynamic("asynchronous")(asynchronous)
    __obj.updateDynamic("compressVertices")(compressVertices)
    __obj.updateDynamic("cull")(cull)
    __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    __obj.updateDynamic("depthFailAppearance")(depthFailAppearance)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("geometryInstances")(geometryInstances.asInstanceOf[js.Any])
    __obj.updateDynamic("getGeometryInstanceAttributes")(getGeometryInstanceAttributes)
    __obj.updateDynamic("interleave")(interleave)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("readyPromise")(readyPromise)
    __obj.updateDynamic("releaseGeometryInstances")(releaseGeometryInstances)
    __obj.updateDynamic("shadows")(shadows)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("vertexCacheOptimize")(vertexCacheOptimize)
    __obj.asInstanceOf[Primitive]
  }
}

