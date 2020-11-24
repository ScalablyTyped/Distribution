package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssetModelsResponse extends js.Object {
  
  /**
    * A list that summarizes each asset model.
    */
  var assetModelSummaries: AssetModelSummaries = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAssetModelsResponse {
  
  @scala.inline
  def apply(assetModelSummaries: AssetModelSummaries): ListAssetModelsResponse = {
    val __obj = js.Dynamic.literal(assetModelSummaries = assetModelSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetModelsResponse]
  }
  
  @scala.inline
  implicit class ListAssetModelsResponseOps[Self <: ListAssetModelsResponse] (val x: Self) extends AnyVal {
    
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
    def setAssetModelSummariesVarargs(value: AssetModelSummary*): Self = this.set("assetModelSummaries", js.Array(value :_*))
    
    @scala.inline
    def setAssetModelSummaries(value: AssetModelSummaries): Self = this.set("assetModelSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
