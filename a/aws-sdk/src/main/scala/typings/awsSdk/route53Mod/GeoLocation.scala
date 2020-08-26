package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocation extends js.Object {
  /**
    * The two-letter code for the continent. Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America   Constraint: Specifying ContinentCode with either CountryCode or SubdivisionCode returns an InvalidInput error.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * For geolocation resource record sets, the two-letter code for a country. Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * For geolocation resource record sets, the two-letter code for a state of the United States. Route 53 doesn't support any other values for SubdivisionCode. For a list of state abbreviations, see Appendix B: Two–Letter State and Possession Abbreviations on the United States Postal Service website.  If you specify subdivisioncode, you must also specify US for CountryCode. 
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object GeoLocation {
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  @scala.inline
  implicit class GeoLocationOps[Self <: GeoLocation] (val x: Self) extends AnyVal {
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

