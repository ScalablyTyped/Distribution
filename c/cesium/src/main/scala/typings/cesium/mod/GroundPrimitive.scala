package typings.cesium.mod

import typings.cesium.anon.CompressVertices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GroundPrimitive")
@js.native
class GroundPrimitive protected () extends StObject {
  def this(options: CompressVertices) = this()
  
  val allowPicking: Boolean = js.native
  
  var appearance: Appearance = js.native
  
  val asynchronous: Boolean = js.native
  
  var classificationType: ClassificationType = js.native
  
  val compressVertices: Boolean = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  var debugShowShadowVolume: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  val geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  
  def getGeometryInstanceAttributes(id: js.Any): GeometryInstance = js.native
  
  val interleave: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val ready: Boolean = js.native
  
  val readyPromise: js.Promise[GroundPrimitive] = js.native
  
  val releaseGeometryInstances: Boolean = js.native
  
  var show: Boolean = js.native
  
  def update(): Unit = js.native
  
  val vertexCacheOptimize: Boolean = js.native
}
object GroundPrimitive {
  
  @JSImport("cesium", "GroundPrimitive")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def initializeTerrainHeights(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeTerrainHeights")().asInstanceOf[js.Promise[js.Any]]
  
  /* static member */
  @scala.inline
  def isSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def supportsMaterials(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMaterials")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
