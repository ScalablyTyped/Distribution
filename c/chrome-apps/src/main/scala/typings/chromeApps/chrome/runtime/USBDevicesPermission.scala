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
  
  inline def apply(usbDevices: js.Array[ProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal(usbDevices = usbDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDevicesPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBDevicesPermission] (val x: Self) extends AnyVal {
    
    inline def setUsbDevices(value: js.Array[ProductId]): Self = StObject.set(x, "usbDevices", value.asInstanceOf[js.Any])
    
    inline def setUsbDevicesVarargs(value: ProductId*): Self = StObject.set(x, "usbDevices", js.Array(value*))
  }
}
