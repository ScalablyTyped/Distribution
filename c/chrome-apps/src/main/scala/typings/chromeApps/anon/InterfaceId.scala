package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceId extends StObject {
  
  var interfaceId: js.UndefOr[integer] = js.undefined
  
  var productId: integer
  
  var vendorId: integer
}
object InterfaceId {
  
  inline def apply(productId: integer, vendorId: integer): InterfaceId = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterfaceId] (val x: Self) extends AnyVal {
    
    inline def setInterfaceId(value: integer): Self = StObject.set(x, "interfaceId", value.asInstanceOf[js.Any])
    
    inline def setInterfaceIdUndefined: Self = StObject.set(x, "interfaceId", js.undefined)
    
    inline def setProductId(value: integer): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: integer): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
