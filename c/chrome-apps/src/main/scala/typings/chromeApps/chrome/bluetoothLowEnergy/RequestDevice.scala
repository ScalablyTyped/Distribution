package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDevice extends js.Object {
  
  /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String = js.native
  
  /** The class of the device, a bit - field defined by:
    * @see [Specs]{@link http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband}
    **/
  var deviceClass: js.UndefOr[integer] = js.native
  
  /** The human-readable name of the device. */
  var name: js.UndefOr[String] = js.native
}
object RequestDevice {
  
  @scala.inline
  def apply(address: String): RequestDevice = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDevice]
  }
  
  @scala.inline
  implicit class RequestDeviceOps[Self <: RequestDevice] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceClass(value: integer): Self = this.set("deviceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceClass: Self = this.set("deviceClass", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
