package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspaceBundlesResult extends StObject {
  
  /**
    * Information about the bundles.
    */
  var Bundles: js.UndefOr[BundleList] = js.native
  
  /**
    * The token to use to retrieve the next set of results, or null if there are no more results available. This token is valid for one day and must be used within that time frame.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeWorkspaceBundlesResult {
  
  @scala.inline
  def apply(): DescribeWorkspaceBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceBundlesResult]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceBundlesResultMutableBuilder[Self <: DescribeWorkspaceBundlesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundles(value: BundleList): Self = StObject.set(x, "Bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlesUndefined: Self = StObject.set(x, "Bundles", js.undefined)
    
    @scala.inline
    def setBundlesVarargs(value: WorkspaceBundle*): Self = StObject.set(x, "Bundles", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
