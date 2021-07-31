package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRevisionAssetsResponse extends StObject {
  
  /**
    * The asset objects listed by the request.
    */
  var Assets: js.UndefOr[ListOfAssetEntry] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.undefined
}
object ListRevisionAssetsResponse {
  
  @scala.inline
  def apply(): ListRevisionAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRevisionAssetsResponse]
  }
  
  @scala.inline
  implicit class ListRevisionAssetsResponseMutableBuilder[Self <: ListRevisionAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: ListOfAssetEntry): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: AssetEntry*): Self = StObject.set(x, "Assets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
