package typings.cesium.global.Cesium

import typings.cesium.anon.DebugShowShadowVolume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.GroundPolylinePrimitive")
@js.native
class GroundPolylinePrimitive protected ()
  extends typings.cesium.mod.GroundPolylinePrimitive {
  def this(options: DebugShowShadowVolume) = this()
}
object GroundPolylinePrimitive {
  
  @JSGlobal("Cesium.GroundPolylinePrimitive")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def initializeTerrainHeights(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeTerrainHeights")().asInstanceOf[js.Promise[js.Any]]
  
  /* static member */
  inline def isSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
