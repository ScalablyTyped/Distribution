package typings.cesium.global.Cesium

import typings.cesium.anon.Flat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PerInstanceColorAppearance")
@js.native
class PerInstanceColorAppearance ()
  extends typings.cesium.mod.PerInstanceColorAppearance {
  def this(options: Flat) = this()
}
object PerInstanceColorAppearance {
  
  @JSGlobal("Cesium.PerInstanceColorAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.PerInstanceColorAppearance.FLAT_VERTEX_FORMAT")
  @js.native
  def FLAT_VERTEX_FORMAT: typings.cesium.mod.VertexFormat = js.native
  inline def FLAT_VERTEX_FORMAT_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAT_VERTEX_FORMAT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.PerInstanceColorAppearance.VERTEX_FORMAT")
  @js.native
  def VERTEX_FORMAT: typings.cesium.mod.VertexFormat = js.native
  inline def VERTEX_FORMAT_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_FORMAT")(x.asInstanceOf[js.Any])
}
