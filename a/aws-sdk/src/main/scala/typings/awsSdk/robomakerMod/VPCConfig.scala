package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPCConfig extends js.Object {
  
  /**
    * A boolean indicating whether to assign a public IP address.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of one or more security groups IDs in your VPC.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  
  /**
    * A list of one or more subnet IDs in your VPC.
    */
  var subnets: Subnets = js.native
}
object VPCConfig {
  
  @scala.inline
  def apply(subnets: Subnets): VPCConfig = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCConfig]
  }
  
  @scala.inline
  implicit class VPCConfigOps[Self <: VPCConfig] (val x: Self) extends AnyVal {
    
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
    def setSubnetsVarargs(value: NonEmptyString*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
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
  }
}
