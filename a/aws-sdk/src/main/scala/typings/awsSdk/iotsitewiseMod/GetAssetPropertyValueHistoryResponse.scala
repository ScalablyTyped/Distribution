package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssetPropertyValueHistoryResponse extends js.Object {
  
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
  implicit class GetAssetPropertyValueHistoryResponseOps[Self <: GetAssetPropertyValueHistoryResponse] (val x: Self) extends AnyVal {
    
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
    def setAssetPropertyValueHistoryVarargs(value: AssetPropertyValue*): Self = this.set("assetPropertyValueHistory", js.Array(value :_*))
    
    @scala.inline
    def setAssetPropertyValueHistory(value: AssetPropertyValueHistory): Self = this.set("assetPropertyValueHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
