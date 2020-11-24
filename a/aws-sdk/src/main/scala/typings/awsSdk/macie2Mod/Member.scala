package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends js.Object {
  
  /**
    * The AWS account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the account.
    */
  var arn: js.UndefOr[string] = js.native
  
  /**
    * The email address for the account.
    */
  var email: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
    */
  var invitedAt: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The AWS account ID for the master account.
    */
  var masterAccountId: js.UndefOr[string] = js.native
  
  /**
    * The current status of the relationship between the account and the master account.
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.native
  
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the account in Amazon Macie.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the relationship between the account and the master account.
    */
  var updatedAt: js.UndefOr[timestampIso8601] = js.native
}
object Member {
  
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setEmail(value: string): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setInvitedAt(value: timestampIso8601): Self = this.set("invitedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitedAt: Self = this.set("invitedAt", js.undefined)
    
    @scala.inline
    def setMasterAccountId(value: string): Self = this.set("masterAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterAccountId: Self = this.set("masterAccountId", js.undefined)
    
    @scala.inline
    def setRelationshipStatus(value: RelationshipStatus): Self = this.set("relationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipStatus: Self = this.set("relationshipStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: timestampIso8601): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
}
