package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLoadBalancerAttributesInput extends StObject {
  
  /**
    * The attributes for the load balancer.
    */
  var LoadBalancerAttributes: typings.awsSdk.elbMod.LoadBalancerAttributes
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object ModifyLoadBalancerAttributesInput {
  
  inline def apply(LoadBalancerAttributes: LoadBalancerAttributes, LoadBalancerName: AccessPointName): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerAttributes = LoadBalancerAttributes.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
  
  extension [Self <: ModifyLoadBalancerAttributesInput](x: Self) {
    
    inline def setLoadBalancerAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
