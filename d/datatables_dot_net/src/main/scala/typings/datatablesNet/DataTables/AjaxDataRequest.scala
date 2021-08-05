package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "ajax-settings"
trait AjaxDataRequest extends StObject {
  
  var columns: js.Array[AjaxDataRequestColumn]
  
  var data: js.Any
  
  var draw: Double
  
  var length: Double
  
  var order: js.Array[AjaxDataRequestOrder]
  
  var search: AjaxDataRequestSearch
  
  var start: Double
}
object AjaxDataRequest {
  
  inline def apply(
    columns: js.Array[AjaxDataRequestColumn],
    data: js.Any,
    draw: Double,
    length: Double,
    order: js.Array[AjaxDataRequestOrder],
    search: AjaxDataRequestSearch,
    start: Double
  ): AjaxDataRequest = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequest]
  }
  
  extension [Self <: AjaxDataRequest](x: Self) {
    
    inline def setColumns(value: js.Array[AjaxDataRequestColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: AjaxDataRequestColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: Double): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: js.Array[AjaxDataRequestOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderVarargs(value: AjaxDataRequestOrder*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    inline def setSearch(value: AjaxDataRequestSearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
