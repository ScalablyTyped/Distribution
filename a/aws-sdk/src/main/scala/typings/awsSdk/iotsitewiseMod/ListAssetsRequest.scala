package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssetsRequest extends js.Object {
  /**
    * The ID of the asset model by which to filter the list of assets. This parameter is required if you choose ALL for filter.
    */
  var assetModelId: js.UndefOr[ID] = js.native
  /**
    * The filter for the requested list of assets. Choose one of the following options. Defaults to ALL.    ALL – The list includes all assets for a given asset model ID. The assetModelId parameter is required if you filter by ALL.    TOP_LEVEL – The list includes only top-level assets in the asset hierarchy tree.  
    */
  var filter: js.UndefOr[ListAssetsFilter] = js.native
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAssetsRequest {
  @scala.inline
  def apply(
    assetModelId: ID = null,
    filter: ListAssetsFilter = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListAssetsRequest = {
    val __obj = js.Dynamic.literal()
    if (assetModelId != null) __obj.updateDynamic("assetModelId")(assetModelId.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetsRequest]
  }
}

