package typings.braintreeWeb.hostedFieldsMod

import typings.braintreeWeb.anon.RegulationEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsTokenizePayload extends StObject {
  
  /**
    * Provides details about regulatory environment.
    * See https://developer.paypal.com/braintree/docs/guides/3d-secure/migration/javascript/v3#authentication-insight.
    */
  var authenticationInsight: js.UndefOr[RegulationEnvironment] = js.undefined
  
  var description: String
  
  var details: HostedFieldsAccountDetails
  
  var nonce: String
  
  var `type`: String
}
object HostedFieldsTokenizePayload {
  
  inline def apply(description: String, details: HostedFieldsAccountDetails, nonce: String, `type`: String): HostedFieldsTokenizePayload = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsTokenizePayload]
  }
  
  extension [Self <: HostedFieldsTokenizePayload](x: Self) {
    
    inline def setAuthenticationInsight(value: RegulationEnvironment): Self = StObject.set(x, "authenticationInsight", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationInsightUndefined: Self = StObject.set(x, "authenticationInsight", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: HostedFieldsAccountDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
