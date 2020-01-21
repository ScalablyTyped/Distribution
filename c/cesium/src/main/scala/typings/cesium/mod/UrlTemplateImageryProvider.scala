package typings.cesium.mod

import typings.cesium.AnonCreditEllipsoidEnablePickFeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "UrlTemplateImageryProvider")
@js.native
class UrlTemplateImageryProvider protected () extends ImageryProvider {
  def this(options: AnonCreditEllipsoidEnablePickFeatures) = this()
  var ellipsoid: Ellipsoid = js.native
  var enablePickFeatures: Boolean = js.native
  var getFeatureInfoFormats: js.Array[GetFeatureInfoFormat] = js.native
  var pickFeaturesUrl: String = js.native
  var subdomains: String | js.Array[String] = js.native
  var url: String = js.native
  def reinitialize(options: js.Object): Unit = js.native
  def reinitialize(options: js.Promise[js.Object]): Unit = js.native
}

