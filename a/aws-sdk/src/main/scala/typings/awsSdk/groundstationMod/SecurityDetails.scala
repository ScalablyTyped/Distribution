package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityDetails extends js.Object {
  /**
    * ARN to a role needed for connecting streams to your instances. 
    */
  var roleArn: RoleArn = js.native
  /**
    * The security groups to attach to the elastic network interfaces.
    */
  var securityGroupIds: SecurityGroupIdList = js.native
  /**
    * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
    */
  var subnetIds: SubnetList = js.native
}

object SecurityDetails {
  @scala.inline
  def apply(roleArn: RoleArn, securityGroupIds: SecurityGroupIdList, subnetIds: SubnetList): SecurityDetails = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDetails]
  }
  @scala.inline
  implicit class SecurityDetailsOps[Self <: SecurityDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetList): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
  }
  
}

