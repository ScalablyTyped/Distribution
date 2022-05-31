package typings.cesium.global.Cesium

import typings.cesium.anon.FragmentShaderSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PolylineColorAppearance")
@js.native
class PolylineColorAppearance ()
  extends typings.cesium.mod.PolylineColorAppearance {
  def this(options: FragmentShaderSource) = this()
}
object PolylineColorAppearance {
  
  @JSGlobal("Cesium.PolylineColorAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.PolylineColorAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: typings.cesium.mod.VertexFormat = js.native
  inline def VERTEX_FORMAT_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
