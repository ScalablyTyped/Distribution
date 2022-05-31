package typings.cesium.global.Cesium

import typings.cesium.anon.AboveGround
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.EllipsoidSurfaceAppearance")
@js.native
class EllipsoidSurfaceAppearance ()
  extends typings.cesium.mod.EllipsoidSurfaceAppearance {
  def this(options: AboveGround) = this()
}
object EllipsoidSurfaceAppearance {
  
  @JSGlobal("Cesium.EllipsoidSurfaceAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.EllipsoidSurfaceAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: typings.cesium.mod.VertexFormat = js.native
  inline def VERTEX_FORMAT_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
