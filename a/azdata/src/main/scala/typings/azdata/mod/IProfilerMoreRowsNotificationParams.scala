package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProfilerMoreRowsNotificationParams extends js.Object {
  
  var data: IProfilerTableRow = js.native
  
  var rowCount: Double = js.native
  
  var uri: String = js.native
}
object IProfilerMoreRowsNotificationParams {
  
  @scala.inline
  def apply(data: IProfilerTableRow, rowCount: Double, uri: String): IProfilerMoreRowsNotificationParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerMoreRowsNotificationParams]
  }
  
  @scala.inline
  implicit class IProfilerMoreRowsNotificationParamsOps[Self <: IProfilerMoreRowsNotificationParams] (val x: Self) extends AnyVal {
    
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
    def setData(value: IProfilerTableRow): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
