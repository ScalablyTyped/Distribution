package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLoadBalancerAttributesInput extends StObject {
  
  /**
    * The load balancer attributes.
    */
  var Attributes: LoadBalancerAttributes
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn
}
object ModifyLoadBalancerAttributesInput {
  
  @scala.inline
  def apply(Attributes: LoadBalancerAttributes, LoadBalancerArn: LoadBalancerArn): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
  
  @scala.inline
  implicit class ModifyLoadBalancerAttributesInputMutableBuilder[Self <: ModifyLoadBalancerAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: LoadBalancerAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
  }
}
