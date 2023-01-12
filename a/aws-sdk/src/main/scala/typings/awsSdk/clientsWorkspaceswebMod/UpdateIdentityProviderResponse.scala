package typings.awsSdk.clientsWorkspaceswebMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateIdentityProviderResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
  }
}
