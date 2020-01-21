package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceBlockDeviceMapping extends js.Object {
  /**
    * The device to which these mappings apply.
    */
  var deviceName: js.UndefOr[NonEmptyString] = js.native
  /**
    * Use to manage EBS specific configuration for this mapping.
    */
  var ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.native
  /**
    * Use to remove a mapping from the parent image.
    */
  var noDevice: js.UndefOr[NonEmptyString] = js.native
  /**
    * Use to manage instance ephemeral devices.
    */
  var virtualName: js.UndefOr[NonEmptyString] = js.native
}

object InstanceBlockDeviceMapping {
  @scala.inline
  def apply(
    deviceName: NonEmptyString = null,
    ebs: EbsInstanceBlockDeviceSpecification = null,
    noDevice: NonEmptyString = null,
    virtualName: NonEmptyString = null
  ): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (ebs != null) __obj.updateDynamic("ebs")(ebs.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
}

