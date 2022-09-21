package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxData extends StObject {
  
  var data: Any
  
  var draw: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var recordsFiltered: js.UndefOr[Double] = js.undefined
  
  var recordsTotal: js.UndefOr[Double] = js.undefined
}
object AjaxData {
  
  inline def apply(data: Any): AjaxData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxData]
  }
  
  extension [Self <: AjaxData](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: Double): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
    
    inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRecordsFiltered(value: Double): Self = StObject.set(x, "recordsFiltered", value.asInstanceOf[js.Any])
    
    inline def setRecordsFilteredUndefined: Self = StObject.set(x, "recordsFiltered", js.undefined)
    
    inline def setRecordsTotal(value: Double): Self = StObject.set(x, "recordsTotal", value.asInstanceOf[js.Any])
    
    inline def setRecordsTotalUndefined: Self = StObject.set(x, "recordsTotal", js.undefined)
  }
}
