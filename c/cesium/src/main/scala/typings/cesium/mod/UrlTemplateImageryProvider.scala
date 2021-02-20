package typings.cesium.mod

import typings.cesium.anon.GetFeatureInfoFormats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "UrlTemplateImageryProvider")
@js.native
class UrlTemplateImageryProvider protected () extends ImageryProvider {
  def this(options: GetFeatureInfoFormats) = this()
  
  var ellipsoid: Ellipsoid = js.native
  
  var enablePickFeatures: Boolean = js.native
  
  var getFeatureInfoFormats: js.Array[GetFeatureInfoFormat] = js.native
  
  var pickFeaturesUrl: String = js.native
  
  def reinitialize(options: js.Object): Unit = js.native
  def reinitialize(options: js.Promise[js.Object]): Unit = js.native
  
  var subdomains: String | js.Array[String] = js.native
  
  var url: String = js.native
}
