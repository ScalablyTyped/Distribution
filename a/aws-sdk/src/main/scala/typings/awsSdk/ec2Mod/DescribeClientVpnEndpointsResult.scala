package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientVpnEndpointsResult extends StObject {
  
  /**
    * Information about the Client VPN endpoints.
    */
  var ClientVpnEndpoints: js.UndefOr[EndpointSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeClientVpnEndpointsResult {
  
  @scala.inline
  def apply(): DescribeClientVpnEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnEndpointsResult]
  }
  
  @scala.inline
  implicit class DescribeClientVpnEndpointsResultMutableBuilder[Self <: DescribeClientVpnEndpointsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpoints(value: EndpointSet): Self = StObject.set(x, "ClientVpnEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointsUndefined: Self = StObject.set(x, "ClientVpnEndpoints", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointsVarargs(value: ClientVpnEndpoint*): Self = StObject.set(x, "ClientVpnEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
