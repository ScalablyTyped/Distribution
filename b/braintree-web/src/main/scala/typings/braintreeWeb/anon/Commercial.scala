package typings.braintreeWeb.anon

import typings.braintreeWeb.googlePaymentMod.GooglePaymentTokenizeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commercial extends js.Object {
  
  var commercial: GooglePaymentTokenizeValues = js.native
  
  var countryOfIssuance: String = js.native
  
  var debit: GooglePaymentTokenizeValues = js.native
  
  var durbinRegulated: GooglePaymentTokenizeValues = js.native
  
  var healthcare: GooglePaymentTokenizeValues = js.native
  
  var issuingBank: GooglePaymentTokenizeValues = js.native
  
  var payroll: GooglePaymentTokenizeValues = js.native
  
  var prepaid: GooglePaymentTokenizeValues = js.native
  
  var productId: String = js.native
}
object Commercial {
  
  @scala.inline
  def apply(
    commercial: GooglePaymentTokenizeValues,
    countryOfIssuance: String,
    debit: GooglePaymentTokenizeValues,
    durbinRegulated: GooglePaymentTokenizeValues,
    healthcare: GooglePaymentTokenizeValues,
    issuingBank: GooglePaymentTokenizeValues,
    payroll: GooglePaymentTokenizeValues,
    prepaid: GooglePaymentTokenizeValues,
    productId: String
  ): Commercial = {
    val __obj = js.Dynamic.literal(commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commercial]
  }
  
  @scala.inline
  implicit class CommercialOps[Self <: Commercial] (val x: Self) extends AnyVal {
    
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
    def setCommercial(value: GooglePaymentTokenizeValues): Self = this.set("commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = this.set("countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: GooglePaymentTokenizeValues): Self = this.set("debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: GooglePaymentTokenizeValues): Self = this.set("durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: GooglePaymentTokenizeValues): Self = this.set("healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: GooglePaymentTokenizeValues): Self = this.set("issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: GooglePaymentTokenizeValues): Self = this.set("payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: GooglePaymentTokenizeValues): Self = this.set("prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
  }
}
