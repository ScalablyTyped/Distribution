package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBDevicesPermission extends Permission {
  
  var usbDevices: js.Array[ProductId] = js.native
}
object USBDevicesPermission {
  
  @scala.inline
  def apply(usbDevices: js.Array[ProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal(usbDevices = usbDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDevicesPermission]
  }
  
  @scala.inline
  implicit class USBDevicesPermissionOps[Self <: USBDevicesPermission] (val x: Self) extends AnyVal {
    
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
    def setUsbDevicesVarargs(value: ProductId*): Self = this.set("usbDevices", js.Array(value :_*))
    
    @scala.inline
    def setUsbDevices(value: js.Array[ProductId]): Self = this.set("usbDevices", value.asInstanceOf[js.Any])
  }
}
