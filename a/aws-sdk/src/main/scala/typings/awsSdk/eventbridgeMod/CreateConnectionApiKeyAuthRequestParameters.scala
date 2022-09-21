package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionApiKeyAuthRequestParameters extends StObject {
  
  /**
    * The name of the API key to use for authorization.
    */
  var ApiKeyName: AuthHeaderParameters
  
  /**
    * The value for the API key to use for authorization.
    */
  var ApiKeyValue: AuthHeaderParameters
}
object CreateConnectionApiKeyAuthRequestParameters {
  
  inline def apply(ApiKeyName: AuthHeaderParameters, ApiKeyValue: AuthHeaderParameters): CreateConnectionApiKeyAuthRequestParameters = {
    val __obj = js.Dynamic.literal(ApiKeyName = ApiKeyName.asInstanceOf[js.Any], ApiKeyValue = ApiKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionApiKeyAuthRequestParameters]
  }
  
  extension [Self <: CreateConnectionApiKeyAuthRequestParameters](x: Self) {
    
    inline def setApiKeyName(value: AuthHeaderParameters): Self = StObject.set(x, "ApiKeyName", value.asInstanceOf[js.Any])
    
    inline def setApiKeyValue(value: AuthHeaderParameters): Self = StObject.set(x, "ApiKeyValue", value.asInstanceOf[js.Any])
  }
}
