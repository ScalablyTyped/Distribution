package typings.cesium.global.Cesium

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ShowGeometryInstanceAttribute")
@js.native
class ShowGeometryInstanceAttribute ()
  extends typings.cesium.mod.ShowGeometryInstanceAttribute {
  def this(show: Boolean) = this()
}
object ShowGeometryInstanceAttribute {
  
  @JSGlobal("Cesium.ShowGeometryInstanceAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def toValue(show: Boolean): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(show.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def toValue(show: Boolean, result: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(show.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
