package typings.cesium.global.Cesium

import typings.cesium.anon.AspectRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.OrthographicFrustum")
@js.native
class OrthographicFrustum ()
  extends typings.cesium.mod.OrthographicFrustum {
  def this(options: AspectRatio) = this()
}
object OrthographicFrustum {
  
  @JSGlobal("Cesium.OrthographicFrustum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.OrthographicFrustum.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
}
