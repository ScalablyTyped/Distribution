package typings.braintree.anon

import typings.braintree.mod.DurbinRegulated
import typings.braintree.mod.HealthCare
import typings.braintree.mod.Payroll
import typings.braintree.mod.Prepaid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commercial extends StObject {
  
  var bin: String = js.native
  
  var commercial: typings.braintree.mod.Commercial = js.native
  
  var countryOfIssuance: String = js.native
  
  var debit: typings.braintree.mod.Debit = js.native
  
  var durbinRegulated: DurbinRegulated = js.native
  
  var expirationMonth: String = js.native
  
  var expirationYear: String = js.native
  
  var googleTransactionId: String = js.native
  
  var healthcare: HealthCare = js.native
  
  var imageUrl: String = js.native
  
  var payroll: Payroll = js.native
  
  var prepaid: Prepaid = js.native
  
  var productId: String = js.native
  
  var sourceCardLast4: String = js.native
  
  var sourceCardType: String = js.native
  
  var sourceDescription: String = js.native
  
  var token: String = js.native
  
  var virtualCardLast4: String = js.native
  
  var virtualCardType: String = js.native
}
object Commercial {
  
  @scala.inline
  def apply(
    bin: String,
    commercial: typings.braintree.mod.Commercial,
    countryOfIssuance: String,
    debit: typings.braintree.mod.Debit,
    durbinRegulated: DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    googleTransactionId: String,
    healthcare: HealthCare,
    imageUrl: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    sourceCardType: String,
    sourceDescription: String,
    token: String,
    virtualCardLast4: String,
    virtualCardType: String
  ): Commercial = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], googleTransactionId = googleTransactionId.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], sourceCardType = sourceCardType.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], virtualCardLast4 = virtualCardLast4.asInstanceOf[js.Any], virtualCardType = virtualCardType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commercial]
  }
  
  @scala.inline
  implicit class CommercialMutableBuilder[Self <: Commercial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommercial(value: typings.braintree.mod.Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: typings.braintree.mod.Debit): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleTransactionId(value: String): Self = StObject.set(x, "googleTransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCardLast4(value: String): Self = StObject.set(x, "sourceCardLast4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCardType(value: String): Self = StObject.set(x, "sourceCardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDescription(value: String): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualCardLast4(value: String): Self = StObject.set(x, "virtualCardLast4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualCardType(value: String): Self = StObject.set(x, "virtualCardType", value.asInstanceOf[js.Any])
  }
}
