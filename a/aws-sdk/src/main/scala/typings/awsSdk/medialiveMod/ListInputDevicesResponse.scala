package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputDevicesResponse extends js.Object {
  /**
    * The list of input devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSummary] = js.native
  /**
    * A token to get additional list results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListInputDevicesResponse {
  @scala.inline
  def apply(InputDevices: listOfInputDeviceSummary = null, NextToken: string = null): ListInputDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (InputDevices != null) __obj.updateDynamic("InputDevices")(InputDevices.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputDevicesResponse]
  }
}

