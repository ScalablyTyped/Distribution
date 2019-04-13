package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "UrlTemplateImageryProvider")
@js.native
class UrlTemplateImageryProvider protected () extends ImageryProvider {
  def this(options: cesiumLib.Anon_CreditEllipsoidEnablePickFeatures) = this()
  var ellipsoid: Ellipsoid = js.native
  var enablePickFeatures: scala.Boolean = js.native
  var getFeatureInfoFormats: js.Array[GetFeatureInfoFormat] = js.native
  var pickFeaturesUrl: java.lang.String = js.native
  var subdomains: java.lang.String | js.Array[java.lang.String] = js.native
  var url: java.lang.String = js.native
  def reinitialize(options: js.Object): scala.Unit = js.native
  def reinitialize(options: js.Promise[js.Object]): scala.Unit = js.native
}

