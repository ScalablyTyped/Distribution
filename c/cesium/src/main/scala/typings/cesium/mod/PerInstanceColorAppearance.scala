package typings.cesium.mod

import typings.cesium.anon.Flat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerInstanceColorAppearance")
@js.native
class PerInstanceColorAppearance () extends Appearance {
  def this(options: Flat) = this()
  
  val faceForward: Boolean = js.native
  
  val flat: Boolean = js.native
  
  val vertexFormat: VertexFormat = js.native
}
object PerInstanceColorAppearance {
  
  @JSImport("cesium", "PerInstanceColorAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "PerInstanceColorAppearance.FLAT_VERTEX_FORMAT")
  @js.native
  def FLAT_VERTEX_FORMAT: VertexFormat = js.native
  inline def FLAT_VERTEX_FORMAT_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAT_VERTEX_FORMAT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "PerInstanceColorAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: VertexFormat = js.native
  inline def VERTEX_FORMAT_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
