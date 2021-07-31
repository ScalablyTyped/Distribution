package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpnGatewaysResult extends StObject {
  
  /**
    * Information about one or more virtual private gateways.
    */
  var VpnGateways: js.UndefOr[VpnGatewayList] = js.undefined
}
object DescribeVpnGatewaysResult {
  
  @scala.inline
  def apply(): DescribeVpnGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeVpnGatewaysResultMutableBuilder[Self <: DescribeVpnGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnGateways(value: VpnGatewayList): Self = StObject.set(x, "VpnGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewaysUndefined: Self = StObject.set(x, "VpnGateways", js.undefined)
    
    @scala.inline
    def setVpnGatewaysVarargs(value: VpnGateway*): Self = StObject.set(x, "VpnGateways", js.Array(value :_*))
  }
}
