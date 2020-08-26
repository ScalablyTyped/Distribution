package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGeoLocationRequest extends js.Object {
  /**
    * For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America  
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * For SubdivisionCode, Amazon Route 53 supports only states of the United States. For a list of state abbreviations, see Appendix B: Two–Letter State and Possession Abbreviations on the United States Postal Service website.  If you specify subdivisioncode, you must also specify US for CountryCode. 
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object GetGeoLocationRequest {
  @scala.inline
  def apply(): GetGeoLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeoLocationRequest]
  }
  @scala.inline
  implicit class GetGeoLocationRequestOps[Self <: GetGeoLocationRequest] (val x: Self) extends AnyVal {
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
    def setContinentCode(value: GeoLocationContinentCode): Self = this.set("ContinentCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinentCode: Self = this.set("ContinentCode", js.undefined)
    @scala.inline
    def setCountryCode(value: GeoLocationCountryCode): Self = this.set("CountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("CountryCode", js.undefined)
    @scala.inline
    def setSubdivisionCode(value: GeoLocationSubdivisionCode): Self = this.set("SubdivisionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdivisionCode: Self = this.set("SubdivisionCode", js.undefined)
  }
  
}

