package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedAssetsResponse extends StObject {
  
  /**
    * A list that summarizes the associated assets.
    */
  var assetSummaries: AssociatedAssetsSummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssociatedAssetsResponse {
  
  inline def apply(assetSummaries: AssociatedAssetsSummaries): ListAssociatedAssetsResponse = {
    val __obj = js.Dynamic.literal(assetSummaries = assetSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedAssetsResponse]
  }
  
  extension [Self <: ListAssociatedAssetsResponse](x: Self) {
    
    inline def setAssetSummaries(value: AssociatedAssetsSummaries): Self = StObject.set(x, "assetSummaries", value.asInstanceOf[js.Any])
    
    inline def setAssetSummariesVarargs(value: AssociatedAssetsSummary*): Self = StObject.set(x, "assetSummaries", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
