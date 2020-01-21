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
  def apply(AccountModifications: AccountModificationList = null, NextToken: PaginationToken = null): DescribeAccountModificationsResult = {
    val __obj = js.Dynamic.literal()
    if (AccountModifications != null) __obj.updateDynamic("AccountModifications")(AccountModifications.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountModificationsResult]
  }
}

