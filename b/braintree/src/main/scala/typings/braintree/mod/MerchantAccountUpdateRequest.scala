package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantAccountUpdateRequest extends StObject {
  
  var business: js.UndefOr[MerchantBusinessRequest] = js.native
  
  var funding: MerchantFunding = js.native
  
  var id: String = js.native
  
  var individual: MerchantIndividualRequest = js.native
  
  var masterMerchantAccountId: String = js.native
}
object MerchantAccountUpdateRequest {
  
  @scala.inline
  def apply(
    funding: MerchantFunding,
    id: String,
    individual: MerchantIndividualRequest,
    masterMerchantAccountId: String
  ): MerchantAccountUpdateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountUpdateRequest]
  }
  
  @scala.inline
  implicit class MerchantAccountUpdateRequestMutableBuilder[Self <: MerchantAccountUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusiness(value: MerchantBusinessRequest): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessUndefined: Self = StObject.set(x, "business", js.undefined)
    
    @scala.inline
    def setFunding(value: MerchantFunding): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividual(value: MerchantIndividualRequest): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterMerchantAccountId(value: String): Self = StObject.set(x, "masterMerchantAccountId", value.asInstanceOf[js.Any])
  }
}
