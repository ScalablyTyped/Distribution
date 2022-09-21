package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAuthResponseParameters extends StObject {
  
  /**
    * The API Key parameters to use for authorization.
    */
  var ApiKeyAuthParameters: js.UndefOr[ConnectionApiKeyAuthResponseParameters] = js.undefined
  
  /**
    * The authorization parameters for Basic authorization.
    */
  var BasicAuthParameters: js.UndefOr[ConnectionBasicAuthResponseParameters] = js.undefined
  
  /**
    * Additional parameters for the connection that are passed through with every invocation to the HTTP endpoint.
    */
  var InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
  
  /**
    * The OAuth parameters to use for authorization.
    */
  var OAuthParameters: js.UndefOr[ConnectionOAuthResponseParameters] = js.undefined
}
object ConnectionAuthResponseParameters {
  
  inline def apply(): ConnectionAuthResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAuthResponseParameters]
  }
  
  extension [Self <: ConnectionAuthResponseParameters](x: Self) {
    
    inline def setApiKeyAuthParameters(value: ConnectionApiKeyAuthResponseParameters): Self = StObject.set(x, "ApiKeyAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setApiKeyAuthParametersUndefined: Self = StObject.set(x, "ApiKeyAuthParameters", js.undefined)
    
    inline def setBasicAuthParameters(value: ConnectionBasicAuthResponseParameters): Self = StObject.set(x, "BasicAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthParametersUndefined: Self = StObject.set(x, "BasicAuthParameters", js.undefined)
    
    inline def setInvocationHttpParameters(value: ConnectionHttpParameters): Self = StObject.set(x, "InvocationHttpParameters", value.asInstanceOf[js.Any])
    
    inline def setInvocationHttpParametersUndefined: Self = StObject.set(x, "InvocationHttpParameters", js.undefined)
    
    inline def setOAuthParameters(value: ConnectionOAuthResponseParameters): Self = StObject.set(x, "OAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setOAuthParametersUndefined: Self = StObject.set(x, "OAuthParameters", js.undefined)
  }
}
