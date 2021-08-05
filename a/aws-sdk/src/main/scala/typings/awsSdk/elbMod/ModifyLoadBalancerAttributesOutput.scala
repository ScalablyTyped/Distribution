package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLoadBalancerAttributesOutput extends StObject {
  
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerAttributes] = js.undefined
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
}
object ModifyLoadBalancerAttributesOutput {
  
  inline def apply(): ModifyLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLoadBalancerAttributesOutput]
  }
  
  extension [Self <: ModifyLoadBalancerAttributesOutput](x: Self) {
    
    inline def setLoadBalancerAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerAttributesUndefined: Self = StObject.set(x, "LoadBalancerAttributes", js.undefined)
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
  }
}
