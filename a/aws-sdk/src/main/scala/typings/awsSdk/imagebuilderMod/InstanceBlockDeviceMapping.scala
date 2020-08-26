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
    * Use to manage Amazon EBS-specific configuration for this mapping.
    */
  var ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.native
  /**
    * Use to remove a mapping from the parent image.
    */
  var noDevice: js.UndefOr[EmptyString] = js.native
  /**
    * Use to manage instance ephemeral devices.
    */
  var virtualName: js.UndefOr[NonEmptyString] = js.native
}

object InstanceBlockDeviceMapping {
  @scala.inline
  def apply(): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
  @scala.inline
  implicit class InstanceBlockDeviceMappingOps[Self <: InstanceBlockDeviceMapping] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: NonEmptyString): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setEbs(value: EbsInstanceBlockDeviceSpecification): Self = this.set("ebs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbs: Self = this.set("ebs", js.undefined)
    @scala.inline
    def setNoDevice(value: EmptyString): Self = this.set("noDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDevice: Self = this.set("noDevice", js.undefined)
    @scala.inline
    def setVirtualName(value: NonEmptyString): Self = this.set("virtualName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualName: Self = this.set("virtualName", js.undefined)
  }
  
}

