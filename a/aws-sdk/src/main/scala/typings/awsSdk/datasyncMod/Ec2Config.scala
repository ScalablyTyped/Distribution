package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ec2Config extends js.Object {
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList = js.native
  /**
    * The ARN of the subnet and the security group that DataSync uses to access the target EFS file system.
    */
  var SubnetArn: Ec2SubnetArn = js.native
}

object Ec2Config {
  @scala.inline
  def apply(SecurityGroupArns: Ec2SecurityGroupArnList, SubnetArn: Ec2SubnetArn): Ec2Config = {
    val __obj = js.Dynamic.literal(SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], SubnetArn = SubnetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2Config]
  }
  @scala.inline
  implicit class Ec2ConfigOps[Self <: Ec2Config] (val x: Self) extends AnyVal {
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
    def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = this.set("SecurityGroupArns", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = this.set("SecurityGroupArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetArn(value: Ec2SubnetArn): Self = this.set("SubnetArn", value.asInstanceOf[js.Any])
  }
  
}

