package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcConfigOutput extends StObject {
  
  /**
    * The IDs of the security groups for this canary.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.syntheticsMod.SecurityGroupIds] = js.native
  
  /**
    * The IDs of the subnets where this canary is to run.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.syntheticsMod.SubnetIds] = js.native
  
  /**
    * The IDs of the VPC where this canary is to run.
    */
  var VpcId: js.UndefOr[typings.awsSdk.syntheticsMod.VpcId] = js.native
}
object VpcConfigOutput {
  
  @scala.inline
  def apply(): VpcConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigOutput]
  }
  
  @scala.inline
  implicit class VpcConfigOutputMutableBuilder[Self <: VpcConfigOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
