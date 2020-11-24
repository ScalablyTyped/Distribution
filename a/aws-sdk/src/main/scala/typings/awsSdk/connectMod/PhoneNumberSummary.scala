package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the phone number.
    */
  var Id: js.UndefOr[PhoneNumberId] = js.native
  
  /**
    * The phone number.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.connectMod.PhoneNumber] = js.native
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberCountryCode] = js.native
  
  /**
    * The type of phone number.
    */
  var PhoneNumberType: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberType] = js.native
}
object PhoneNumberSummary {
  
  @scala.inline
  def apply(): PhoneNumberSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberSummary]
  }
  
  @scala.inline
  implicit class PhoneNumberSummaryOps[Self <: PhoneNumberSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setId(value: PhoneNumberId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = this.set("PhoneNumberCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberCountryCode: Self = this.set("PhoneNumberCountryCode", js.undefined)
    
    @scala.inline
    def setPhoneNumberType(value: PhoneNumberType): Self = this.set("PhoneNumberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberType: Self = this.set("PhoneNumberType", js.undefined)
  }
}
