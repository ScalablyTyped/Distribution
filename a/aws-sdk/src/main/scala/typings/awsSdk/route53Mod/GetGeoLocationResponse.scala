package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGeoLocationResponse extends js.Object {
  /**
    * A complex type that contains the codes and full continent, country, and subdivision names for the specified geolocation code.
    */
  var GeoLocationDetails: typings.awsSdk.route53Mod.GeoLocationDetails = js.native
}

object GetGeoLocationResponse {
  @scala.inline
  def apply(GeoLocationDetails: GeoLocationDetails): GetGeoLocationResponse = {
    val __obj = js.Dynamic.literal(GeoLocationDetails = GeoLocationDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoLocationResponse]
  }
}

