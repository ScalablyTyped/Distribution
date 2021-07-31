package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoadBalancerPolicyInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The name of the policy.
    */
  var PolicyName: typings.awsSdk.elbMod.PolicyName
}
object DeleteLoadBalancerPolicyInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName): DeleteLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerPolicyInput]
  }
  
  @scala.inline
  implicit class DeleteLoadBalancerPolicyInputMutableBuilder[Self <: DeleteLoadBalancerPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
