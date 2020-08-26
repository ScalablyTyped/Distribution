package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceViolation extends js.Object {
  /**
    * Violation details for an EC2 instance.
    */
  var AwsEc2InstanceViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2InstanceViolation] = js.native
  /**
    * Violation details for network interface.
    */
  var AwsEc2NetworkInterfaceViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2NetworkInterfaceViolation] = js.native
  /**
    * Violation details for security groups.
    */
  var AwsVPCSecurityGroupViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsVPCSecurityGroupViolation] = js.native
}

object ResourceViolation {
  @scala.inline
  def apply(): ResourceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceViolation]
  }
  @scala.inline
  implicit class ResourceViolationOps[Self <: ResourceViolation] (val x: Self) extends AnyVal {
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
    def setAwsEc2InstanceViolation(value: AwsEc2InstanceViolation): Self = this.set("AwsEc2InstanceViolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsEc2InstanceViolation: Self = this.set("AwsEc2InstanceViolation", js.undefined)
    @scala.inline
    def setAwsEc2NetworkInterfaceViolation(value: AwsEc2NetworkInterfaceViolation): Self = this.set("AwsEc2NetworkInterfaceViolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsEc2NetworkInterfaceViolation: Self = this.set("AwsEc2NetworkInterfaceViolation", js.undefined)
    @scala.inline
    def setAwsVPCSecurityGroupViolation(value: AwsVPCSecurityGroupViolation): Self = this.set("AwsVPCSecurityGroupViolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsVPCSecurityGroupViolation: Self = this.set("AwsVPCSecurityGroupViolation", js.undefined)
  }
  
}

