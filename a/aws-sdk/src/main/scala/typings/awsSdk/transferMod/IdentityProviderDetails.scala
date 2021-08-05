package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderDetails extends StObject {
  
  /**
    * Provides the type of InvocationRole used to authenticate the user account.
    */
  var InvocationRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Provides the location of the service endpoint used to authenticate users.
    */
  var Url: js.UndefOr[typings.awsSdk.transferMod.Url] = js.undefined
}
object IdentityProviderDetails {
  
  inline def apply(): IdentityProviderDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderDetails]
  }
  
  extension [Self <: IdentityProviderDetails](x: Self) {
    
    inline def setInvocationRole(value: Role): Self = StObject.set(x, "InvocationRole", value.asInstanceOf[js.Any])
    
    inline def setInvocationRoleUndefined: Self = StObject.set(x, "InvocationRole", js.undefined)
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
