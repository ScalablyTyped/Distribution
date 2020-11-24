package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends js.Object {
  
  /**
    * The ID of the member account.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId = js.native
  
  /**
    * The detector ID of the member account.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.guarddutyMod.DetectorId] = js.native
  
  /**
    * The email address of the member account.
    */
  var Email: typings.awsSdk.guarddutyMod.Email = js.native
  
  /**
    * The timestamp when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.native
  
  /**
    * The master account ID.
    */
  var MasterId: String = js.native
  
  /**
    * The status of the relationship between the member and the master.
    */
  var RelationshipStatus: String = js.native
  
  /**
    * The last-updated timestamp of the member.
    */
  var UpdatedAt: String = js.native
}
object Member {
  
  @scala.inline
  def apply(
    AccountId: AccountId,
    Email: Email,
    MasterId: String,
    RelationshipStatus: String,
    UpdatedAt: String
  ): Member = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any], RelationshipStatus = RelationshipStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterId(value: String): Self = this.set("MasterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipStatus(value: String): Self = this.set("RelationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorId: Self = this.set("DetectorId", js.undefined)
    
    @scala.inline
    def setInvitedAt(value: String): Self = this.set("InvitedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitedAt: Self = this.set("InvitedAt", js.undefined)
  }
}
