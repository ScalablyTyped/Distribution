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
}

