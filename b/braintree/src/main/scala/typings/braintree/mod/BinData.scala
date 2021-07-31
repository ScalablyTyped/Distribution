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
  
  @scala.inline
  def apply(): BinData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinData]
  }
  
  @scala.inline
  implicit class BinDataMutableBuilder[Self <: BinData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommercial(value: Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommercialUndefined: Self = StObject.set(x, "commercial", js.undefined)
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuanceUndefined: Self = StObject.set(x, "countryOfIssuance", js.undefined)
    
    @scala.inline
    def setDebit(value: Debit): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitUndefined: Self = StObject.set(x, "debit", js.undefined)
    
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulatedUndefined: Self = StObject.set(x, "durbinRegulated", js.undefined)
    
    @scala.inline
    def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcareUndefined: Self = StObject.set(x, "healthcare", js.undefined)
    
    @scala.inline
    def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBankUndefined: Self = StObject.set(x, "issuingBank", js.undefined)
    
    @scala.inline
    def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayrollUndefined: Self = StObject.set(x, "payroll", js.undefined)
    
    @scala.inline
    def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaidUndefined: Self = StObject.set(x, "prepaid", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
