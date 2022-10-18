package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceBundlesRequest extends StObject {
  
  /**
    * The identifiers of the bundles. You cannot combine this parameter with any other filter.
    */
  var BundleIds: js.UndefOr[BundleIdList] = js.undefined
  
  /**
    * The token for the next set of results. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The owner of the bundles. You cannot combine this parameter with any other filter. To describe the bundles provided by Amazon Web Services, specify AMAZON. To describe the bundles that belong to your account, don't specify a value.
    */
  var Owner: js.UndefOr[BundleOwner] = js.undefined
}
object DescribeWorkspaceBundlesRequest {
  
  inline def apply(): DescribeWorkspaceBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceBundlesRequest]
  }
  
  extension [Self <: DescribeWorkspaceBundlesRequest](x: Self) {
    
    inline def setBundleIds(value: BundleIdList): Self = StObject.set(x, "BundleIds", value.asInstanceOf[js.Any])
    
    inline def setBundleIdsUndefined: Self = StObject.set(x, "BundleIds", js.undefined)
    
    inline def setBundleIdsVarargs(value: BundleId*): Self = StObject.set(x, "BundleIds", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOwner(value: BundleOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
  }
}
