package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerAttributesOutput extends StObject {
  
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerAttributes] = js.undefined
}
object DescribeLoadBalancerAttributesOutput {
  
  inline def apply(): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
  
  extension [Self <: DescribeLoadBalancerAttributesOutput](x: Self) {
    
    inline def setLoadBalancerAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerAttributesUndefined: Self = StObject.set(x, "LoadBalancerAttributes", js.undefined)
  }
}
