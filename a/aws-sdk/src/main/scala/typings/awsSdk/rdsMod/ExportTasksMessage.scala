package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTasksMessage extends StObject {
  
  /**
    * Information about an export of a snapshot to Amazon S3.
    */
  var ExportTasks: js.UndefOr[ExportTasksList] = js.undefined
  
  /**
    * A pagination token that can be used in a later DescribeExportTasks request. A marker is used for pagination to identify the location to begin output for the next response of DescribeExportTasks.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ExportTasksMessage {
  
  @scala.inline
  def apply(): ExportTasksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTasksMessage]
  }
  
  @scala.inline
  implicit class ExportTasksMessageMutableBuilder[Self <: ExportTasksMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTasks(value: ExportTasksList): Self = StObject.set(x, "ExportTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTasksUndefined: Self = StObject.set(x, "ExportTasks", js.undefined)
    
    @scala.inline
    def setExportTasksVarargs(value: ExportTask*): Self = StObject.set(x, "ExportTasks", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
