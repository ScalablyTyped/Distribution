package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMailboxQuotaRequest extends StObject {
  
  /**
    * The updated mailbox quota, in MB, for the specified user.
    */
  var MailboxQuota: typings.awsSdk.clientsWorkmailMod.MailboxQuota
  
  /**
    * The identifier for the organization that contains the user for whom to update the mailbox quota.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The identifer for the user for whom to update the mailbox quota.
    */
  var UserId: WorkMailIdentifier
}
object UpdateMailboxQuotaRequest {
  
  inline def apply(MailboxQuota: MailboxQuota, OrganizationId: OrganizationId, UserId: WorkMailIdentifier): UpdateMailboxQuotaRequest = {
    val __obj = js.Dynamic.literal(MailboxQuota = MailboxQuota.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMailboxQuotaRequest]
  }
  
  extension [Self <: UpdateMailboxQuotaRequest](x: Self) {
    
    inline def setMailboxQuota(value: MailboxQuota): Self = StObject.set(x, "MailboxQuota", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
