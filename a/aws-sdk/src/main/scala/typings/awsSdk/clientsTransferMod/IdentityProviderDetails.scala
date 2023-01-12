package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderDetails extends StObject {
  
  /**
    * The identifier of the Directory Service directory that you want to stop sharing.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsTransferMod.DirectoryId] = js.undefined
  
  /**
    * The ARN for a lambda function to use for the Identity provider.
    */
  var Function: js.UndefOr[typings.awsSdk.clientsTransferMod.Function] = js.undefined
  
  /**
    * Provides the type of InvocationRole used to authenticate the user account.
    */
  var InvocationRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Provides the location of the service endpoint used to authenticate users.
    */
  var Url: js.UndefOr[typings.awsSdk.clientsTransferMod.Url] = js.undefined
}
object IdentityProviderDetails {
  
  inline def apply(): IdentityProviderDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProviderDetails] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setFunction(value: Function): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "Function", js.undefined)
    
    inline def setInvocationRole(value: Role): Self = StObject.set(x, "InvocationRole", value.asInstanceOf[js.Any])
    
    inline def setInvocationRoleUndefined: Self = StObject.set(x, "InvocationRole", js.undefined)
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
