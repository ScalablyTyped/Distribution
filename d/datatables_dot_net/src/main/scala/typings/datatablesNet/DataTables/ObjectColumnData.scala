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
  
  @scala.inline
  def apply(_underscore: String | Double | FunctionColumnData): ObjectColumnData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectColumnData]
  }
  
  @scala.inline
  implicit class ObjectColumnDataMutableBuilder[Self <: ObjectColumnData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: String | Double | FunctionColumnData): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setFilter(value: String | Double | FunctionColumnData): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setSort(value: String | Double | FunctionColumnData): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: String | Double | FunctionColumnData): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_underscore(value: String | Double | FunctionColumnData): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
