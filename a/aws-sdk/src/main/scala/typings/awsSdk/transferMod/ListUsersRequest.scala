package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersRequest extends js.Object {
  /**
    * Specifies the number of users to return as a response to the ListUsers request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transferMod.MaxResults] = js.native
  /**
    * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional users.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.native
  /**
    * A system-assigned unique identifier for a file transfer protocol-enabled server that has users assigned to it.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}

object ListUsersRequest {
  @scala.inline
  def apply(ServerId: ServerId, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListUsersRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersRequest]
  }
}

