package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectColumnRender extends StObject {
  
  @JSName("_")
  var _underscore: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  
  var display: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  
  var filter: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  
  var sort: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  
  var `type`: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
}
object ObjectColumnRender {
  
  @scala.inline
  def apply(): ObjectColumnRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectColumnRender]
  }
  
  @scala.inline
  implicit class ObjectColumnRenderMutableBuilder[Self <: ObjectColumnRender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: String | Double | FunctionColumnRender): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = StObject.set(x, "display", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setFilter(value: String | Double | FunctionColumnRender): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setSort(value: String | Double | FunctionColumnRender): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = StObject.set(x, "sort", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: String | Double | FunctionColumnRender): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = StObject.set(x, "type", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_underscore(value: String | Double | FunctionColumnRender): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_underscoreFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = StObject.set(x, "_", js.Any.fromFunction4(value))
    
    @scala.inline
    def set_underscoreUndefined: Self = StObject.set(x, "_", js.undefined)
  }
}
