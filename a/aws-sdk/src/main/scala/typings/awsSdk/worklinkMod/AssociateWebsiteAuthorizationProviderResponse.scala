package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateWebsiteAuthorizationProviderResponse extends js.Object {
  
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.native
}
object AssociateWebsiteAuthorizationProviderResponse {
  
  @scala.inline
  def apply(): AssociateWebsiteAuthorizationProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderResponse]
  }
  
  @scala.inline
  implicit class AssociateWebsiteAuthorizationProviderResponseOps[Self <: AssociateWebsiteAuthorizationProviderResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationProviderId(value: Id): Self = this.set("AuthorizationProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationProviderId: Self = this.set("AuthorizationProviderId", js.undefined)
  }
}
