package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.ProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBDevicesPermission
  extends StObject
     with Permission {
  
  var usbDevices: js.Array[ProductId]
}
object USBDevicesPermission {
  
  @scala.inline
  def apply(usbDevices: js.Array[ProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal(usbDevices = usbDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDevicesPermission]
  }
  
  @scala.inline
  implicit class USBDevicesPermissionMutableBuilder[Self <: USBDevicesPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsbDevices(value: js.Array[ProductId]): Self = StObject.set(x, "usbDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbDevicesVarargs(value: ProductId*): Self = StObject.set(x, "usbDevices", js.Array(value :_*))
  }
}
