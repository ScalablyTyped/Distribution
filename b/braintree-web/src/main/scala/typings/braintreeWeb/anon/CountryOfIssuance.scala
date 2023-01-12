package typings.braintreeWeb.anon

import typings.braintreeWeb.modulesGooglePaymentMod.GooglePaymentTokenizeValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryOfIssuance extends StObject {
  
  var commercial: GooglePaymentTokenizeValues
  
  var countryOfIssuance: String
  
  var debit: GooglePaymentTokenizeValues
  
  var durbinRegulated: GooglePaymentTokenizeValues
  
  var healthcare: GooglePaymentTokenizeValues
  
  var issuingBank: GooglePaymentTokenizeValues
  
  var payroll: GooglePaymentTokenizeValues
  
  var prepaid: GooglePaymentTokenizeValues
  
  var productId: String
}
object CountryOfIssuance {
  
  inline def apply(
    commercial: GooglePaymentTokenizeValues,
    countryOfIssuance: String,
    debit: GooglePaymentTokenizeValues,
    durbinRegulated: GooglePaymentTokenizeValues,
    healthcare: GooglePaymentTokenizeValues,
    issuingBank: GooglePaymentTokenizeValues,
    payroll: GooglePaymentTokenizeValues,
    prepaid: GooglePaymentTokenizeValues,
    productId: String
  ): CountryOfIssuance = {
    val __obj = js.Dynamic.literal(commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryOfIssuance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountryOfIssuance] (val x: Self) extends AnyVal {
    
    inline def setCommercial(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulated(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setHealthcare(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    inline def setIssuingBank(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    inline def setPayroll(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    inline def setPrepaid(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
