package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineMaterialAppearance")
@js.native
class PolylineMaterialAppearance () extends Appearance {
  def this(options: typings.cesium.anon.RenderState) = this()
  
  val vertexFormat: VertexFormat = js.native
}
object PolylineMaterialAppearance {
  
  @JSImport("cesium", "PolylineMaterialAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "PolylineMaterialAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: VertexFormat = js.native
  inline def VERTEX_FORMAT_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
