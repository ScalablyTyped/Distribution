package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigResponse extends StObject {
  
  /**
    * A list of VPC security groups IDs.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.lambdaMod.SecurityGroupIds] = js.undefined
  
  /**
    * A list of VPC subnet IDs.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.lambdaMod.SubnetIds] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.lambdaMod.VpcId] = js.undefined
}
object VpcConfigResponse {
  
  @scala.inline
  def apply(): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigResponse]
  }
  
  @scala.inline
  implicit class VpcConfigResponseMutableBuilder[Self <: VpcConfigResponse] (val x: Self) extends AnyVal {
    
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
