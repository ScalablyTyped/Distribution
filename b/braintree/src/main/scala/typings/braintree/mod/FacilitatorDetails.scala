package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacilitatorDetails extends StObject {
  
  var oauthApplicationClientId: String
  
  var oauthApplicationName: String
  
  var sourcePaymentMethodToken: String
}
object FacilitatorDetails {
  
  inline def apply(oauthApplicationClientId: String, oauthApplicationName: String, sourcePaymentMethodToken: String): FacilitatorDetails = {
    val __obj = js.Dynamic.literal(oauthApplicationClientId = oauthApplicationClientId.asInstanceOf[js.Any], oauthApplicationName = oauthApplicationName.asInstanceOf[js.Any], sourcePaymentMethodToken = sourcePaymentMethodToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatorDetails]
  }
  
  extension [Self <: FacilitatorDetails](x: Self) {
    
    inline def setOauthApplicationClientId(value: String): Self = StObject.set(x, "oauthApplicationClientId", value.asInstanceOf[js.Any])
    
    inline def setOauthApplicationName(value: String): Self = StObject.set(x, "oauthApplicationName", value.asInstanceOf[js.Any])
    
    inline def setSourcePaymentMethodToken(value: String): Self = StObject.set(x, "sourcePaymentMethodToken", value.asInstanceOf[js.Any])
  }
}
