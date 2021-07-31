package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerAttributesInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object DescribeLoadBalancerAttributesInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName): DescribeLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerAttributesInput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerAttributesInputMutableBuilder[Self <: DescribeLoadBalancerAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
