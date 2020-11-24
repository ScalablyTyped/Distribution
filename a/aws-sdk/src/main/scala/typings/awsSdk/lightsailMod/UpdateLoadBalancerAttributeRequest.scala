package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLoadBalancerAttributeRequest extends js.Object {
  
  /**
    * The name of the attribute you want to update. Valid values are below.
    */
  var attributeName: LoadBalancerAttributeName = js.native
  
  /**
    * The value that you want to specify for the attribute name.
    */
  var attributeValue: StringMax256 = js.native
  
  /**
    * The name of the load balancer that you want to modify (e.g., my-load-balancer.
    */
  var loadBalancerName: ResourceName = js.native
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
  implicit class UpdateLoadBalancerAttributeRequestOps[Self <: UpdateLoadBalancerAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeName(value: LoadBalancerAttributeName): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: StringMax256): Self = this.set("attributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
  }
}
