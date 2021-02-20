package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachInstancesToLoadBalancerRequest extends StObject {
  
  /**
    * An array of strings representing the instance name(s) you want to attach to your load balancer. An instance must be running before you can attach it to your load balancer. There are no additional limits on the number of instances you can attach to your load balancer, aside from the limit of Lightsail instances you can create in your account (20).
    */
  var instanceNames: ResourceNameList = js.native
  
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName = js.native
}
object AttachInstancesToLoadBalancerRequest {
  
  @scala.inline
  def apply(instanceNames: ResourceNameList, loadBalancerName: ResourceName): AttachInstancesToLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachInstancesToLoadBalancerRequest]
  }
  
  @scala.inline
  implicit class AttachInstancesToLoadBalancerRequestMutableBuilder[Self <: AttachInstancesToLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceNames(value: ResourceNameList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNamesVarargs(value: ResourceName*): Self = StObject.set(x, "instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
