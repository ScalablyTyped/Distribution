package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomerGatewaysResult extends StObject {
  
  /**
    * Information about one or more customer gateways.
    */
  var CustomerGateways: js.UndefOr[CustomerGatewayList] = js.undefined
}
object DescribeCustomerGatewaysResult {
  
  inline def apply(): DescribeCustomerGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomerGatewaysResult]
  }
  
  extension [Self <: DescribeCustomerGatewaysResult](x: Self) {
    
    inline def setCustomerGateways(value: CustomerGatewayList): Self = StObject.set(x, "CustomerGateways", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewaysUndefined: Self = StObject.set(x, "CustomerGateways", js.undefined)
    
    inline def setCustomerGatewaysVarargs(value: CustomerGateway*): Self = StObject.set(x, "CustomerGateways", js.Array(value*))
  }
}
