package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIdentityProviderResponse extends StObject {
  
  /**
    * The identity provider object.
    */
  var IdentityProvider: IdentityProviderType = js.native
}
object UpdateIdentityProviderResponse {
  
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): UpdateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderResponse]
  }
  
  @scala.inline
  implicit class UpdateIdentityProviderResponseMutableBuilder[Self <: UpdateIdentityProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
