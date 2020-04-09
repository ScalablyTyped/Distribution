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
  def apply(
    ContinentCode: GeoLocationContinentCode = null,
    CountryCode: GeoLocationCountryCode = null,
    SubdivisionCode: GeoLocationSubdivisionCode = null
  ): GeoLocation = {
    val __obj = js.Dynamic.literal()
    if (ContinentCode != null) __obj.updateDynamic("ContinentCode")(ContinentCode.asInstanceOf[js.Any])
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode.asInstanceOf[js.Any])
    if (SubdivisionCode != null) __obj.updateDynamic("SubdivisionCode")(SubdivisionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocation]
  }
}

