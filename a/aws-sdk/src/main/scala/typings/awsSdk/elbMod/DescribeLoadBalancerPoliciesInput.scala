package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerPoliciesInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
  
  /**
    * The names of the policies.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.elbMod.PolicyNames] = js.undefined
}
object DescribeLoadBalancerPoliciesInput {
  
  @scala.inline
  def apply(): DescribeLoadBalancerPoliciesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesInput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerPoliciesInputMutableBuilder[Self <: DescribeLoadBalancerPoliciesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
  }
}
