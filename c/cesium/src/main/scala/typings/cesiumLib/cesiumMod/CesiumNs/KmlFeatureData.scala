package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlFeatureData extends js.Object {
  var address: java.lang.String
  var author: cesiumLib.Anon_Email
  var extendedData: java.lang.String
  var link: cesiumLib.Anon_Href
  var phoneNumber: java.lang.String
  var snippet: java.lang.String
}

object KmlFeatureData {
  @scala.inline
  def apply(
    address: java.lang.String,
    author: cesiumLib.Anon_Email,
    extendedData: java.lang.String,
    link: cesiumLib.Anon_Href,
    phoneNumber: java.lang.String,
    snippet: java.lang.String
  ): KmlFeatureData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("extendedData")(extendedData)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[KmlFeatureData]
  }
}

