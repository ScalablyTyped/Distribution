package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspaceBundlesRequest extends StObject {
  
  /**
    * The identifiers of the bundles. You cannot combine this parameter with any other filter.
    */
  var BundleIds: js.UndefOr[BundleIdList] = js.native
  
  /**
    * The token for the next set of results. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The owner of the bundles. You cannot combine this parameter with any other filter. Specify AMAZON to describe the bundles provided by AWS or null to describe the bundles that belong to your account.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
}
object DescribeWorkspaceBundlesRequest {
  
  @scala.inline
  def apply(): DescribeWorkspaceBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceBundlesRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceBundlesRequestMutableBuilder[Self <: DescribeWorkspaceBundlesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleIds(value: BundleIdList): Self = StObject.set(x, "BundleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdsUndefined: Self = StObject.set(x, "BundleIds", js.undefined)
    
    @scala.inline
    def setBundleIdsVarargs(value: BundleId*): Self = StObject.set(x, "BundleIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOwner(value: BundleOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
  }
}
