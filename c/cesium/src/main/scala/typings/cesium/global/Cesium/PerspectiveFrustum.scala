package typings.cesium.global.Cesium

import typings.cesium.anon.Far
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PerspectiveFrustum")
@js.native
class PerspectiveFrustum ()
  extends typings.cesium.mod.PerspectiveFrustum {
  def this(options: Far) = this()
}
object PerspectiveFrustum {
  
  @JSGlobal("Cesium.PerspectiveFrustum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.PerspectiveFrustum.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
}
