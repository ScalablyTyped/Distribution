package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingGroupsRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  /**
    * A filter that limits the results to those with the specified name prefix.
    */
  var namePrefixFilter: js.UndefOr[ThingGroupName] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A filter that limits the results to those with the specified parent group.
    */
  var parentGroup: js.UndefOr[ThingGroupName] = js.native
  /**
    * If true, return child groups as well.
    */
  var recursive: js.UndefOr[RecursiveWithoutDefault] = js.native
}

object ListThingGroupsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
    namePrefixFilter: ThingGroupName = null,
    nextToken: NextToken = null,
    parentGroup: ThingGroupName = null,
    recursive: js.UndefOr[RecursiveWithoutDefault] = js.undefined
  ): ListThingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (namePrefixFilter != null) __obj.updateDynamic("namePrefixFilter")(namePrefixFilter.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (parentGroup != null) __obj.updateDynamic("parentGroup")(parentGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingGroupsRequest]
  }
}

