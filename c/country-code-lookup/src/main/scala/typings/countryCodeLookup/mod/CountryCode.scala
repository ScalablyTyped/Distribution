package typings.countryCodeLookup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryCode extends js.Object {
  var capital: String
  var continent: String
  var country: String
  var fips: String
  var internet: String
  var iso2: String
  var iso3: String
  var isoNo: String
  var region: String
}

object CountryCode {
  @scala.inline
  def apply(
    capital: String,
    continent: String,
    country: String,
    fips: String,
    internet: String,
    iso2: String,
    iso3: String,
    isoNo: String,
    region: String
  ): CountryCode = {
    val __obj = js.Dynamic.literal(capital = capital.asInstanceOf[js.Any], continent = continent.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fips = fips.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], iso3 = iso3.asInstanceOf[js.Any], isoNo = isoNo.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryCode]
  }
}

