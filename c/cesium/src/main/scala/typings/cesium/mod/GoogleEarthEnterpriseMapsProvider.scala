package typings.cesium.mod

import typings.cesium.anon.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GoogleEarthEnterpriseMapsProvider")
@js.native
class GoogleEarthEnterpriseMapsProvider protected () extends ImageryProvider {
  def this(options: Channel) = this()
  
  val channel: Double = js.native
  
  val path: String = js.native
  
  val requestType: String = js.native
  
  val url: String = js.native
  
  val version: Double = js.native
}
object GoogleEarthEnterpriseMapsProvider {
  
  @JSImport("cesium", "GoogleEarthEnterpriseMapsProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "GoogleEarthEnterpriseMapsProvider.logoUrl")
  @js.native
  def logoUrl: String = js.native
  inline def logoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(x.asInstanceOf[js.Any])
}
