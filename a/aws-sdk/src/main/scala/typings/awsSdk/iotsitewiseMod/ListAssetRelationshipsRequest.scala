package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetRelationshipsRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
  
  /**
    * The maximum number of results to return for each paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The type of traversal to use to identify asset relationships. Choose the following option:    PATH_TO_ROOT – Identify the asset's parent assets up to the root asset. The asset that you specify in assetId is the first result in the list of assetRelationshipSummaries, and the root asset is the last result.  
    */
  var traversalType: TraversalType
}
object ListAssetRelationshipsRequest {
  
  inline def apply(assetId: ID, traversalType: TraversalType): ListAssetRelationshipsRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], traversalType = traversalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetRelationshipsRequest]
  }
  
  extension [Self <: ListAssetRelationshipsRequest](x: Self) {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTraversalType(value: TraversalType): Self = StObject.set(x, "traversalType", value.asInstanceOf[js.Any])
  }
}
