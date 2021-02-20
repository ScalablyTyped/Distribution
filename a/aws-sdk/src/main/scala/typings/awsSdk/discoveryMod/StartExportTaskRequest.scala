package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartExportTaskRequest extends StObject {
  
  /**
    * The end timestamp for exported data from the single Application Discovery Agent selected in the filters. If no value is specified, exported data includes the most recent data collected by the agent.
    */
  var endTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The file format for the returned export data. Default value is CSV. Note: The GRAPHML option has been deprecated. 
    */
  var exportDataFormat: js.UndefOr[ExportDataFormats] = js.native
  
  /**
    * If a filter is present, it selects the single agentId of the Application Discovery Agent for which data is exported. The agentId can be found in the results of the DescribeAgents API or CLI. If no filter is present, startTime and endTime are ignored and exported data includes both Agentless Discovery Connector data and summary data from Application Discovery agents. 
    */
  var filters: js.UndefOr[ExportFilters] = js.native
  
  /**
    * The start timestamp for exported data from the single Application Discovery Agent selected in the filters. If no value is specified, data is exported starting from the first data collected by the agent.
    */
  var startTime: js.UndefOr[TimeStamp] = js.native
}
object StartExportTaskRequest {
  
  @scala.inline
  def apply(): StartExportTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExportTaskRequest]
  }
  
  @scala.inline
  implicit class StartExportTaskRequestMutableBuilder[Self <: StartExportTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: TimeStamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setExportDataFormat(value: ExportDataFormats): Self = StObject.set(x, "exportDataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDataFormatUndefined: Self = StObject.set(x, "exportDataFormat", js.undefined)
    
    @scala.inline
    def setExportDataFormatVarargs(value: ExportDataFormat*): Self = StObject.set(x, "exportDataFormat", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: ExportFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ExportFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: TimeStamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
