package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportInfo extends js.Object {
  /**
    * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export succeeded.
    */
  var configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl] = js.native
  /**
    * A unique identifier used to query an export.
    */
  var exportId: ConfigurationsExportId = js.native
  /**
    * The time that the data export was initiated.
    */
  var exportRequestTime: ExportRequestTime = js.native
  /**
    * The status of the data export job.
    */
  var exportStatus: ExportStatus = js.native
  /**
    * If true, the export of agent information exceeded the size limit for a single export and the exported data is incomplete for the requested time range. To address this, select a smaller time range for the export by using startDate and endDate.
    */
  var isTruncated: js.UndefOr[Boolean] = js.native
  /**
    * The endTime used in the StartExportTask request. If no endTime was requested, this result does not appear in ExportInfo.
    */
  var requestedEndTime: js.UndefOr[TimeStamp] = js.native
  /**
    * The value of startTime parameter in the StartExportTask request. If no startTime was requested, this result does not appear in ExportInfo.
    */
  var requestedStartTime: js.UndefOr[TimeStamp] = js.native
  /**
    * A status message provided for API callers.
    */
  var statusMessage: ExportStatusMessage = js.native
}

object ExportInfo {
  @scala.inline
  def apply(
    exportId: ConfigurationsExportId,
    exportRequestTime: ExportRequestTime,
    exportStatus: ExportStatus,
    statusMessage: ExportStatusMessage
  ): ExportInfo = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any], exportRequestTime = exportRequestTime.asInstanceOf[js.Any], exportStatus = exportStatus.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportInfo]
  }
  @scala.inline
  implicit class ExportInfoOps[Self <: ExportInfo] (val x: Self) extends AnyVal {
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
    def setExportId(value: ConfigurationsExportId): Self = this.set("exportId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportRequestTime(value: ExportRequestTime): Self = this.set("exportRequestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportStatus(value: ExportStatus): Self = this.set("exportStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMessage(value: ExportStatusMessage): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationsDownloadUrl(value: ConfigurationsDownloadUrl): Self = this.set("configurationsDownloadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationsDownloadUrl: Self = this.set("configurationsDownloadUrl", js.undefined)
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("isTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("isTruncated", js.undefined)
    @scala.inline
    def setRequestedEndTime(value: TimeStamp): Self = this.set("requestedEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedEndTime: Self = this.set("requestedEndTime", js.undefined)
    @scala.inline
    def setRequestedStartTime(value: TimeStamp): Self = this.set("requestedStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedStartTime: Self = this.set("requestedStartTime", js.undefined)
  }
  
}

