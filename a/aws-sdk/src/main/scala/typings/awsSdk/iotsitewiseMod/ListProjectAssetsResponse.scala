package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProjectAssetsResponse extends js.Object {
  
  /**
    * A list that contains the IDs of each asset associated with the project.
    */
  var assetIds: AssetIDs = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListProjectAssetsResponse {
  
  @scala.inline
  def apply(assetIds: AssetIDs): ListProjectAssetsResponse = {
    val __obj = js.Dynamic.literal(assetIds = assetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectAssetsResponse]
  }
  
  @scala.inline
  implicit class ListProjectAssetsResponseOps[Self <: ListProjectAssetsResponse] (val x: Self) extends AnyVal {
    
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
    def setAssetIdsVarargs(value: ID*): Self = this.set("assetIds", js.Array(value :_*))
    
    @scala.inline
    def setAssetIds(value: AssetIDs): Self = this.set("assetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
