package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPCConfigResponse extends js.Object {
  
  /**
    * A boolean indicating if a public IP was assigned.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of security group IDs associated with the simulation job.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  
  /**
    * A list of subnet IDs associated with the simulation job.
    */
  var subnets: js.UndefOr[Subnets] = js.native
  
  /**
    * The VPC ID associated with your simulation job.
    */
  var vpcId: js.UndefOr[GenericString] = js.native
}
object VPCConfigResponse {
  
  @scala.inline
  def apply(): VPCConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCConfigResponse]
  }
  
  @scala.inline
  implicit class VPCConfigResponseOps[Self <: VPCConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssignPublicIp(value: Boolean): Self = this.set("assignPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignPublicIp: Self = this.set("assignPublicIp", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: NonEmptyString*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnets: Self = this.set("subnets", js.undefined)
    
    @scala.inline
    def setVpcId(value: GenericString): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
