package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Country extends js.Object {
  
  /**
    * The country code of the remote IP address.
    */
  var CountryCode: js.UndefOr[String] = js.native
  
  /**
    * The country name of the remote IP address.
    */
  var CountryName: js.UndefOr[String] = js.native
}
object Country {
  
  @scala.inline
  def apply(): Country = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("CountryCode", js.undefined)
    
    @scala.inline
    def setCountryName(value: String): Self = this.set("CountryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryName: Self = this.set("CountryName", js.undefined)
  }
}
