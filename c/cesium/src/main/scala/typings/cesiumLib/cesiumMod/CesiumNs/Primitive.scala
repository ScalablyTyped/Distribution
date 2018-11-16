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
  val readyPromise: stdLib.Promise[Primitive]
  val releaseGeometryInstances: scala.Boolean
  var shadows: ShadowMode
  var show: scala.Boolean
  val vertexCacheOptimize: scala.Boolean
  def destroy(): scala.Unit
  def getGeometryInstanceAttributes(id: js.Any): js.Any
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

