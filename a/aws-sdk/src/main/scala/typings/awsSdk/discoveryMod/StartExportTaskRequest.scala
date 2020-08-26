package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExportTaskRequest extends js.Object {
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
  implicit class StartExportTaskRequestOps[Self <: StartExportTaskRequest] (val x: Self) extends AnyVal {
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
    def setEndTime(value: TimeStamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setExportDataFormatVarargs(value: ExportDataFormat*): Self = this.set("exportDataFormat", js.Array(value :_*))
    @scala.inline
    def setExportDataFormat(value: ExportDataFormats): Self = this.set("exportDataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportDataFormat: Self = this.set("exportDataFormat", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: ExportFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: ExportFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setStartTime(value: TimeStamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

