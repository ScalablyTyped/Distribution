package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Primitive")
@js.native
class Primitive () extends js.Object {
  def this(options: cesiumLib.Anon_AllowPickingAppearance) = this()
  val allowPicking: scala.Boolean = js.native
  var appearance: Appearance = js.native
  val asynchronous: scala.Boolean = js.native
  val compressVertices: scala.Boolean = js.native
  var cull: scala.Boolean = js.native
  var debugShowBoundingVolume: scala.Boolean = js.native
  var depthFailAppearance: Appearance = js.native
  val geometryInstances: js.Array[GeometryInstance] | GeometryInstance = js.native
  val interleave: scala.Boolean = js.native
  var modelMatrix: Matrix4 = js.native
  val ready: scala.Boolean = js.native
  val readyPromise: js.Promise[Primitive] = js.native
  val releaseGeometryInstances: scala.Boolean = js.native
  var shadows: ShadowMode = js.native
  var show: scala.Boolean = js.native
  val vertexCacheOptimize: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def getGeometryInstanceAttributes(id: js.Any): js.Any = js.native
  def isDestroyed(): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

