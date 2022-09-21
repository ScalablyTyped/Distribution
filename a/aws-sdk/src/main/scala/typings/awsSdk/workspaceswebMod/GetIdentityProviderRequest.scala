package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityProviderRequest extends StObject {
  
  /**
    * The ARN of the identity provider.
    */
  var identityProviderArn: ARN
}
object GetIdentityProviderRequest {
  
  inline def apply(identityProviderArn: ARN): GetIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(identityProviderArn = identityProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderRequest]
  }
  
  extension [Self <: GetIdentityProviderRequest](x: Self) {
    
    inline def setIdentityProviderArn(value: ARN): Self = StObject.set(x, "identityProviderArn", value.asInstanceOf[js.Any])
  }
}
