package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityProviderByIdentifierResponse extends StObject {
  
  /**
    * The identity provider object.
    */
  var IdentityProvider: IdentityProviderType
}
object GetIdentityProviderByIdentifierResponse {
  
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): GetIdentityProviderByIdentifierResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierResponse]
  }
  
  @scala.inline
  implicit class GetIdentityProviderByIdentifierResponseMutableBuilder[Self <: GetIdentityProviderByIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
