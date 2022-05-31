package typings.cesium.global.Cesium

import typings.cesium.anon.RenderState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PolylineMaterialAppearance")
@js.native
class PolylineMaterialAppearance ()
  extends typings.cesium.mod.PolylineMaterialAppearance {
  def this(options: RenderState) = this()
}
object PolylineMaterialAppearance {
  
  @JSGlobal("Cesium.PolylineMaterialAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.PolylineMaterialAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: typings.cesium.mod.VertexFormat = js.native
  inline def VERTEX_FORMAT_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
