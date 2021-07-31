package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebsiteAuthorizationProviderResponse extends StObject {
  
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.undefined
}
object AssociateWebsiteAuthorizationProviderResponse {
  
  @scala.inline
  def apply(): AssociateWebsiteAuthorizationProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderResponse]
  }
  
  @scala.inline
  implicit class AssociateWebsiteAuthorizationProviderResponseMutableBuilder[Self <: AssociateWebsiteAuthorizationProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationProviderId(value: Id): Self = StObject.set(x, "AuthorizationProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationProviderIdUndefined: Self = StObject.set(x, "AuthorizationProviderId", js.undefined)
  }
}
