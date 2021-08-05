package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinData extends StObject {
  
  var commercial: js.UndefOr[Commercial] = js.undefined
  
  var countryOfIssuance: js.UndefOr[String] = js.undefined
  
  var debit: js.UndefOr[Debit] = js.undefined
  
  var durbinRegulated: js.UndefOr[DurbinRegulated] = js.undefined
  
  var healthcare: js.UndefOr[HealthCare] = js.undefined
  
  var issuingBank: js.UndefOr[String] = js.undefined
  
  var payroll: js.UndefOr[Payroll] = js.undefined
  
  var prepaid: js.UndefOr[Prepaid] = js.undefined
  
  var productId: js.UndefOr[String] = js.undefined
}
object BinData {
  
  inline def apply(): BinData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinData]
  }
  
  extension [Self <: BinData](x: Self) {
    
    inline def setCommercial(value: Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    inline def setCommercialUndefined: Self = StObject.set(x, "commercial", js.undefined)
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuanceUndefined: Self = StObject.set(x, "countryOfIssuance", js.undefined)
    
    inline def setDebit(value: Debit): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    inline def setDebitUndefined: Self = StObject.set(x, "debit", js.undefined)
    
    inline def setDurbinRegulated(value: DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulatedUndefined: Self = StObject.set(x, "durbinRegulated", js.undefined)
    
    inline def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    inline def setHealthcareUndefined: Self = StObject.set(x, "healthcare", js.undefined)
    
    inline def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    inline def setIssuingBankUndefined: Self = StObject.set(x, "issuingBank", js.undefined)
    
    inline def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    inline def setPayrollUndefined: Self = StObject.set(x, "payroll", js.undefined)
    
    inline def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    inline def setPrepaidUndefined: Self = StObject.set(x, "prepaid", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
