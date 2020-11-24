package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Master extends js.Object {
  
  /**
    * The ID of the account used as the master account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.native
  
  /**
    * The value used to validate the master account to the member account.
    */
  var InvitationId: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.native
  
  /**
    * The status of the relationship between the master and member accounts.
    */
  var RelationshipStatus: js.UndefOr[String] = js.native
}
object Master {
  
  @scala.inline
  def apply(): Master = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Master]
  }
  
  @scala.inline
  implicit class MasterOps[Self <: Master] (val x: Self) extends AnyVal {
    
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
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = this.set("InvitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationId: Self = this.set("InvitationId", js.undefined)
    
    @scala.inline
    def setInvitedAt(value: String): Self = this.set("InvitedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitedAt: Self = this.set("InvitedAt", js.undefined)
    
    @scala.inline
    def setRelationshipStatus(value: String): Self = this.set("RelationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipStatus: Self = this.set("RelationshipStatus", js.undefined)
  }
}
