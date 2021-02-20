package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySecurityGroupsToLoadBalancerInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  
  /**
    * The IDs of the security groups to associate with the load balancer. Note that you cannot specify the name of the security group.
    */
  var SecurityGroups: typings.awsSdk.elbMod.SecurityGroups = js.native
}
object ApplySecurityGroupsToLoadBalancerInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, SecurityGroups: SecurityGroups): ApplySecurityGroupsToLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerInput]
  }
  
  @scala.inline
  implicit class ApplySecurityGroupsToLoadBalancerInputMutableBuilder[Self <: ApplySecurityGroupsToLoadBalancerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
  }
}
