package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInstance extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The ARN of the device.
    */
  var deviceArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * A object that contains information about the instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
  /**
    * An array of strings that describe the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.native
  /**
    * The status of the device instance. Valid values are listed here.
    */
  var status: js.UndefOr[InstanceStatus] = js.native
  /**
    * Unique device identifier for the device instance.
    */
  var udid: js.UndefOr[String] = js.native
}

object DeviceInstance {
  @scala.inline
  def apply(): DeviceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInstance]
  }
  @scala.inline
  implicit class DeviceInstanceOps[Self <: DeviceInstance] (val x: Self) extends AnyVal {
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDeviceArn(value: AmazonResourceName): Self = this.set("deviceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceArn: Self = this.set("deviceArn", js.undefined)
    @scala.inline
    def setInstanceProfile(value: InstanceProfile): Self = this.set("instanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceProfile: Self = this.set("instanceProfile", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: InstanceLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setStatus(value: InstanceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUdid(value: String): Self = this.set("udid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdid: Self = this.set("udid", js.undefined)
  }
  
}

