package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMailboxQuotaRequest extends js.Object {
  
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
  implicit class UpdateMailboxQuotaRequestOps[Self <: UpdateMailboxQuotaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMailboxQuota(value: MailboxQuota): Self = this.set("MailboxQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
}
