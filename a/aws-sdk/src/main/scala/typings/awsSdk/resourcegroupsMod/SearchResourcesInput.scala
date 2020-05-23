package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResourcesInput extends js.Object {
  /**
    * The maximum number of group member ARNs returned by SearchResources in paginated output. By default, this number is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.resourcegroupsMod.MaxResults] = js.native
  /**
    * The NextToken value that is returned in a paginated SearchResources request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
    */
  var NextToken: js.UndefOr[typings.awsSdk.resourcegroupsMod.NextToken] = js.native
  /**
    * The search query, using the same formats that are supported for resource group definition.
    */
  var ResourceQuery: typings.awsSdk.resourcegroupsMod.ResourceQuery = js.native
}

object SearchResourcesInput {
  @scala.inline
  def apply(
    ResourceQuery: ResourceQuery,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): SearchResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResourcesInput]
  }
}

