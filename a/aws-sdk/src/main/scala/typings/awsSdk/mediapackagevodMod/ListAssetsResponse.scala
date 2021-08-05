package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetsResponse extends StObject {
  
  /**
    * A list of MediaPackage VOD Asset resources.
    */
  var Assets: js.UndefOr[listOfAssetShallow] = js.undefined
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListAssetsResponse {
  
  inline def apply(): ListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsResponse]
  }
  
  extension [Self <: ListAssetsResponse](x: Self) {
    
    inline def setAssets(value: listOfAssetShallow): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetShallow*): Self = StObject.set(x, "Assets", js.Array(value :_*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
