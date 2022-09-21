package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionApiKeyAuthResponseParameters extends StObject {
  
  /**
    * The name of the header to use for the APIKeyValue used for authorization.
    */
  var ApiKeyName: js.UndefOr[AuthHeaderParameters] = js.undefined
}
object ConnectionApiKeyAuthResponseParameters {
  
  inline def apply(): ConnectionApiKeyAuthResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionApiKeyAuthResponseParameters]
  }
  
  extension [Self <: ConnectionApiKeyAuthResponseParameters](x: Self) {
    
    inline def setApiKeyName(value: AuthHeaderParameters): Self = StObject.set(x, "ApiKeyName", value.asInstanceOf[js.Any])
    
    inline def setApiKeyNameUndefined: Self = StObject.set(x, "ApiKeyName", js.undefined)
  }
}
