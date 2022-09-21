package typings.braintreeWeb.anon

import typings.braintreeWeb.applePayMod.ApplePayTokenizeValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commercial extends StObject {
  
  var commercial: ApplePayTokenizeValues
  
  var countryOfIssuance: String
  
  var debit: ApplePayTokenizeValues
  
  var durbinRegulated: ApplePayTokenizeValues
  
  var healthcare: ApplePayTokenizeValues
  
  var issuingBank: ApplePayTokenizeValues
  
  var payroll: ApplePayTokenizeValues
  
  var prepaid: ApplePayTokenizeValues
  
  var productId: String
}
object Commercial {
  
  inline def apply(
    commercial: ApplePayTokenizeValues,
    countryOfIssuance: String,
    debit: ApplePayTokenizeValues,
    durbinRegulated: ApplePayTokenizeValues,
    healthcare: ApplePayTokenizeValues,
    issuingBank: ApplePayTokenizeValues,
    payroll: ApplePayTokenizeValues,
    prepaid: ApplePayTokenizeValues,
    productId: String
  ): Commercial = {
    val __obj = js.Dynamic.literal(commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commercial]
  }
  
  extension [Self <: Commercial](x: Self) {
    
    inline def setCommercial(value: ApplePayTokenizeValues): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: ApplePayTokenizeValues): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulated(value: ApplePayTokenizeValues): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setHealthcare(value: ApplePayTokenizeValues): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    inline def setIssuingBank(value: ApplePayTokenizeValues): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    inline def setPayroll(value: ApplePayTokenizeValues): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    inline def setPrepaid(value: ApplePayTokenizeValues): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
