package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIdentityProviderResponse extends StObject {
  
  /**
    * The ARN of the identity provider.
    */
  var identityProviderArn: ARN
}
object CreateIdentityProviderResponse {
  
  inline def apply(identityProviderArn: ARN): CreateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(identityProviderArn = identityProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderResponse]
  }
  
  extension [Self <: CreateIdentityProviderResponse](x: Self) {
    
    inline def setIdentityProviderArn(value: ARN): Self = StObject.set(x, "identityProviderArn", value.asInstanceOf[js.Any])
  }
}
