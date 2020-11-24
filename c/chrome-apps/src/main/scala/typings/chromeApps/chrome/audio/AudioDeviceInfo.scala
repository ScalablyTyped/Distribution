package typings.chromeApps.chrome.audio

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioDeviceInfo extends js.Object {
  
  /** Device name. */
  var deviceName: String = js.native
  
  /** Type of the device. */
  var deviceType: DeviceType = js.native
  
  /** The user-friendly name (e.g. 'USB Microphone'). */
  var displayName: String = js.native
  
  /** The unique identifier of the audio device. */
  var id: String = js.native
  
  /** True if this is the current active device. */
  var isActive: Boolean = js.native
  
  /** The sound level of the device, volume for output, gain for input. */
  var level: integer = js.native
  
  /** The stable/persisted device id string when available. */
  var stableDeviceId: js.UndefOr[String] = js.native
  
  /** Stream type associated with this device. */
  var streamType: StreamType = js.native
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
    streamType: StreamType
  ): AudioDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDeviceInfo]
  }
  
  @scala.inline
  implicit class AudioDeviceInfoOps[Self <: AudioDeviceInfo] (val x: Self) extends AnyVal {
    
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: DeviceType): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: integer): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamType(value: StreamType): Self = this.set("streamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStableDeviceId(value: String): Self = this.set("stableDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStableDeviceId: Self = this.set("stableDeviceId", js.undefined)
  }
}
