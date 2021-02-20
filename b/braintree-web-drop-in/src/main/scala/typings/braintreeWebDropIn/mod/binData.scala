package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.No
import typings.braintreeWebDropIn.braintreeWebDropInStrings.Unknown
import typings.braintreeWebDropIn.braintreeWebDropInStrings.Yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait binData extends StObject {
  
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
  implicit class binDataMutableBuilder[Self <: binData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommercial(value: String): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: Yes | No | Unknown): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: Yes | No | Unknown): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: Yes | No | Unknown): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: Yes | No | Unknown): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: Yes | No | Unknown): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
