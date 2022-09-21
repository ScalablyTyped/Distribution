package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssetPropertyValueHistoryResponse extends StObject {
  
  /**
    * The asset property's value history.
    */
  var assetPropertyValueHistory: AssetPropertyValueHistory
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetAssetPropertyValueHistoryResponse {
  
  inline def apply(assetPropertyValueHistory: AssetPropertyValueHistory): GetAssetPropertyValueHistoryResponse = {
    val __obj = js.Dynamic.literal(assetPropertyValueHistory = assetPropertyValueHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyValueHistoryResponse]
  }
  
  extension [Self <: GetAssetPropertyValueHistoryResponse](x: Self) {
    
    inline def setAssetPropertyValueHistory(value: AssetPropertyValueHistory): Self = StObject.set(x, "assetPropertyValueHistory", value.asInstanceOf[js.Any])
    
    inline def setAssetPropertyValueHistoryVarargs(value: AssetPropertyValue*): Self = StObject.set(x, "assetPropertyValueHistory", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
