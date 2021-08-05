package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMailboxPermissionsRequest extends StObject {
  
  /**
    * The identifier of the user, group, or resource for which to update mailbox permissions.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The identifier of the user, group, or resource to which to grant the permissions.
    */
  var GranteeId: WorkMailIdentifier
  
  /**
    * The identifier of the organization under which the user, group, or resource exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
  
  /**
    * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
    */
  var PermissionValues: typings.awsSdk.workmailMod.PermissionValues
}
object PutMailboxPermissionsRequest {
  
  inline def apply(
    EntityId: WorkMailIdentifier,
    GranteeId: WorkMailIdentifier,
    OrganizationId: OrganizationId,
    PermissionValues: PermissionValues
  ): PutMailboxPermissionsRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], GranteeId = GranteeId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], PermissionValues = PermissionValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMailboxPermissionsRequest]
  }
  
  extension [Self <: PutMailboxPermissionsRequest](x: Self) {
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setGranteeId(value: WorkMailIdentifier): Self = StObject.set(x, "GranteeId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setPermissionValues(value: PermissionValues): Self = StObject.set(x, "PermissionValues", value.asInstanceOf[js.Any])
    
    inline def setPermissionValuesVarargs(value: PermissionType*): Self = StObject.set(x, "PermissionValues", js.Array(value :_*))
  }
}
