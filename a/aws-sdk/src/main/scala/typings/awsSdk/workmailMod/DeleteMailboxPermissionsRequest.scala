package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMailboxPermissionsRequest extends StObject {
  
  /**
    * The identifier of the member (user or group) that owns the mailbox.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The identifier of the member (user or group) for which to delete granted permissions.
    */
  var GranteeId: WorkMailIdentifier
  
  /**
    * The identifier of the organization under which the member (user or group) exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object DeleteMailboxPermissionsRequest {
  
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, GranteeId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteMailboxPermissionsRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], GranteeId = GranteeId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMailboxPermissionsRequest]
  }
  
  @scala.inline
  implicit class DeleteMailboxPermissionsRequestMutableBuilder[Self <: DeleteMailboxPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranteeId(value: WorkMailIdentifier): Self = StObject.set(x, "GranteeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
