package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

