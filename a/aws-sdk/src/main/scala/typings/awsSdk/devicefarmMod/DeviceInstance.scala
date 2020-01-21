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
  def apply(
    arn: AmazonResourceName = null,
    deviceArn: AmazonResourceName = null,
    instanceProfile: InstanceProfile = null,
    labels: InstanceLabels = null,
    status: InstanceStatus = null,
    udid: String = null
  ): DeviceInstance = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (deviceArn != null) __obj.updateDynamic("deviceArn")(deviceArn.asInstanceOf[js.Any])
    if (instanceProfile != null) __obj.updateDynamic("instanceProfile")(instanceProfile.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (udid != null) __obj.updateDynamic("udid")(udid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInstance]
  }
}

