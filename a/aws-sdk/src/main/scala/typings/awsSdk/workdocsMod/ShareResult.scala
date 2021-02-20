package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareResult extends StObject {
  
  /**
    * The ID of the invited user.
    */
  var InviteePrincipalId: js.UndefOr[IdType] = js.native
  
  /**
    * The ID of the principal.
    */
  var PrincipalId: js.UndefOr[IdType] = js.native
  
  /**
    * The role.
    */
  var Role: js.UndefOr[RoleType] = js.native
  
  /**
    * The ID of the resource that was shared.
    */
  var ShareId: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[ShareStatusType] = js.native
  
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[MessageType] = js.native
}
object ShareResult {
  
  @scala.inline
  def apply(): ShareResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareResult]
  }
  
  @scala.inline
  implicit class ShareResultMutableBuilder[Self <: ShareResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInviteePrincipalId(value: IdType): Self = StObject.set(x, "InviteePrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviteePrincipalIdUndefined: Self = StObject.set(x, "InviteePrincipalId", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: IdType): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    @scala.inline
    def setRole(value: RoleType): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setShareId(value: ResourceIdType): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareIdUndefined: Self = StObject.set(x, "ShareId", js.undefined)
    
    @scala.inline
    def setStatus(value: ShareStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: MessageType): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
