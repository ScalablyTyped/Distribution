package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMailboxQuotaRequest extends StObject {
  
  /**
    * The updated mailbox quota, in MB, for the specified user.
    */
  var MailboxQuota: typings.awsSdk.workmailMod.MailboxQuota = js.native
  
  /**
    * The identifier for the organization that contains the user for whom to update the mailbox quota.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The identifer for the user for whom to update the mailbox quota.
    */
  var UserId: WorkMailIdentifier = js.native
}
object UpdateMailboxQuotaRequest {
  
  @scala.inline
  def apply(MailboxQuota: MailboxQuota, OrganizationId: OrganizationId, UserId: WorkMailIdentifier): UpdateMailboxQuotaRequest = {
    val __obj = js.Dynamic.literal(MailboxQuota = MailboxQuota.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMailboxQuotaRequest]
  }
  
  @scala.inline
  implicit class UpdateMailboxQuotaRequestMutableBuilder[Self <: UpdateMailboxQuotaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMailboxQuota(value: MailboxQuota): Self = StObject.set(x, "MailboxQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
