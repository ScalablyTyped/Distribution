package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantFunding extends StObject {
  
  var accountNumber: js.UndefOr[String] = js.undefined
  
  var accountNumberLast4: js.UndefOr[String] = js.undefined
  
  var descriptor: js.UndefOr[String] = js.undefined
  
  var destination: String
  
  var email: js.UndefOr[String] = js.undefined
  
  var mobilePhone: js.UndefOr[String] = js.undefined
  
  var routingNumber: js.UndefOr[String] = js.undefined
}
object MerchantFunding {
  
  @scala.inline
  def apply(destination: String): MerchantFunding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantFunding]
  }
  
  @scala.inline
  implicit class MerchantFundingMutableBuilder[Self <: MerchantFunding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNumberLast4(value: String): Self = StObject.set(x, "accountNumberLast4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNumberLast4Undefined: Self = StObject.set(x, "accountNumberLast4", js.undefined)
    
    @scala.inline
    def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    @scala.inline
    def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setMobilePhone(value: String): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    @scala.inline
    def setRoutingNumber(value: String): Self = StObject.set(x, "routingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingNumberUndefined: Self = StObject.set(x, "routingNumber", js.undefined)
  }
}
