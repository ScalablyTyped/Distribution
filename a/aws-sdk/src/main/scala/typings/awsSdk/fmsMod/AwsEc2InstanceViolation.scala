package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2InstanceViolation extends js.Object {
  /**
    * Violations for network interfaces associated with the EC2 instance.
    */
  var AwsEc2NetworkInterfaceViolations: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2NetworkInterfaceViolations] = js.native
  /**
    * The resource ID of the EC2 instance.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.native
}

object AwsEc2InstanceViolation {
  @scala.inline
  def apply(): AwsEc2InstanceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceViolation]
  }
  @scala.inline
  implicit class AwsEc2InstanceViolationOps[Self <: AwsEc2InstanceViolation] (val x: Self) extends AnyVal {
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
    def setAwsEc2NetworkInterfaceViolationsVarargs(value: AwsEc2NetworkInterfaceViolation*): Self = this.set("AwsEc2NetworkInterfaceViolations", js.Array(value :_*))
    @scala.inline
    def setAwsEc2NetworkInterfaceViolations(value: AwsEc2NetworkInterfaceViolations): Self = this.set("AwsEc2NetworkInterfaceViolations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsEc2NetworkInterfaceViolations: Self = this.set("AwsEc2NetworkInterfaceViolations", js.undefined)
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = this.set("ViolationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolationTarget: Self = this.set("ViolationTarget", js.undefined)
  }
  
}

