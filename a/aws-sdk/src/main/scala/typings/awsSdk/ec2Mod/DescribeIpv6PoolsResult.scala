package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpv6PoolsResult extends StObject {
  
  /**
    * Information about the IPv6 address pools.
    */
  var Ipv6Pools: js.UndefOr[Ipv6PoolSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeIpv6PoolsResult {
  
  @scala.inline
  def apply(): DescribeIpv6PoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpv6PoolsResult]
  }
  
  @scala.inline
  implicit class DescribeIpv6PoolsResultMutableBuilder[Self <: DescribeIpv6PoolsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv6Pools(value: Ipv6PoolSet): Self = StObject.set(x, "Ipv6Pools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6PoolsUndefined: Self = StObject.set(x, "Ipv6Pools", js.undefined)
    
    @scala.inline
    def setIpv6PoolsVarargs(value: Ipv6Pool*): Self = StObject.set(x, "Ipv6Pools", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
