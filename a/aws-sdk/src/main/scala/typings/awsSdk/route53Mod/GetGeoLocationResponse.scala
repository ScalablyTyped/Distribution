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
  @scala.inline
  implicit class GetGeoLocationResponseOps[Self <: GetGeoLocationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeoLocationDetails(value: GeoLocationDetails): Self = this.set("GeoLocationDetails", value.asInstanceOf[js.Any])
  }
  
}

