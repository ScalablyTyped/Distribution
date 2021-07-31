package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedIpv6PoolCidrsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[Ipv6PoolMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the IPv6 address pool.
    */
  var PoolId: Ipv6PoolEc2Id
}
object GetAssociatedIpv6PoolCidrsRequest {
  
  @scala.inline
  def apply(PoolId: Ipv6PoolEc2Id): GetAssociatedIpv6PoolCidrsRequest = {
    val __obj = js.Dynamic.literal(PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssociatedIpv6PoolCidrsRequest]
  }
  
  @scala.inline
  implicit class GetAssociatedIpv6PoolCidrsRequestMutableBuilder[Self <: GetAssociatedIpv6PoolCidrsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Ipv6PoolMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPoolId(value: Ipv6PoolEc2Id): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
