package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInSlotTypeSortBy extends StObject {
  
  /**
    * The attribute to use to sort the list of built-in intents.
    */
  var attribute: BuiltInSlotTypeSortAttribute
  
  /**
    * The order to sort the list. You can choose ascending or descending.
    */
  var order: SortOrder
}
object BuiltInSlotTypeSortBy {
  
  inline def apply(attribute: BuiltInSlotTypeSortAttribute, order: SortOrder): BuiltInSlotTypeSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInSlotTypeSortBy]
  }
  
  extension [Self <: BuiltInSlotTypeSortBy](x: Self) {
    
    inline def setAttribute(value: BuiltInSlotTypeSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
