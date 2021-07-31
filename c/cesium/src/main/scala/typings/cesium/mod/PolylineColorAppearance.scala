package typings.cesium.mod

import typings.cesium.anon.FragmentShaderSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineColorAppearance")
@js.native
class PolylineColorAppearance () extends Appearance {
  def this(options: FragmentShaderSource) = this()
  
  val vertexFormat: VertexFormat = js.native
}
object PolylineColorAppearance {
  
  @JSImport("cesium", "PolylineColorAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "PolylineColorAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: VertexFormat = js.native
  @scala.inline
  def VERTEX_FORMAT_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
