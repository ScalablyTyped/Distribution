package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aliases extends StObject {
  
  /**
    * A complex type that contains the CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Items: js.UndefOr[AliasList] = js.undefined
  
  /**
    * The number of CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Quantity: integer
}
object Aliases {
  
  inline def apply(Quantity: integer): Aliases = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
  
  extension [Self <: Aliases](x: Self) {
    
    inline def setItems(value: AliasList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
