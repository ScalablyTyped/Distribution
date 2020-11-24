package typings.cesium.mod

import typings.cesium.anon.Crs
import typings.cesium.anon.Format
import typings.cesium.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
class WebMapServiceImageryProvider protected () extends ImageryProvider {
  def this(options: Crs) = this()
  
  val url: String = js.native
}
/* static members */
@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
object WebMapServiceImageryProvider extends js.Object {
  
  var DefaultParameters: Format = js.native
  
  var GetFeatureInfoDefaultParameters: Request = js.native
}
