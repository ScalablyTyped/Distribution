package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateReturnModel extends StObject {
  
  var columns: js.Array[StateReturnModelColumns]
  
  var length: Double
  
  var order: js.Array[js.Array[String | Double]]
  
  var search: SearchSettings
  
  var start: Double
  
  var time: Double
}
object StateReturnModel {
  
  inline def apply(
    columns: js.Array[StateReturnModelColumns],
    length: Double,
    order: js.Array[js.Array[String | Double]],
    search: SearchSettings,
    start: Double,
    time: Double
  ): StateReturnModel = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateReturnModel]
  }
  
  extension [Self <: StateReturnModel](x: Self) {
    
    inline def setColumns(value: js.Array[StateReturnModelColumns]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: StateReturnModelColumns*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setSearch(value: SearchSettings): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
