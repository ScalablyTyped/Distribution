package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTasksMessage extends js.Object {
  
  /**
    * Information about an export of a snapshot to Amazon S3.
    */
  var ExportTasks: js.UndefOr[ExportTasksList] = js.native
  
  /**
    * A pagination token that can be used in a later DescribeExportTasks request. A marker is used for pagination to identify the location to begin output for the next response of DescribeExportTasks.
    */
  var Marker: js.UndefOr[String] = js.native
}
object ExportTasksMessage {
  
  @scala.inline
  def apply(): ExportTasksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTasksMessage]
  }
  
  @scala.inline
  implicit class ExportTasksMessageOps[Self <: ExportTasksMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportTasksVarargs(value: ExportTask*): Self = this.set("ExportTasks", js.Array(value :_*))
    
    @scala.inline
    def setExportTasks(value: ExportTasksList): Self = this.set("ExportTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportTasks: Self = this.set("ExportTasks", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
