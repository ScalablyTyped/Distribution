package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceId extends js.Object {
  
  var interfaceId: js.UndefOr[integer] = js.native
  
  var productId: integer = js.native
  
  var vendorId: integer = js.native
}
object InterfaceId {
  
  @scala.inline
  def apply(productId: integer, vendorId: integer): InterfaceId = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceId]
  }
  
  @scala.inline
  implicit class InterfaceIdOps[Self <: InterfaceId] (val x: Self) extends AnyVal {
    
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
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceId(value: integer): Self = this.set("interfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceId: Self = this.set("interfaceId", js.undefined)
  }
}
