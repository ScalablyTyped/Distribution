package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDeviceHdSettings extends js.Object {
  /**
    * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
    */
  var ActiveInput: js.UndefOr[InputDeviceActiveInput] = js.native
  /**
    * The source at the input device that is currently active. You can specify this source.
    */
  var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.native
  /**
    * The state of the input device.
    */
  var DeviceState: js.UndefOr[InputDeviceState] = js.native
  /**
    * The frame rate of the video source.
    */
  var Framerate: js.UndefOr[double] = js.native
  /**
    * The height of the video source, in pixels.
    */
  var Height: js.UndefOr[integer] = js.native
  /**
    * The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
  /**
    * The scan type of the video source.
    */
  var ScanType: js.UndefOr[InputDeviceScanType] = js.native
  /**
    * The width of the video source, in pixels.
    */
  var Width: js.UndefOr[integer] = js.native
}

object InputDeviceHdSettings {
  @scala.inline
  def apply(
    ActiveInput: InputDeviceActiveInput = null,
    ConfiguredInput: InputDeviceConfiguredInput = null,
    DeviceState: InputDeviceState = null,
    Framerate: js.UndefOr[double] = js.undefined,
    Height: js.UndefOr[integer] = js.undefined,
    MaxBitrate: js.UndefOr[integer] = js.undefined,
    ScanType: InputDeviceScanType = null,
    Width: js.UndefOr[integer] = js.undefined
  ): InputDeviceHdSettings = {
    val __obj = js.Dynamic.literal()
    if (ActiveInput != null) __obj.updateDynamic("ActiveInput")(ActiveInput.asInstanceOf[js.Any])
    if (ConfiguredInput != null) __obj.updateDynamic("ConfiguredInput")(ConfiguredInput.asInstanceOf[js.Any])
    if (DeviceState != null) __obj.updateDynamic("DeviceState")(DeviceState.asInstanceOf[js.Any])
    if (!js.isUndefined(Framerate)) __obj.updateDynamic("Framerate")(Framerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate.get.asInstanceOf[js.Any])
    if (ScanType != null) __obj.updateDynamic("ScanType")(ScanType.asInstanceOf[js.Any])
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDeviceHdSettings]
  }
}

