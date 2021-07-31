package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetsResponse extends StObject {
  
  /**
    * A list that summarizes each asset.
    */
  var assetSummaries: AssetSummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssetsResponse {
  
  @scala.inline
  def apply(assetSummaries: AssetSummaries): ListAssetsResponse = {
    val __obj = js.Dynamic.literal(assetSummaries = assetSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetsResponse]
  }
  
  @scala.inline
  implicit class ListAssetsResponseMutableBuilder[Self <: ListAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetSummaries(value: AssetSummaries): Self = StObject.set(x, "assetSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetSummariesVarargs(value: AssetSummary*): Self = StObject.set(x, "assetSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
