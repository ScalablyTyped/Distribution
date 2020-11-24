package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxData extends js.Object {
  
  var data: js.Any = js.native
  
  var draw: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var recordsFiltered: js.UndefOr[Double] = js.native
  
  var recordsTotal: js.UndefOr[Double] = js.native
}
object AjaxData {
  
  @scala.inline
  def apply(data: js.Any): AjaxData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxData]
  }
  
  @scala.inline
  implicit class AjaxDataOps[Self <: AjaxData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraw(value: Double): Self = this.set("draw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraw: Self = this.set("draw", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setRecordsFiltered(value: Double): Self = this.set("recordsFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsFiltered: Self = this.set("recordsFiltered", js.undefined)
    
    @scala.inline
    def setRecordsTotal(value: Double): Self = this.set("recordsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsTotal: Self = this.set("recordsTotal", js.undefined)
  }
}
