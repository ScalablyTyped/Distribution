package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStringNames extends StObject {
  
  /**
    * A list of query string names.
    */
  var Items: js.UndefOr[QueryStringNamesList] = js.undefined
  
  /**
    * The number of query string names in the Items list.
    */
  var Quantity: integer
}
object QueryStringNames {
  
  inline def apply(Quantity: integer): QueryStringNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringNames]
  }
  
  extension [Self <: QueryStringNames](x: Self) {
    
    inline def setItems(value: QueryStringNamesList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
