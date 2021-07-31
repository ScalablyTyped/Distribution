package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoadBalancerPolicyInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The policy attributes.
    */
  var PolicyAttributes: js.UndefOr[typings.awsSdk.elbMod.PolicyAttributes] = js.undefined
  
  /**
    * The name of the load balancer policy to be created. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsSdk.elbMod.PolicyName
  
  /**
    * The name of the base policy type. To get the list of policy types, use DescribeLoadBalancerPolicyTypes.
    */
  var PolicyTypeName: typings.awsSdk.elbMod.PolicyTypeName
}
object CreateLoadBalancerPolicyInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName, PolicyTypeName: PolicyTypeName): CreateLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], PolicyTypeName = PolicyTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerPolicyInput]
  }
  
  @scala.inline
  implicit class CreateLoadBalancerPolicyInputMutableBuilder[Self <: CreateLoadBalancerPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyAttributes(value: PolicyAttributes): Self = StObject.set(x, "PolicyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyAttributesUndefined: Self = StObject.set(x, "PolicyAttributes", js.undefined)
    
    @scala.inline
    def setPolicyAttributesVarargs(value: PolicyAttribute*): Self = StObject.set(x, "PolicyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeName(value: PolicyTypeName): Self = StObject.set(x, "PolicyTypeName", value.asInstanceOf[js.Any])
  }
}
