package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCConfigResponse extends StObject {
  
  /**
    * A boolean indicating if a public IP was assigned.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of security group IDs associated with the simulation job.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
  
  /**
    * A list of subnet IDs associated with the simulation job.
    */
  var subnets: js.UndefOr[Subnets] = js.undefined
  
  /**
    * The VPC ID associated with your simulation job.
    */
  var vpcId: js.UndefOr[GenericString] = js.undefined
}
object VPCConfigResponse {
  
  @scala.inline
  def apply(): VPCConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCConfigResponse]
  }
  
  @scala.inline
  implicit class VPCConfigResponseMutableBuilder[Self <: VPCConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignPublicIp(value: Boolean): Self = StObject.set(x, "assignPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignPublicIpUndefined: Self = StObject.set(x, "assignPublicIp", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: GenericString): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
