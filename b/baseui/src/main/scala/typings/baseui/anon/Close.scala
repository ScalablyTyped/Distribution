package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close[Value, FilterParams] extends StObject {
  
  def close(): Unit
  
  var data: js.Array[Value]
  
  var filterParams: js.UndefOr[FilterParams] = js.undefined
  
  def setFilter(a: FilterParams): Unit
}
object Close {
  
  inline def apply[Value, FilterParams](close: () => Unit, data: js.Array[Value], setFilter: FilterParams => Unit): Close[Value, FilterParams] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = data.asInstanceOf[js.Any], setFilter = js.Any.fromFunction1(setFilter))
    __obj.asInstanceOf[Close[Value, FilterParams]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Close[?, ?], Value, FilterParams] (val x: Self & (Close[Value, FilterParams])) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setData(value: js.Array[Value]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Value*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFilterParams(value: FilterParams): Self = StObject.set(x, "filterParams", value.asInstanceOf[js.Any])
    
    inline def setFilterParamsUndefined: Self = StObject.set(x, "filterParams", js.undefined)
    
    inline def setSetFilter(value: FilterParams => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
  }
}
