package typings.chromeApps.chrome.audio

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioDeviceInfo extends js.Object {
  /** Device name. */
  var deviceName: String
  /** Type of the device. */
  var deviceType: DeviceType
  /** The user-friendly name (e.g. 'USB Microphone'). */
  var displayName: String
  /** The unique identifier of the audio device. */
  var id: String
  /** True if this is the current active device. */
  var isActive: Boolean
  /** The sound level of the device, volume for output, gain for input. */
  var level: integer
  /** The stable/persisted device id string when available. */
  var stableDeviceId: js.UndefOr[String] = js.undefined
  /** Stream type associated with this device. */
  var streamType: StreamType
}

object AudioDeviceInfo {
  @scala.inline
  def apply(
    deviceName: String,
    deviceType: DeviceType,
    displayName: String,
    id: String,
    isActive: Boolean,
    level: integer,
    streamType: StreamType,
    stableDeviceId: String = null
  ): AudioDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    if (stableDeviceId != null) __obj.updateDynamic("stableDeviceId")(stableDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDeviceInfo]
  }
}

