package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceCreditSpecificationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    instance-id - The ID of the instance.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The instance IDs. Default: Describes all your instances. Constraints: Maximum 1000 explicitly specified instance IDs.
    */
  var InstanceIds: js.UndefOr[InstanceIdStringList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 5 and 1000. You cannot specify this parameter and the instance IDs parameter in the same call.
    */
  var MaxResults: js.UndefOr[DescribeInstanceCreditSpecificationsMaxResults] = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeInstanceCreditSpecificationsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    InstanceIds: InstanceIdStringList = null,
    MaxResults: js.UndefOr[DescribeInstanceCreditSpecificationsMaxResults] = js.undefined,
    NextToken: String = null
  ): DescribeInstanceCreditSpecificationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceCreditSpecificationsRequest]
  }
}

