package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberSummary extends StObject {
  
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
  implicit class PhoneNumberSummaryMutableBuilder[Self <: PhoneNumberSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: PhoneNumberId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = StObject.set(x, "PhoneNumberCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberCountryCodeUndefined: Self = StObject.set(x, "PhoneNumberCountryCode", js.undefined)
    
    @scala.inline
    def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberTypeUndefined: Self = StObject.set(x, "PhoneNumberType", js.undefined)
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
