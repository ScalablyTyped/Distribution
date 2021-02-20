package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteMembersRequest extends StObject {
  
  /**
    * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  
  /**
    * The unique ID of the detector of the GuardDuty account that you want to invite members with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * A Boolean value that specifies whether you want to disable email notification to the accounts that you are inviting to GuardDuty as members.
    */
  var DisableEmailNotification: js.UndefOr[Boolean] = js.native
  
  /**
    * The invitation message that you want to send to the accounts that you're inviting to GuardDuty as members.
    */
  var Message: js.UndefOr[String] = js.native
}
object InviteMembersRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): InviteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteMembersRequest]
  }
  
  @scala.inline
  implicit class InviteMembersRequestMutableBuilder[Self <: InviteMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEmailNotification(value: Boolean): Self = StObject.set(x, "DisableEmailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEmailNotificationUndefined: Self = StObject.set(x, "DisableEmailNotification", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
