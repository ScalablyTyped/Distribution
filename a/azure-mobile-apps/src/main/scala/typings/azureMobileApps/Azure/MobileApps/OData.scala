package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OData extends StObject {
  
  var filters: js.UndefOr[String] = js.undefined
  
  var includeTotalCount: js.UndefOr[Boolean] = js.undefined
  
  var orderClauses: js.UndefOr[String] = js.undefined
  
  var ordering: js.UndefOr[String] = js.undefined
  
  var selections: js.UndefOr[String] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var table: String
  
  var take: js.UndefOr[Double] = js.undefined
}
object OData {
  
  inline def apply(table: String): OData = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[OData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OData] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setIncludeTotalCount(value: Boolean): Self = StObject.set(x, "includeTotalCount", value.asInstanceOf[js.Any])
    
    inline def setIncludeTotalCountUndefined: Self = StObject.set(x, "includeTotalCount", js.undefined)
    
    inline def setOrderClauses(value: String): Self = StObject.set(x, "orderClauses", value.asInstanceOf[js.Any])
    
    inline def setOrderClausesUndefined: Self = StObject.set(x, "orderClauses", js.undefined)
    
    inline def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    inline def setSelections(value: String): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
  }
}
