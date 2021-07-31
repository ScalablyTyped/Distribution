package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetsRequest extends StObject {
  
  /**
    * The ID of the asset model by which to filter the list of assets. This parameter is required if you choose ALL for filter.
    */
  var assetModelId: js.UndefOr[ID] = js.undefined
  
  /**
    * The filter for the requested list of assets. Choose one of the following options:    ALL – The list includes all assets for a given asset model ID. The assetModelId parameter is required if you filter by ALL.    TOP_LEVEL – The list includes only top-level assets in the asset hierarchy tree.   Default: ALL 
    */
  var filter: js.UndefOr[ListAssetsFilter] = js.undefined
  
  /**
    * The maximum number of results to be returned per paginated request. Default: 50
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssetsRequest {
  
  @scala.inline
  def apply(): ListAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsRequest]
  }
  
  @scala.inline
  implicit class ListAssetsRequestMutableBuilder[Self <: ListAssetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelIdUndefined: Self = StObject.set(x, "assetModelId", js.undefined)
    
    @scala.inline
    def setFilter(value: ListAssetsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
