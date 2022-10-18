package typings.braintree.anon

import typings.braintree.mod.HealthCare
import typings.braintree.mod.Payroll
import typings.braintree.mod.Prepaid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardType extends StObject {
  
  var bin: String
  
  var cardType: String
  
  var cardholderName: String
  
  var commercial: typings.braintree.mod.Commercial
  
  var countryOfIssuance: String
  
  var debit: typings.braintree.mod.Debit
  
  var durbinRegulated: typings.braintree.mod.DurbinRegulated
  
  var expirationMonth: String
  
  var expirationYear: String
  
  var healthcare: HealthCare
  
  var imageUrl: String
  
  var issuingBank: String
  
  var last4: String
  
  var paymentInsuranceName: String
  
  var payroll: Payroll
  
  var prepaid: Prepaid
  
  var productId: String
  
  var sourceDescription: String
  
  var token: String
}
object CardType {
  
  inline def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    commercial: typings.braintree.mod.Commercial,
    countryOfIssuance: String,
    debit: typings.braintree.mod.Debit,
    durbinRegulated: typings.braintree.mod.DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    healthcare: HealthCare,
    imageUrl: String,
    issuingBank: String,
    last4: String,
    paymentInsuranceName: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceDescription: String,
    token: String
  ): CardType = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], paymentInsuranceName = paymentInsuranceName.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardType]
  }
  
  extension [Self <: CardType](x: Self) {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCommercial(value: typings.braintree.mod.Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: typings.braintree.mod.Debit): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulated(value: typings.braintree.mod.DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setPaymentInsuranceName(value: String): Self = StObject.set(x, "paymentInsuranceName", value.asInstanceOf[js.Any])
    
    inline def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    inline def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setSourceDescription(value: String): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
