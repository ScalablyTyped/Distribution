package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsVpcConfiguration extends js.Object {
  /**
    * Specifies whether the task's elastic network interface receives a public IP address. You can specify ENABLED only when LaunchType in EcsParameters is set to FARGATE.
    */
  var AssignPublicIp: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.AssignPublicIp] = js.native
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
  def apply(Subnets: StringList, AssignPublicIp: AssignPublicIp = null, SecurityGroups: StringList = null): AwsVpcConfiguration = {
    val __obj = js.Dynamic.literal(Subnets = Subnets.asInstanceOf[js.Any])
    if (AssignPublicIp != null) __obj.updateDynamic("AssignPublicIp")(AssignPublicIp.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsVpcConfiguration]
  }
}

