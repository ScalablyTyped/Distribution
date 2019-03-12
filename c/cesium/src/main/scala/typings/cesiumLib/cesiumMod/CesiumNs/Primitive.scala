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
    destroy: () => scala.Unit,
    geometryInstances: js.Array[GeometryInstance] | GeometryInstance,
    getGeometryInstanceAttributes: js.Any => js.Any,
    interleave: scala.Boolean,
    isDestroyed: () => scala.Boolean,
    modelMatrix: Matrix4,
    ready: scala.Boolean,
    readyPromise: js.Promise[Primitive],
    releaseGeometryInstances: scala.Boolean,
    shadows: ShadowMode,
    show: scala.Boolean,
    update: () => scala.Unit,
    vertexCacheOptimize: scala.Boolean
  ): Primitive = {
    val __obj = js.Dynamic.literal(allowPicking = allowPicking, appearance = appearance, asynchronous = asynchronous, compressVertices = compressVertices, cull = cull, debugShowBoundingVolume = debugShowBoundingVolume, depthFailAppearance = depthFailAppearance, destroy = js.Any.fromFunction0(destroy), geometryInstances = geometryInstances.asInstanceOf[js.Any], getGeometryInstanceAttributes = js.Any.fromFunction1(getGeometryInstanceAttributes), interleave = interleave, isDestroyed = js.Any.fromFunction0(isDestroyed), modelMatrix = modelMatrix, ready = ready, readyPromise = readyPromise, releaseGeometryInstances = releaseGeometryInstances, shadows = shadows, show = show, update = js.Any.fromFunction0(update), vertexCacheOptimize = vertexCacheOptimize)
  
    __obj.asInstanceOf[Primitive]
  }
}

