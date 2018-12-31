package typings
package chromeDashAppsLib.chromeNs.audioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioDeviceInfo extends js.Object {
  /** Device name. */
  var deviceName: java.lang.String
  /** Type of the device. */
  var deviceType: DeviceType
  /** The user-friendly name (e.g. 'USB Microphone'). */
  var displayName: java.lang.String
  /** The unique identifier of the audio device. */
  var id: java.lang.String
  /** True if this is the current active device. */
  var isActive: scala.Boolean
  /** The sound level of the device, volume for output, gain for input. */
  var level: chromeDashAppsLib.chromeNs.integer
  /** The stable/persisted device id string when available. */
  var stableDeviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Stream type associated with this device. */
  var streamType: StreamType
}

