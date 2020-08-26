package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDeviceConfigurableSettings extends js.Object {
  /**
    * The input source that you want to use. If the device has a source connected to only one of its input ports, or if you don't care which source the device sends, specify Auto. If the device has sources connected to both its input ports, and you want to use a specific source, specify the source.
    */
  var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.native
  /**
    * The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
}

object InputDeviceConfigurableSettings {
  @scala.inline
  def apply(): InputDeviceConfigurableSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceConfigurableSettings]
  }
  @scala.inline
  implicit class InputDeviceConfigurableSettingsOps[Self <: InputDeviceConfigurableSettings] (val x: Self) extends AnyVal {
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
    def setConfiguredInput(value: InputDeviceConfiguredInput): Self = this.set("ConfiguredInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguredInput: Self = this.set("ConfiguredInput", js.undefined)
    @scala.inline
    def setMaxBitrate(value: integer): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
  }
  
}

