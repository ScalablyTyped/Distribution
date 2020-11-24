package typings.countryTelephoneData.mod

import typings.countryTelephoneData.countryTelephoneDataBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Country extends js.Object {
  
  var dialCode: String = js.native
  
  /** A format string for phone numbers. **This could be an empty string.** */
  var format: String = js.native
  
  var hasAreaCodes: js.UndefOr[`true`] = js.native
  
  /** The {@link https://w.wiki/4kP |ISO 3166-1 alpha-2} country code (in **lowercase**) */
  var iso2: String = js.native
  
  var name: String = js.native
  
  var priority: Double = js.native
}
object Country {
  
  @scala.inline
  def apply(dialCode: String, format: String, iso2: String, name: String, priority: Double): Country = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
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
    def setDialCode(value: String): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso2(value: String): Self = this.set("iso2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAreaCodes(value: `true`): Self = this.set("hasAreaCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAreaCodes: Self = this.set("hasAreaCodes", js.undefined)
  }
}
