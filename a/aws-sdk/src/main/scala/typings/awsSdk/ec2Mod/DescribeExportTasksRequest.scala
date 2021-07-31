package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportTasksRequest extends StObject {
  
  /**
    * The export task IDs.
    */
  var ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.undefined
  
  /**
    * the filters for the export tasks.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
}
object DescribeExportTasksRequest {
  
  @scala.inline
  def apply(): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
  
  @scala.inline
  implicit class DescribeExportTasksRequestMutableBuilder[Self <: DescribeExportTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTaskIds(value: ExportTaskIdStringList): Self = StObject.set(x, "ExportTaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTaskIdsUndefined: Self = StObject.set(x, "ExportTaskIds", js.undefined)
    
    @scala.inline
    def setExportTaskIdsVarargs(value: ExportTaskId*): Self = StObject.set(x, "ExportTaskIds", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
  }
}
