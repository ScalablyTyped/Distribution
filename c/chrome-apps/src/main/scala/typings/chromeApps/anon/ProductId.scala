package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductId extends StObject {
  
  var productId: integer
  
  var vendorId: integer
}
object ProductId {
  
  inline def apply(productId: integer, vendorId: integer): ProductId = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductId]
  }
  
  extension [Self <: ProductId](x: Self) {
    
    inline def setProductId(value: integer): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: integer): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
