package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLoadBalancerAttributeRequest extends StObject {
  
  /**
    * The name of the attribute you want to update. Valid values are below.
    */
  var attributeName: LoadBalancerAttributeName
  
  /**
    * The value that you want to specify for the attribute name.
    */
  var attributeValue: StringMax256
  
  /**
    * The name of the load balancer that you want to modify (e.g., my-load-balancer.
    */
  var loadBalancerName: ResourceName
}
object UpdateLoadBalancerAttributeRequest {
  
  @scala.inline
  def apply(
    attributeName: LoadBalancerAttributeName,
    attributeValue: StringMax256,
    loadBalancerName: ResourceName
  ): UpdateLoadBalancerAttributeRequest = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], attributeValue = attributeValue.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoadBalancerAttributeRequest]
  }
  
  @scala.inline
  implicit class UpdateLoadBalancerAttributeRequestMutableBuilder[Self <: UpdateLoadBalancerAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: LoadBalancerAttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: StringMax256): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
