package typings.cesium.mod

import typings.cesium.anon.AboveGround
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
class EllipsoidSurfaceAppearance () extends Appearance {
  def this(options: AboveGround) = this()
  
  val aboveGround: Boolean = js.native
  
  val faceForward: Boolean = js.native
  
  val flat: Boolean = js.native
  
  val vertexFormat: VertexFormat = js.native
}
object EllipsoidSurfaceAppearance {
  
  @JSImport("cesium", "EllipsoidSurfaceAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "EllipsoidSurfaceAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: VertexFormat = js.native
  @scala.inline
  def VERTEX_FORMAT_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
