package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorsRequest extends js.Object {
  /**
    *  The IDs of the accelerators to describe. 
    */
  var acceleratorIds: js.UndefOr[AcceleratorIdList] = js.native
  /**
    *  One or more filters. Filter names and values are case-sensitive. Valid filter names are: accelerator-types: can provide a list of accelerator type names to filter for. instance-id: can provide a list of EC2 instance ids to filter for. 
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    *  The total number of items to return in the command's output. If the total number of items available is more than the value specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken value in the starting-token argument of a subsequent command. Do not use the NextToken response element directly outside of the AWS CLI. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeAcceleratorsRequest {
  @scala.inline
  def apply(
    acceleratorIds: AcceleratorIdList = null,
    filters: FilterList = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): DescribeAcceleratorsRequest = {
    val __obj = js.Dynamic.literal()
    if (acceleratorIds != null) __obj.updateDynamic("acceleratorIds")(acceleratorIds.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorsRequest]
  }
}

