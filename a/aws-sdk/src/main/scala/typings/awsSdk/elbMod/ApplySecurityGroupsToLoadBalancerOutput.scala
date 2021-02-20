package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySecurityGroupsToLoadBalancerOutput extends StObject {
  
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.elbMod.SecurityGroups] = js.native
}
object ApplySecurityGroupsToLoadBalancerOutput {
  
  @scala.inline
  def apply(): ApplySecurityGroupsToLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
  }
  
  @scala.inline
  implicit class ApplySecurityGroupsToLoadBalancerOutputMutableBuilder[Self <: ApplySecurityGroupsToLoadBalancerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
  }
}
