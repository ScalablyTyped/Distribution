package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLoadBalancerPoliciesOfListenerInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The external port of the load balancer.
    */
  var LoadBalancerPort: AccessPointPort
  
  /**
    * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is currently enabled, it is disabled. If the list is empty, all current policies are disabled.
    */
  var PolicyNames: typings.awsSdk.elbMod.PolicyNames
}
object SetLoadBalancerPoliciesOfListenerInput {
  
  inline def apply(LoadBalancerName: AccessPointName, LoadBalancerPort: AccessPointPort, PolicyNames: PolicyNames): SetLoadBalancerPoliciesOfListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], PolicyNames = PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBalancerPoliciesOfListenerInput]
  }
  
  extension [Self <: SetLoadBalancerPoliciesOfListenerInput](x: Self) {
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerPort(value: AccessPointPort): Self = StObject.set(x, "LoadBalancerPort", value.asInstanceOf[js.Any])
    
    inline def setPolicyNames(value: PolicyNames): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value*))
  }
}
