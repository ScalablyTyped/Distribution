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
  def apply(assetId: ID, hierarchyId: ID): ListAssociatedAssetsRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], hierarchyId = hierarchyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedAssetsRequest]
  }
  @scala.inline
  implicit class ListAssociatedAssetsRequestOps[Self <: ListAssociatedAssetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetId(value: ID): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchyId(value: ID): Self = this.set("hierarchyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

