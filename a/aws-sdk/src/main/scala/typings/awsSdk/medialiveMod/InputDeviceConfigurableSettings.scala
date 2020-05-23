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
  def apply(ConfiguredInput: InputDeviceConfiguredInput = null, MaxBitrate: js.UndefOr[integer] = js.undefined): InputDeviceConfigurableSettings = {
    val __obj = js.Dynamic.literal()
    if (ConfiguredInput != null) __obj.updateDynamic("ConfiguredInput")(ConfiguredInput.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDeviceConfigurableSettings]
  }
}

