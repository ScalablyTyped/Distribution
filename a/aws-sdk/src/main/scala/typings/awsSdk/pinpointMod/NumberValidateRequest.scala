package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberValidateRequest extends js.Object {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var IsoCountryCode: js.UndefOr[string] = js.native
  
  /**
    * The phone number to retrieve information about. The phone number that you provide should include a valid numeric country code. Otherwise, the operation might result in an error.
    */
  var PhoneNumber: js.UndefOr[string] = js.native
}
object NumberValidateRequest {
  
  @scala.inline
  def apply(): NumberValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberValidateRequest]
  }
  
  @scala.inline
  implicit class NumberValidateRequestOps[Self <: NumberValidateRequest] (val x: Self) extends AnyVal {
    
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
    def setIsoCountryCode(value: string): Self = this.set("IsoCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsoCountryCode: Self = this.set("IsoCountryCode", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: string): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
  }
}
