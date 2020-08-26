package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroupProvider extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
    */
  var autoScalingGroupArn: String = js.native
  /**
    * The managed scaling settings for the Auto Scaling group capacity provider.
    */
  var managedScaling: js.UndefOr[ManagedScaling] = js.native
  /**
    * The managed termination protection setting to use for the Auto Scaling group capacity provider. This determines whether the Auto Scaling group has managed termination protection.  When using managed termination protection, managed scaling must also be used otherwise managed termination protection will not work.  When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto Scaling group that contain tasks from being terminated during a scale-in action. The Auto Scaling group and each instance in the Auto Scaling group must have instance protection from scale-in actions enabled as well. For more information, see Instance Protection in the AWS Auto Scaling User Guide. When managed termination protection is disabled, your Amazon EC2 instances are not protected from termination when the Auto Scaling group scales in.
    */
  var managedTerminationProtection: js.UndefOr[ManagedTerminationProtection] = js.native
}

object AutoScalingGroupProvider {
  @scala.inline
  def apply(autoScalingGroupArn: String): AutoScalingGroupProvider = {
    val __obj = js.Dynamic.literal(autoScalingGroupArn = autoScalingGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroupProvider]
  }
  @scala.inline
  implicit class AutoScalingGroupProviderOps[Self <: AutoScalingGroupProvider] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupArn(value: String): Self = this.set("autoScalingGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagedScaling(value: ManagedScaling): Self = this.set("managedScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedScaling: Self = this.set("managedScaling", js.undefined)
    @scala.inline
    def setManagedTerminationProtection(value: ManagedTerminationProtection): Self = this.set("managedTerminationProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedTerminationProtection: Self = this.set("managedTerminationProtection", js.undefined)
  }
  
}

