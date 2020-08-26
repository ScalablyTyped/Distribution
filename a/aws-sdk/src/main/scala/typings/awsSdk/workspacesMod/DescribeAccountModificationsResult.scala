package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountModificationsResult extends js.Object {
  /**
    * The list of modifications to the configuration of BYOL.
    */
  var AccountModifications: js.UndefOr[AccountModificationList] = js.native
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeAccountModificationsResult {
  @scala.inline
  def apply(): DescribeAccountModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountModificationsResult]
  }
  @scala.inline
  implicit class DescribeAccountModificationsResultOps[Self <: DescribeAccountModificationsResult] (val x: Self) extends AnyVal {
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
    def setAccountModificationsVarargs(value: AccountModification*): Self = this.set("AccountModifications", js.Array(value :_*))
    @scala.inline
    def setAccountModifications(value: AccountModificationList): Self = this.set("AccountModifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountModifications: Self = this.set("AccountModifications", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

