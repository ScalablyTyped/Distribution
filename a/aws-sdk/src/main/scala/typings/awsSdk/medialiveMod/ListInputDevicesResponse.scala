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
  def apply(): ListInputDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputDevicesResponse]
  }
  @scala.inline
  implicit class ListInputDevicesResponseOps[Self <: ListInputDevicesResponse] (val x: Self) extends AnyVal {
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
    def setInputDevicesVarargs(value: InputDeviceSummary*): Self = this.set("InputDevices", js.Array(value :_*))
    @scala.inline
    def setInputDevices(value: listOfInputDeviceSummary): Self = this.set("InputDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDevices: Self = this.set("InputDevices", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

