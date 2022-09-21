package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInIntentSortBy extends StObject {
  
  /**
    * The attribute to use to sort the list of built-in intents.
    */
  var attribute: BuiltInIntentSortAttribute
  
  /**
    * The order to sort the list. You can specify ascending or descending order.
    */
  var order: SortOrder
}
object BuiltInIntentSortBy {
  
  inline def apply(attribute: BuiltInIntentSortAttribute, order: SortOrder): BuiltInIntentSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInIntentSortBy]
  }
  
  extension [Self <: BuiltInIntentSortBy](x: Self) {
    
    inline def setAttribute(value: BuiltInIntentSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
