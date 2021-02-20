package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssetPropertyValueHistoryResponse extends StObject {
  
  /**
    * The asset property's value history.
    */
  var assetPropertyValueHistory: AssetPropertyValueHistory = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetAssetPropertyValueHistoryResponse {
  
  @scala.inline
  def apply(assetPropertyValueHistory: AssetPropertyValueHistory): GetAssetPropertyValueHistoryResponse = {
    val __obj = js.Dynamic.literal(assetPropertyValueHistory = assetPropertyValueHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyValueHistoryResponse]
  }
  
  @scala.inline
  implicit class GetAssetPropertyValueHistoryResponseMutableBuilder[Self <: GetAssetPropertyValueHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetPropertyValueHistory(value: AssetPropertyValueHistory): Self = StObject.set(x, "assetPropertyValueHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPropertyValueHistoryVarargs(value: AssetPropertyValue*): Self = StObject.set(x, "assetPropertyValueHistory", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
