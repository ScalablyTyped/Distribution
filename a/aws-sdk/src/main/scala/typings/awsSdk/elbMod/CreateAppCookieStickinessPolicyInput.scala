package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppCookieStickinessPolicyInput extends StObject {
  
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: typings.awsSdk.elbMod.CookieName
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsSdk.elbMod.PolicyName
}
object CreateAppCookieStickinessPolicyInput {
  
  inline def apply(CookieName: CookieName, LoadBalancerName: AccessPointName, PolicyName: PolicyName): CreateAppCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(CookieName = CookieName.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppCookieStickinessPolicyInput]
  }
  
  extension [Self <: CreateAppCookieStickinessPolicyInput](x: Self) {
    
    inline def setCookieName(value: CookieName): Self = StObject.set(x, "CookieName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
