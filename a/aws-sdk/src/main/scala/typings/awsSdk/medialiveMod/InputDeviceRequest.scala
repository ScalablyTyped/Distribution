package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDeviceRequest extends js.Object {
  /**
    * The unique ID for the device.
    */
  var Id: js.UndefOr[string] = js.native
}

object InputDeviceRequest {
  @scala.inline
  def apply(Id: string = null): InputDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDeviceRequest]
  }
}

