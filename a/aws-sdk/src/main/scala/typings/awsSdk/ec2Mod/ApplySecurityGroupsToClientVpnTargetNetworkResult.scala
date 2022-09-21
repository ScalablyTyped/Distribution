package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySecurityGroupsToClientVpnTargetNetworkResult extends StObject {
  
  /**
    * The IDs of the applied security groups.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.undefined
}
object ApplySecurityGroupsToClientVpnTargetNetworkResult {
  
  inline def apply(): ApplySecurityGroupsToClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkResult]
  }
  
  extension [Self <: ApplySecurityGroupsToClientVpnTargetNetworkResult](x: Self) {
    
    inline def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
  }
}
