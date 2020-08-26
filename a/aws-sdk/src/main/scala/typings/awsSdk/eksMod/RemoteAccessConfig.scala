package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteAccessConfig extends js.Object {
  /**
    * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed node group. For more information, see Amazon EC2 Key Pairs in the Amazon Elastic Compute Cloud User Guide for Linux Instances.
    */
  var ec2SshKey: js.UndefOr[String] = js.native
  /**
    * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH key but do not specify a source security group when you create a managed node group, then port 22 on the worker nodes is opened to the internet (0.0.0.0/0). For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var sourceSecurityGroups: js.UndefOr[StringList] = js.native
}

object RemoteAccessConfig {
  @scala.inline
  def apply(): RemoteAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAccessConfig]
  }
  @scala.inline
  implicit class RemoteAccessConfigOps[Self <: RemoteAccessConfig] (val x: Self) extends AnyVal {
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
    def setEc2SshKey(value: String): Self = this.set("ec2SshKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2SshKey: Self = this.set("ec2SshKey", js.undefined)
    @scala.inline
    def setSourceSecurityGroupsVarargs(value: String*): Self = this.set("sourceSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSourceSecurityGroups(value: StringList): Self = this.set("sourceSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSecurityGroups: Self = this.set("sourceSecurityGroups", js.undefined)
  }
  
}

