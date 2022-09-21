package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceBundlesResult extends StObject {
  
  /**
    * Information about the bundles.
    */
  var Bundles: js.UndefOr[BundleList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. This token is valid for one day and must be used within that time frame.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceBundlesResult {
  
  inline def apply(): DescribeWorkspaceBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceBundlesResult]
  }
  
  extension [Self <: DescribeWorkspaceBundlesResult](x: Self) {
    
    inline def setBundles(value: BundleList): Self = StObject.set(x, "Bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "Bundles", js.undefined)
    
    inline def setBundlesVarargs(value: WorkspaceBundle*): Self = StObject.set(x, "Bundles", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
