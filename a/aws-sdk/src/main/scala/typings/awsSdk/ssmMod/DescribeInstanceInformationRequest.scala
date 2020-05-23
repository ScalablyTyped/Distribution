package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceInformationRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this Filters data type instead of InstanceInformationFilterList, which is deprecated.
    */
  var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.native
  /**
    * This is a legacy method. We recommend that you don't use this method. Instead, use the Filters data type. Filters enables you to return instance information by filtering based on tags applied to managed instances.  Attempting to use InstanceInformationFilterList and Filters leads to an exception error.  
    */
  var InstanceInformationFilterList: js.UndefOr[typings.awsSdk.ssmMod.InstanceInformationFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstanceInformationRequest {
  @scala.inline
  def apply(
    Filters: InstanceInformationStringFilterList = null,
    InstanceInformationFilterList: InstanceInformationFilterList = null,
    MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined,
    NextToken: NextToken = null
  ): DescribeInstanceInformationRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (InstanceInformationFilterList != null) __obj.updateDynamic("InstanceInformationFilterList")(InstanceInformationFilterList.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceInformationRequest]
  }
}

