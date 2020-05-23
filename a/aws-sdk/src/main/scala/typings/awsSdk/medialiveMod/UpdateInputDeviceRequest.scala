package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputDeviceRequest extends js.Object {
  /**
    * The settings that you want to apply to the input device.
    */
  var HdDeviceSettings: js.UndefOr[InputDeviceConfigurableSettings] = js.native
  /**
    * The unique ID of the input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
  /**
    * The name that you assigned to this input device (not the unique ID).
    */
  var Name: js.UndefOr[string] = js.native
}

object UpdateInputDeviceRequest {
  @scala.inline
  def apply(
    InputDeviceId: string,
    HdDeviceSettings: InputDeviceConfigurableSettings = null,
    Name: string = null
  ): UpdateInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    if (HdDeviceSettings != null) __obj.updateDynamic("HdDeviceSettings")(HdDeviceSettings.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputDeviceRequest]
  }
}

