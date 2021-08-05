package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBundlesResult extends StObject {
  
  /**
    *  A list of bundles. 
    */
  var bundleList: js.UndefOr[BundleList] = js.undefined
  
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBundlesResult {
  
  inline def apply(): ListBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBundlesResult]
  }
  
  extension [Self <: ListBundlesResult](x: Self) {
    
    inline def setBundleList(value: BundleList): Self = StObject.set(x, "bundleList", value.asInstanceOf[js.Any])
    
    inline def setBundleListUndefined: Self = StObject.set(x, "bundleList", js.undefined)
    
    inline def setBundleListVarargs(value: BundleDetails*): Self = StObject.set(x, "bundleList", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
