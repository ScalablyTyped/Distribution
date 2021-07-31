package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePublicIpv4PoolsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the address pools.
    */
  var PublicIpv4Pools: js.UndefOr[PublicIpv4PoolSet] = js.undefined
}
object DescribePublicIpv4PoolsResult {
  
  @scala.inline
  def apply(): DescribePublicIpv4PoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePublicIpv4PoolsResult]
  }
  
  @scala.inline
  implicit class DescribePublicIpv4PoolsResultMutableBuilder[Self <: DescribePublicIpv4PoolsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPublicIpv4Pools(value: PublicIpv4PoolSet): Self = StObject.set(x, "PublicIpv4Pools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpv4PoolsUndefined: Self = StObject.set(x, "PublicIpv4Pools", js.undefined)
    
    @scala.inline
    def setPublicIpv4PoolsVarargs(value: PublicIpv4Pool*): Self = StObject.set(x, "PublicIpv4Pools", js.Array(value :_*))
  }
}
