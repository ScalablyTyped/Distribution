package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedAssetsRequest extends js.Object {
  /**
    * The ID of the parent asset.
    */
  var assetId: ID = js.native
  /**
    * The hierarchy ID (of the parent asset model) whose associated assets are returned. To find a hierarchy ID, use the DescribeAsset or DescribeAssetModel actions. For more information, see Asset Hierarchies in the AWS IoT SiteWise User Guide.
    */
  var hierarchyId: ID = js.native
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAssociatedAssetsRequest {
  @scala.inline
  def apply(
    assetId: ID,
    hierarchyId: ID,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListAssociatedAssetsRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], hierarchyId = hierarchyId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedAssetsRequest]
  }
}

