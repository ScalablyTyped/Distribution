package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNatGatewaysResult extends StObject {
  
  /**
    * Information about the NAT gateways.
    */
  var NatGateways: js.UndefOr[NatGatewayList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeNatGatewaysResult {
  
  @scala.inline
  def apply(): DescribeNatGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNatGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeNatGatewaysResultMutableBuilder[Self <: DescribeNatGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNatGateways(value: NatGatewayList): Self = StObject.set(x, "NatGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewaysUndefined: Self = StObject.set(x, "NatGateways", js.undefined)
    
    @scala.inline
    def setNatGatewaysVarargs(value: NatGateway*): Self = StObject.set(x, "NatGateways", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
