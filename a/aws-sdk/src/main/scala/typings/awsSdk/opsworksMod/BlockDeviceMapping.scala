package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockDeviceMapping extends js.Object {
  /**
    * The device name that is exposed to the instance, such as /dev/sdh. For the root device, you can use the explicit device name or you can set this parameter to ROOT_DEVICE and AWS OpsWorks Stacks will provide the correct device name.
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * An EBSBlockDevice that defines how to configure an Amazon EBS volume when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsBlockDevice] = js.native
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var NoDevice: js.UndefOr[String] = js.native
  /**
    * The virtual device name. For more information, see BlockDeviceMapping.
    */
  var VirtualName: js.UndefOr[String] = js.native
}

object BlockDeviceMapping {
  @scala.inline
  def apply(
    DeviceName: String = null,
    Ebs: EbsBlockDevice = null,
    NoDevice: String = null,
    VirtualName: String = null
  ): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs.asInstanceOf[js.Any])
    if (NoDevice != null) __obj.updateDynamic("NoDevice")(NoDevice.asInstanceOf[js.Any])
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeviceMapping]
  }
}

