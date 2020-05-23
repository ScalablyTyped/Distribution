package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourceDriftsInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[BoxedMaxResults] = js.native
  /**
    * A string that identifies the next page of stack resource drift results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The name of the stack for which you want drift information.
    */
  var StackName: StackNameOrId = js.native
  /**
    * The resource drift status values to use as filters for the resource drift results returned.    DELETED: The resource differs from its expected template configuration in that the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected template values.    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatusFilters: js.UndefOr[typings.awsSdk.cloudformationMod.StackResourceDriftStatusFilters] = js.native
}

object DescribeStackResourceDriftsInput {
  @scala.inline
  def apply(
    StackName: StackNameOrId,
    MaxResults: js.UndefOr[BoxedMaxResults] = js.undefined,
    NextToken: NextToken = null,
    StackResourceDriftStatusFilters: StackResourceDriftStatusFilters = null
  ): DescribeStackResourceDriftsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackResourceDriftStatusFilters != null) __obj.updateDynamic("StackResourceDriftStatusFilters")(StackResourceDriftStatusFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceDriftsInput]
  }
}

