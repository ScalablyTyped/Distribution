package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriteria extends StObject {
  
  /**
    * The finding detail field by which results are sorted.
    */
  var field: SortField
  
  /**
    * The order by which findings are sorted.
    */
  var sortOrder: SortOrder
}
object SortCriteria {
  
  inline def apply(field: SortField, sortOrder: SortOrder): SortCriteria = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriteria]
  }
  
  extension [Self <: SortCriteria](x: Self) {
    
    inline def setField(value: SortField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
