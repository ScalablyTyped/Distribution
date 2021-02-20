package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceId extends StObject {
  
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
  implicit class InterfaceIdMutableBuilder[Self <: InterfaceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterfaceId(value: integer): Self = StObject.set(x, "interfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceIdUndefined: Self = StObject.set(x, "interfaceId", js.undefined)
    
    @scala.inline
    def setProductId(value: integer): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: integer): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
