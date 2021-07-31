package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIdentityProviderResponse extends StObject {
  
  /**
    * The newly created identity provider object.
    */
  var IdentityProvider: IdentityProviderType
}
object CreateIdentityProviderResponse {
  
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): CreateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderResponse]
  }
  
  @scala.inline
  implicit class CreateIdentityProviderResponseMutableBuilder[Self <: CreateIdentityProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
