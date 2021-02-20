package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetSecurityGroupsOutput extends StObject {
  
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroups] = js.native
}
object SetSecurityGroupsOutput {
  
  @scala.inline
  def apply(): SetSecurityGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSecurityGroupsOutput]
  }
  
  @scala.inline
  implicit class SetSecurityGroupsOutputMutableBuilder[Self <: SetSecurityGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroups): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
  }
}
