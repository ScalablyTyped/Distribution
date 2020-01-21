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
    statusMessage: ExportStatusMessage,
    configurationsDownloadUrl: ConfigurationsDownloadUrl = null,
    isTruncated: js.UndefOr[scala.Boolean] = js.undefined,
    requestedEndTime: TimeStamp = null,
    requestedStartTime: TimeStamp = null
  ): ExportInfo = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any], exportRequestTime = exportRequestTime.asInstanceOf[js.Any], exportStatus = exportStatus.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    if (configurationsDownloadUrl != null) __obj.updateDynamic("configurationsDownloadUrl")(configurationsDownloadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isTruncated)) __obj.updateDynamic("isTruncated")(isTruncated.asInstanceOf[js.Any])
    if (requestedEndTime != null) __obj.updateDynamic("requestedEndTime")(requestedEndTime.asInstanceOf[js.Any])
    if (requestedStartTime != null) __obj.updateDynamic("requestedStartTime")(requestedStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportInfo]
  }
}

