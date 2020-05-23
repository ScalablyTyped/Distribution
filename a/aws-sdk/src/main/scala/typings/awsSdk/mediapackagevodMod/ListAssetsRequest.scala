package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssetsRequest extends js.Object {
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackagevodMod.MaxResults] = js.native
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Returns Assets associated with the specified PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
}

object ListAssetsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: string = null,
    PackagingGroupId: string = null
  ): ListAssetsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetsRequest]
  }
}

