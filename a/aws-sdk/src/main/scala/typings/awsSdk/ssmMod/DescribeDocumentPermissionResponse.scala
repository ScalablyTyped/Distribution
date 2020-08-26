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
  def apply(): DescribeDocumentPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentPermissionResponse]
  }
  @scala.inline
  implicit class DescribeDocumentPermissionResponseOps[Self <: DescribeDocumentPermissionResponse] (val x: Self) extends AnyVal {
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
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIds: Self = this.set("AccountIds", js.undefined)
    @scala.inline
    def setAccountSharingInfoListVarargs(value: AccountSharingInfo*): Self = this.set("AccountSharingInfoList", js.Array(value :_*))
    @scala.inline
    def setAccountSharingInfoList(value: AccountSharingInfoList): Self = this.set("AccountSharingInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountSharingInfoList: Self = this.set("AccountSharingInfoList", js.undefined)
  }
  
}

