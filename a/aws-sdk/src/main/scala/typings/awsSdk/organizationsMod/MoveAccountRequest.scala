package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveAccountRequest extends js.Object {
  /**
    * The unique identifier (ID) of the account that you want to move. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typings.awsSdk.organizationsMod.AccountId = js.native
  /**
    * The unique identifier (ID) of the root or organizational unit that you want to move the account to. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var DestinationParentId: ParentId = js.native
  /**
    * The unique identifier (ID) of the root or organizational unit that you want to move the account from. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var SourceParentId: ParentId = js.native
}

object MoveAccountRequest {
  @scala.inline
  def apply(AccountId: AccountId, DestinationParentId: ParentId, SourceParentId: ParentId): MoveAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DestinationParentId = DestinationParentId.asInstanceOf[js.Any], SourceParentId = SourceParentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAccountRequest]
  }
  @scala.inline
  implicit class MoveAccountRequestOps[Self <: MoveAccountRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationParentId(value: ParentId): Self = this.set("DestinationParentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceParentId(value: ParentId): Self = this.set("SourceParentId", value.asInstanceOf[js.Any])
  }
  
}

