package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportResponse extends StObject {
  
  /**
    * The date and time that the export was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes after calling the DescribeExport operation.
    */
  var downloadUrl: js.UndefOr[PresignedS3Url] = js.undefined
  
  /**
    * The unique identifier of the described export.
    */
  var exportId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the export. When the status is Complete the export archive file is available for download.
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.undefined
  
  /**
    * If the exportStatus is failed, contains one or more reasons why the export could not be completed.
    */
  var failureReasons: js.UndefOr[FailureReasons] = js.undefined
  
  /**
    * The file format used in the files that describe the resource. 
    */
  var fileFormat: js.UndefOr[ImportExportFileFormat] = js.undefined
  
  /**
    * The last date and time that the export was updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The bot, bot ID, and optional locale ID of the exported bot or bot locale.
    */
  var resourceSpecification: js.UndefOr[ExportResourceSpecification] = js.undefined
}
object DescribeExportResponse {
  
  inline def apply(): DescribeExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportResponse]
  }
  
  extension [Self <: DescribeExportResponse](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDownloadUrl(value: PresignedS3Url): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setExportId(value: Id): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
    
    inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "exportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "exportStatus", js.undefined)
    
    inline def setFailureReasons(value: FailureReasons): Self = StObject.set(x, "failureReasons", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonsUndefined: Self = StObject.set(x, "failureReasons", js.undefined)
    
    inline def setFailureReasonsVarargs(value: FailureReason*): Self = StObject.set(x, "failureReasons", js.Array(value*))
    
    inline def setFileFormat(value: ImportExportFileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setResourceSpecification(value: ExportResourceSpecification): Self = StObject.set(x, "resourceSpecification", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecificationUndefined: Self = StObject.set(x, "resourceSpecification", js.undefined)
  }
}
