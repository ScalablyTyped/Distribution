package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareResult extends StObject {
  
  /**
    * The ID of the invited user.
    */
  var InviteePrincipalId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The ID of the principal.
    */
  var PrincipalId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The role.
    */
  var Role: js.UndefOr[RoleType] = js.undefined
  
  /**
    * The ID of the resource that was shared.
    */
  var ShareId: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[ShareStatusType] = js.undefined
  
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[MessageType] = js.undefined
}
object ShareResult {
  
  inline def apply(): ShareResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareResult] (val x: Self) extends AnyVal {
    
    inline def setInviteePrincipalId(value: IdType): Self = StObject.set(x, "InviteePrincipalId", value.asInstanceOf[js.Any])
    
    inline def setInviteePrincipalIdUndefined: Self = StObject.set(x, "InviteePrincipalId", js.undefined)
    
    inline def setPrincipalId(value: IdType): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setRole(value: RoleType): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setShareId(value: ResourceIdType): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdUndefined: Self = StObject.set(x, "ShareId", js.undefined)
    
    inline def setStatus(value: ShareStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: MessageType): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
