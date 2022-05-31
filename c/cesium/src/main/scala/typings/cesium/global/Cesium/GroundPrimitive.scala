package typings.cesium.global.Cesium

import typings.cesium.anon.CompressVertices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.GroundPrimitive")
@js.native
class GroundPrimitive protected ()
  extends typings.cesium.mod.GroundPrimitive {
  def this(options: CompressVertices) = this()
}
object GroundPrimitive {
  
  @JSGlobal("Cesium.GroundPrimitive")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def initializeTerrainHeights(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeTerrainHeights")().asInstanceOf[js.Promise[js.Any]]
  
  /* static member */
  inline def isSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def supportsMaterials(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMaterials")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
