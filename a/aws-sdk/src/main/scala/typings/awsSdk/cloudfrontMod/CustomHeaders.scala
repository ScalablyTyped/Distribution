package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomHeaders extends StObject {
  
  /**
    *  Optional: A list that contains one OriginCustomHeader element for each custom header that you want CloudFront to forward to the origin. If Quantity is 0, omit Items.
    */
  var Items: js.UndefOr[OriginCustomHeadersList] = js.undefined
  
  /**
    * The number of custom headers, if any, for this distribution.
    */
  var Quantity: integer
}
object CustomHeaders {
  
  inline def apply(Quantity: integer): CustomHeaders = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeaders]
  }
  
  extension [Self <: CustomHeaders](x: Self) {
    
    inline def setItems(value: OriginCustomHeadersList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: OriginCustomHeader*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
