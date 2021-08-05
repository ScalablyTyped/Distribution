package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStringCacheKeys extends StObject {
  
  /**
    * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a cache behavior. If Quantity is 0, you can omit Items. 
    */
  var Items: js.UndefOr[QueryStringCacheKeysList] = js.undefined
  
  /**
    * The number of whitelisted query string parameters for a cache behavior.
    */
  var Quantity: integer
}
object QueryStringCacheKeys {
  
  inline def apply(Quantity: integer): QueryStringCacheKeys = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringCacheKeys]
  }
  
  extension [Self <: QueryStringCacheKeys](x: Self) {
    
    inline def setItems(value: QueryStringCacheKeysList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
