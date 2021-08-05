package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.No
import typings.braintreeWebDropIn.braintreeWebDropInStrings.Unknown
import typings.braintreeWebDropIn.braintreeWebDropInStrings.Yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait binData extends StObject {
  
  var commercial: String
  
  var countryOfIssuance: String
  
  var debit: Yes | No | Unknown
  
  var durbinRegulated: Yes | No | Unknown
  
  var healthcare: Yes | No | Unknown
  
  var issuingBank: String
  
  var payroll: Yes | No | Unknown
  
  var prepaid: Yes | No | Unknown
  
  var productId: String
}
object binData {
  
  inline def apply(
    commercial: String,
    countryOfIssuance: String,
    debit: Yes | No | Unknown,
    durbinRegulated: Yes | No | Unknown,
    healthcare: Yes | No | Unknown,
    issuingBank: String,
    payroll: Yes | No | Unknown,
    prepaid: Yes | No | Unknown,
    productId: String
  ): binData = {
    val __obj = js.Dynamic.literal(commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[binData]
  }
  
  extension [Self <: binData](x: Self) {
    
    inline def setCommercial(value: String): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: Yes | No | Unknown): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulated(value: Yes | No | Unknown): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setHealthcare(value: Yes | No | Unknown): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    inline def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    inline def setPayroll(value: Yes | No | Unknown): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    inline def setPrepaid(value: Yes | No | Unknown): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
