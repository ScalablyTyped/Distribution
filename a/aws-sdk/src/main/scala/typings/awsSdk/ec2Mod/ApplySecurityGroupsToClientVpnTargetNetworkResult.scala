package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySecurityGroupsToClientVpnTargetNetworkResult extends StObject {
  
  /**
    * The IDs of the applied security groups.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
}
object ApplySecurityGroupsToClientVpnTargetNetworkResult {
  
  @scala.inline
  def apply(): ApplySecurityGroupsToClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkResult]
  }
  
  @scala.inline
  implicit class ApplySecurityGroupsToClientVpnTargetNetworkResultMutableBuilder[Self <: ApplySecurityGroupsToClientVpnTargetNetworkResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
  }
}
