package typings.countryListJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Country extends js.Object {
  
  var capital: String = js.native
  
  var code: CountryCode = js.native
  
  var continent: String = js.native
  
  var currency: Currency = js.native
  
  var dialing_code: String = js.native
  
  var name: String = js.native
  
  var provinces: js.Array[Province] = js.native
  
  var region: String = js.native
}
object Country {
  
  @scala.inline
  def apply(
    capital: String,
    code: CountryCode,
    continent: String,
    currency: Currency,
    dialing_code: String,
    name: String,
    provinces: js.Array[Province],
    region: String
  ): Country = {
    val __obj = js.Dynamic.literal(capital = capital.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], continent = continent.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dialing_code = dialing_code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provinces = provinces.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
    
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
    def setCode(value: CountryCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinent(value: String): Self = this.set("continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Currency): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialing_code(value: String): Self = this.set("dialing_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvincesVarargs(value: Province*): Self = this.set("provinces", js.Array(value :_*))
    
    @scala.inline
    def setProvinces(value: js.Array[Province]): Self = this.set("provinces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
  }
}
