package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCustomerGatewaysResult extends StObject {
  
  /**
    * Information about one or more customer gateways.
    */
  var CustomerGateways: js.UndefOr[CustomerGatewayList] = js.native
}
object DescribeCustomerGatewaysResult {
  
  @scala.inline
  def apply(): DescribeCustomerGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomerGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeCustomerGatewaysResultMutableBuilder[Self <: DescribeCustomerGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGateways(value: CustomerGatewayList): Self = StObject.set(x, "CustomerGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewaysUndefined: Self = StObject.set(x, "CustomerGateways", js.undefined)
    
    @scala.inline
    def setCustomerGatewaysVarargs(value: CustomerGateway*): Self = StObject.set(x, "CustomerGateways", js.Array(value :_*))
  }
}
