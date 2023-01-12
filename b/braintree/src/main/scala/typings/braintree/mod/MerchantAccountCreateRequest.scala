package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantAccountCreateRequest extends StObject {
  
  var business: js.UndefOr[MerchantBusinessRequest] = js.undefined
  
  var funding: MerchantFunding
  
  var id: js.UndefOr[String] = js.undefined
  
  var individual: MerchantIndividualRequest
  
  var masterMerchantAccountId: String
  
  var tosAccepted: Boolean
}
object MerchantAccountCreateRequest {
  
  inline def apply(
    funding: MerchantFunding,
    individual: MerchantIndividualRequest,
    masterMerchantAccountId: String,
    tosAccepted: Boolean
  ): MerchantAccountCreateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any], tosAccepted = tosAccepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MerchantAccountCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setBusiness(value: MerchantBusinessRequest): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    inline def setBusinessUndefined: Self = StObject.set(x, "business", js.undefined)
    
    inline def setFunding(value: MerchantFunding): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndividual(value: MerchantIndividualRequest): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    inline def setMasterMerchantAccountId(value: String): Self = StObject.set(x, "masterMerchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setTosAccepted(value: Boolean): Self = StObject.set(x, "tosAccepted", value.asInstanceOf[js.Any])
  }
}
