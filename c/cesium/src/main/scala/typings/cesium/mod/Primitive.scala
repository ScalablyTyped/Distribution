package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Primitive")
@js.native
class Primitive () extends js.Object {
  def this(options: typings.cesium.anon.Appearance) = this()
  
  val allowPicking: Boolean = js.native
  
  var appearance: Appearance = js.native
  
  val asynchronous: Boolean = js.native
  
  val compressVertices: Boolean = js.native
  
  var cull: Boolean = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  var depthFailAppearance: Appearance = js.native
  
  def destroy(): Unit = js.native
  
  val geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  
  def getGeometryInstanceAttributes(id: js.Any): js.Any = js.native
  
  val interleave: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  val ready: Boolean = js.native
  
  val readyPromise: js.Promise[Primitive] = js.native
  
  val releaseGeometryInstances: Boolean = js.native
  
  var shadows: ShadowMode = js.native
  
  var show: Boolean = js.native
  
  def update(): Unit = js.native
  
  val vertexCacheOptimize: Boolean = js.native
}
