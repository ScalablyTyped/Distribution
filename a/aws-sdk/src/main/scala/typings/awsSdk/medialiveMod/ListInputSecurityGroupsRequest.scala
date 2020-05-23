package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputSecurityGroupsRequest extends js.Object {
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListInputSecurityGroupsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: string = null): ListInputSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputSecurityGroupsRequest]
  }
}

