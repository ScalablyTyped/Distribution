package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since Chrome 39. */
/* Inlined parent std.Partial<chrome-apps.chrome.usb.DeviceFilterStrict> */
@js.native
trait DeviceFilter extends js.Object {
  
  var interfaceClass: js.UndefOr[integer] = js.native
  
  var interfaceProtocol: js.UndefOr[integer] = js.native
  
  var interfaceSubclass: js.UndefOr[integer] = js.native
  
  var productId: js.UndefOr[integer] = js.native
  
  var vendorId: js.UndefOr[integer] = js.native
}
object DeviceFilter {
  
  @scala.inline
  def apply(): DeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFilter]
  }
  
  @scala.inline
  implicit class DeviceFilterOps[Self <: DeviceFilter] (val x: Self) extends AnyVal {
    
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
    def setInterfaceClass(value: integer): Self = this.set("interfaceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceClass: Self = this.set("interfaceClass", js.undefined)
    
    @scala.inline
    def setInterfaceProtocol(value: integer): Self = this.set("interfaceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceProtocol: Self = this.set("interfaceProtocol", js.undefined)
    
    @scala.inline
    def setInterfaceSubclass(value: integer): Self = this.set("interfaceSubclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceSubclass: Self = this.set("interfaceSubclass", js.undefined)
    
    @scala.inline
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
  }
}
