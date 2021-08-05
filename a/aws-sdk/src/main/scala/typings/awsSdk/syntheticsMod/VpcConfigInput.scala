package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigInput extends StObject {
  
  /**
    * The IDs of the security groups for this canary.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.syntheticsMod.SecurityGroupIds] = js.undefined
  
  /**
    * The IDs of the subnets where this canary is to run.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.syntheticsMod.SubnetIds] = js.undefined
}
object VpcConfigInput {
  
  inline def apply(): VpcConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigInput]
  }
  
  extension [Self <: VpcConfigInput](x: Self) {
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
