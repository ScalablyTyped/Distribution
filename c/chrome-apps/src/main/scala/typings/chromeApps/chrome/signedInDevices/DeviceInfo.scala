package typings.chromeApps.chrome.signedInDevices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInfo extends js.Object {
  
  /** Version of chrome running in this device. */
  var chromeVersion: String = js.native
  
  /**
    * Unique Id for this device.
    * Note: The id is meaningful only in the current device.
    * This id cannot be used to refer to the same device from
    * another device or extension.
    */
  var id: String = js.native
  
  /**
    * Name of the device.
    * This name is usually set by the user when setting up a device.
    */
  var name: String = js.native
  
  /** The OS of the device. */
  var os: OS = js.native
  
  /** Device type */
  var `type`: DeviceType = js.native
}
object DeviceInfo {
  
  @scala.inline
  def apply(chromeVersion: String, id: String, name: String, os: OS, `type`: DeviceType): DeviceInfo = {
    val __obj = js.Dynamic.literal(chromeVersion = chromeVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  
  @scala.inline
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    
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
    def setChromeVersion(value: String): Self = this.set("chromeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: OS): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeviceType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
