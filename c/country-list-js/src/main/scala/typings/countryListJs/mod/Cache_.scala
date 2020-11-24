package typings.countryListJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache_ extends js.Object {
  
  var capital: js.UndefOr[CountriesMap] = js.native
  
  var currency: js.UndefOr[CountriesMap] = js.native
  
  var iso3: js.UndefOr[CountriesMap] = js.native
  
  var name: js.UndefOr[CountriesMap] = js.native
  
  var province: js.UndefOr[CountriesMap] = js.native
}
object Cache_ {
  
  @scala.inline
  def apply(): Cache_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache_]
  }
  
  @scala.inline
  implicit class Cache_Ops[Self <: Cache_] (val x: Self) extends AnyVal {
    
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
    def setCapital(value: CountriesMap): Self = this.set("capital", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapital: Self = this.set("capital", js.undefined)
    
    @scala.inline
    def setCurrency(value: CountriesMap): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setIso3(value: CountriesMap): Self = this.set("iso3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIso3: Self = this.set("iso3", js.undefined)
    
    @scala.inline
    def setName(value: CountriesMap): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProvince(value: CountriesMap): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
  }
}
