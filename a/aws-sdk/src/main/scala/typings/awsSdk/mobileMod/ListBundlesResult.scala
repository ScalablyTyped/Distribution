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
  
  @scala.inline
  def apply(): ListBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBundlesResult]
  }
  
  @scala.inline
  implicit class ListBundlesResultMutableBuilder[Self <: ListBundlesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleList(value: BundleList): Self = StObject.set(x, "bundleList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleListUndefined: Self = StObject.set(x, "bundleList", js.undefined)
    
    @scala.inline
    def setBundleListVarargs(value: BundleDetails*): Self = StObject.set(x, "bundleList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
