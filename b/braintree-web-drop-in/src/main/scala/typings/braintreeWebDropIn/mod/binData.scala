package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.No
import typings.braintreeWebDropIn.braintreeWebDropInStrings.Unknown
import typings.braintreeWebDropIn.braintreeWebDropInStrings.Yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait binData extends js.Object {
  
  var commercial: String = js.native
  
  var countryOfIssuance: String = js.native
  
  var debit: Yes | No | Unknown = js.native
  
  var durbinRegulated: Yes | No | Unknown = js.native
  
  var healthcare: Yes | No | Unknown = js.native
  
  var issuingBank: String = js.native
  
  var payroll: Yes | No | Unknown = js.native
  
  var prepaid: Yes | No | Unknown = js.native
  
  var productId: String = js.native
}
object binData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class binDataOps[Self <: binData] (val x: Self) extends AnyVal {
    
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
    def setCommercial(value: String): Self = this.set("commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = this.set("countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: Yes | No | Unknown): Self = this.set("debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: Yes | No | Unknown): Self = this.set("durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: Yes | No | Unknown): Self = this.set("healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = this.set("issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: Yes | No | Unknown): Self = this.set("payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: Yes | No | Unknown): Self = this.set("prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
  }
}
