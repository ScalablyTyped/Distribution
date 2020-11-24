package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityProviderByIdentifierResponse extends js.Object {
  
  /**
    * The identity provider object.
    */
  var IdentityProvider: IdentityProviderType = js.native
}
object GetIdentityProviderByIdentifierResponse {
  
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): GetIdentityProviderByIdentifierResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierResponse]
  }
  
  @scala.inline
  implicit class GetIdentityProviderByIdentifierResponseOps[Self <: GetIdentityProviderByIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityProvider(value: IdentityProviderType): Self = this.set("IdentityProvider", value.asInstanceOf[js.Any])
  }
}
