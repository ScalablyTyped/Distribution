package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxData extends StObject {
  
  var data: js.Any
  
  var draw: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var recordsFiltered: js.UndefOr[Double] = js.undefined
  
  var recordsTotal: js.UndefOr[Double] = js.undefined
}
object AjaxData {
  
  @scala.inline
  def apply(data: js.Any): AjaxData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxData]
  }
  
  @scala.inline
  implicit class AjaxDataMutableBuilder[Self <: AjaxData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraw(value: Double): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setRecordsFiltered(value: Double): Self = StObject.set(x, "recordsFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsFilteredUndefined: Self = StObject.set(x, "recordsFiltered", js.undefined)
    
    @scala.inline
    def setRecordsTotal(value: Double): Self = StObject.set(x, "recordsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsTotalUndefined: Self = StObject.set(x, "recordsTotal", js.undefined)
  }
}
