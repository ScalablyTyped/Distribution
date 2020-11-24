package typings.countryCodeLookup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryCode extends js.Object {
  
  var capital: String = js.native
  
  var continent: String = js.native
  
  var country: String = js.native
  
  var fips: String = js.native
  
  var internet: String = js.native
  
  var iso2: String = js.native
  
  var iso3: String = js.native
  
  var isoNo: String = js.native
  
  var region: String = js.native
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
  
  @scala.inline
  implicit class CountryCodeOps[Self <: CountryCode] (val x: Self) extends AnyVal {
    
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
    def setCapital(value: String): Self = this.set("capital", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinent(value: String): Self = this.set("continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFips(value: String): Self = this.set("fips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternet(value: String): Self = this.set("internet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso2(value: String): Self = this.set("iso2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso3(value: String): Self = this.set("iso3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoNo(value: String): Self = this.set("isoNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
  }
}
