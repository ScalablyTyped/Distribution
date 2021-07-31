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
  
  @scala.inline
  def apply(Quantity: integer): QueryStringNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringNames]
  }
  
  @scala.inline
  implicit class QueryStringNamesMutableBuilder[Self <: QueryStringNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: QueryStringNamesList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
