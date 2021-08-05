package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportInfo extends StObject {
  
  /**
    * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export succeeded.
    */
  var configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl] = js.undefined
  
  /**
    * A unique identifier used to query an export.
    */
  var exportId: ConfigurationsExportId
  
  /**
    * The time that the data export was initiated.
    */
  var exportRequestTime: ExportRequestTime
  
  /**
    * The status of the data export job.
    */
  var exportStatus: ExportStatus
  
  /**
    * If true, the export of agent information exceeded the size limit for a single export and the exported data is incomplete for the requested time range. To address this, select a smaller time range for the export by using startDate and endDate.
    */
  var isTruncated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The endTime used in the StartExportTask request. If no endTime was requested, this result does not appear in ExportInfo.
    */
  var requestedEndTime: js.UndefOr[TimeStamp] = js.undefined
  
  /**
    * The value of startTime parameter in the StartExportTask request. If no startTime was requested, this result does not appear in ExportInfo.
    */
  var requestedStartTime: js.UndefOr[TimeStamp] = js.undefined
  
  /**
    * A status message provided for API callers.
    */
  var statusMessage: ExportStatusMessage
}
object ExportInfo {
  
  inline def apply(
    exportId: ConfigurationsExportId,
    exportRequestTime: ExportRequestTime,
    exportStatus: ExportStatus,
    statusMessage: ExportStatusMessage
  ): ExportInfo = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any], exportRequestTime = exportRequestTime.asInstanceOf[js.Any], exportStatus = exportStatus.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportInfo]
  }
  
  extension [Self <: ExportInfo](x: Self) {
    
    inline def setConfigurationsDownloadUrl(value: ConfigurationsDownloadUrl): Self = StObject.set(x, "configurationsDownloadUrl", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsDownloadUrlUndefined: Self = StObject.set(x, "configurationsDownloadUrl", js.undefined)
    
    inline def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportRequestTime(value: ExportRequestTime): Self = StObject.set(x, "exportRequestTime", value.asInstanceOf[js.Any])
    
    inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "exportStatus", value.asInstanceOf[js.Any])
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "isTruncated", js.undefined)
    
    inline def setRequestedEndTime(value: TimeStamp): Self = StObject.set(x, "requestedEndTime", value.asInstanceOf[js.Any])
    
    inline def setRequestedEndTimeUndefined: Self = StObject.set(x, "requestedEndTime", js.undefined)
    
    inline def setRequestedStartTime(value: TimeStamp): Self = StObject.set(x, "requestedStartTime", value.asInstanceOf[js.Any])
    
    inline def setRequestedStartTimeUndefined: Self = StObject.set(x, "requestedStartTime", js.undefined)
    
    inline def setStatusMessage(value: ExportStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
