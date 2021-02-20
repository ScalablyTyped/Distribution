package typings.cesium.mod

import typings.cesium.anon.DebugShowShadowVolume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GroundPolylinePrimitive")
@js.native
class GroundPolylinePrimitive protected () extends StObject {
  def this(options: DebugShowShadowVolume) = this()
  
  val allowPicking: Boolean = js.native
  
  var appearance: Appearance = js.native
  
  val asynchronous: Boolean = js.native
  
  var classificationType: ClassificationType = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  val debugShowShadowVolume: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  val geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  
  def getGeometryInstanceAttributes(id: js.Any): GeometryInstance = js.native
  
  val interleave: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val ready: Boolean = js.native
  
  val readyPromise: js.Promise[GroundPolylinePrimitive] = js.native
  
  val releaseGeometryInstances: Boolean = js.native
  
  var show: Boolean = js.native
  
  def update(): Unit = js.native
}
object GroundPolylinePrimitive {
  
  /* static member */
  @JSImport("cesium", "GroundPolylinePrimitive.initializeTerrainHeights")
  @js.native
  def initializeTerrainHeights(): js.Promise[_] = js.native
  
  /* static member */
  @JSImport("cesium", "GroundPolylinePrimitive.isSupported")
  @js.native
  def isSupported(scene: Scene): Boolean = js.native
}
