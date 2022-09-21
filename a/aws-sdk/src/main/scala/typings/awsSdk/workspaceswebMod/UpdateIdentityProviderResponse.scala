package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIdentityProviderResponse extends StObject {
  
  /**
    * The identity provider.
    */
  var identityProvider: IdentityProvider
}
object UpdateIdentityProviderResponse {
  
  inline def apply(identityProvider: IdentityProvider): UpdateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderResponse]
  }
  
  extension [Self <: UpdateIdentityProviderResponse](x: Self) {
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
  }
}
