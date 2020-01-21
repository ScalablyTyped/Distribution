package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAggregateDiscoveredResourcesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * Returns a list of ResourceIdentifiers objects.
    */
  var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.native
}

object ListAggregateDiscoveredResourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ResourceIdentifiers: DiscoveredResourceIdentifierList = null): ListAggregateDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceIdentifiers != null) __obj.updateDynamic("ResourceIdentifiers")(ResourceIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesResponse]
  }
}

