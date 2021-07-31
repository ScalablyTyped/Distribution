package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerAttributesOutput extends StObject {
  
  /**
    * Information about the load balancer attributes.
    */
  var Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
}
object DescribeLoadBalancerAttributesOutput {
  
  @scala.inline
  def apply(): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerAttributesOutputMutableBuilder[Self <: DescribeLoadBalancerAttributesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: LoadBalancerAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}
