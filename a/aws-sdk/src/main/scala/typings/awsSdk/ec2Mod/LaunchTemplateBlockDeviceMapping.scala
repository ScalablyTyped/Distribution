package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateBlockDeviceMapping extends js.Object {
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * Information about the block device for an EBS volume.
    */
  var Ebs: js.UndefOr[LaunchTemplateEbsBlockDevice] = js.native
  /**
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.native
  /**
    * The virtual device name (ephemeralN).
    */
  var VirtualName: js.UndefOr[String] = js.native
}

object LaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(
    DeviceName: String = null,
    Ebs: LaunchTemplateEbsBlockDevice = null,
    NoDevice: String = null,
    VirtualName: String = null
  ): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs.asInstanceOf[js.Any])
    if (NoDevice != null) __obj.updateDynamic("NoDevice")(NoDevice.asInstanceOf[js.Any])
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
}

