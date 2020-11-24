package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociatedAssetsRequest extends js.Object {
  
  /**
    * The ID of the asset to query.
    */
  var assetId: ID = js.native
  
  /**
    * The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use the DescribeAsset or DescribeAssetModel operations. This parameter is required if you choose CHILD for traversalDirection. For more information, see Asset hierarchies in the AWS IoT SiteWise User Guide.
    */
  var hierarchyId: js.UndefOr[ID] = js.native
  
  /**
    * The maximum number of results to be returned per paginated request. Default: 50
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The direction to list associated assets. Choose one of the following options:    CHILD – The list includes all child assets associated to the asset. The hierarchyId parameter is required if you choose CHILD.    PARENT – The list includes the asset's parent asset.   Default: CHILD 
    */
  var traversalDirection: js.UndefOr[TraversalDirection] = js.native
}
object ListAssociatedAssetsRequest {
  
  @scala.inline
  def apply(assetId: ID): ListAssociatedAssetsRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
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
    def deleteHierarchyId: Self = this.set("hierarchyId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setTraversalDirection(value: TraversalDirection): Self = this.set("traversalDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraversalDirection: Self = this.set("traversalDirection", js.undefined)
  }
}
