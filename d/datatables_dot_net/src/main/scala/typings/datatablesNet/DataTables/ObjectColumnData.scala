package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectColumnData extends StObject {
  
  @JSName("_")
  var _underscore: String | Double | FunctionColumnData
  
  var display: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
  
  var filter: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
  
  var sort: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
  
  var `type`: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
}
object ObjectColumnData {
  
  inline def apply(_underscore: String | Double | FunctionColumnData): ObjectColumnData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectColumnData]
  }
  
  extension [Self <: ObjectColumnData](x: Self) {
    
    inline def setDisplay(value: String | Double | FunctionColumnData): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFilter(value: String | Double | FunctionColumnData): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setSort(value: String | Double | FunctionColumnData): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: String | Double | FunctionColumnData): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_underscore(value: String | Double | FunctionColumnData): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
