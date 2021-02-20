package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssetsResponse extends StObject {
  
  /**
    * A list of MediaPackage VOD Asset resources.
    */
  var Assets: js.UndefOr[listOfAssetShallow] = js.native
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListAssetsResponse {
  
  @scala.inline
  def apply(): ListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsResponse]
  }
  
  @scala.inline
  implicit class ListAssetsResponseMutableBuilder[Self <: ListAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: listOfAssetShallow): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: AssetShallow*): Self = StObject.set(x, "Assets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
