package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentPermissionResponse extends js.Object {
  /**
    * The account IDs that have permission to use this document. The ID can be either an AWS account or All.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
  /**
    * A list of AWS accounts where the current document is shared and the version shared with each account.
    */
  var AccountSharingInfoList: js.UndefOr[typings.awsSdk.ssmMod.AccountSharingInfoList] = js.native
}

object DescribeDocumentPermissionResponse {
  @scala.inline
  def apply(AccountIds: AccountIdList = null, AccountSharingInfoList: AccountSharingInfoList = null): DescribeDocumentPermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds.asInstanceOf[js.Any])
    if (AccountSharingInfoList != null) __obj.updateDynamic("AccountSharingInfoList")(AccountSharingInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentPermissionResponse]
  }
}

