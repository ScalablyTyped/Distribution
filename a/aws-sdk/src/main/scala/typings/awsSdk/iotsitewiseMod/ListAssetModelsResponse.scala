package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetModelsResponse extends StObject {
  
  /**
    * A list that summarizes each asset model.
    */
  var assetModelSummaries: AssetModelSummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssetModelsResponse {
  
  inline def apply(assetModelSummaries: AssetModelSummaries): ListAssetModelsResponse = {
    val __obj = js.Dynamic.literal(assetModelSummaries = assetModelSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetModelsResponse]
  }
  
  extension [Self <: ListAssetModelsResponse](x: Self) {
    
    inline def setAssetModelSummaries(value: AssetModelSummaries): Self = StObject.set(x, "assetModelSummaries", value.asInstanceOf[js.Any])
    
    inline def setAssetModelSummariesVarargs(value: AssetModelSummary*): Self = StObject.set(x, "assetModelSummaries", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
