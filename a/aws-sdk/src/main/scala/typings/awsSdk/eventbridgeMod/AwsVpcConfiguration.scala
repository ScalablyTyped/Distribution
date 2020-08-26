package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsVpcConfiguration extends js.Object {
  /**
    * Specifies whether the task's elastic network interface receives a public IP address. You can specify ENABLED only when LaunchType in EcsParameters is set to FARGATE.
    */
  var AssignPublicIp: js.UndefOr[typings.awsSdk.eventbridgeMod.AssignPublicIp] = js.native
  /**
    * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You can specify as many as five security groups. If you do not specify a security group, the default security group for the VPC is used.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.native
  /**
    * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as many as 16 subnets.
    */
  var Subnets: StringList = js.native
}

object AwsVpcConfiguration {
  @scala.inline
  def apply(Subnets: StringList): AwsVpcConfiguration = {
    val __obj = js.Dynamic.literal(Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsVpcConfiguration]
  }
  @scala.inline
  implicit class AwsVpcConfigurationOps[Self <: AwsVpcConfiguration] (val x: Self) extends AnyVal {
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
    def setSubnetsVarargs(value: String*): Self = this.set("Subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: StringList): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignPublicIp(value: AssignPublicIp): Self = this.set("AssignPublicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignPublicIp: Self = this.set("AssignPublicIp", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: StringList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
  }
  
}

