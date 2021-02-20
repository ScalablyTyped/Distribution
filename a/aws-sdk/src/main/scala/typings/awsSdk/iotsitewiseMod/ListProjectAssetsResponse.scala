package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProjectAssetsResponse extends StObject {
  
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
  implicit class ListProjectAssetsResponseMutableBuilder[Self <: ListProjectAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetIds(value: AssetIDs): Self = StObject.set(x, "assetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdsVarargs(value: ID*): Self = StObject.set(x, "assetIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
