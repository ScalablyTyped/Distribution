package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportFileTaskInformation extends StObject {
  
  /**
    *  The time that the import task completes. 
    */
  var completionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ID of the import file task. 
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the import task given in StartImportFileTask. 
    */
  var importName: js.UndefOr[String] = js.undefined
  
  /**
    *  The S3 bucket where the import file is located. 
    */
  var inputS3Bucket: js.UndefOr[importS3Bucket] = js.undefined
  
  /**
    *  The Amazon S3 key name of the import file. 
    */
  var inputS3Key: js.UndefOr[importS3Key] = js.undefined
  
  /**
    *  The number of records that failed to be imported. 
    */
  var numberOfRecordsFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of records successfully imported. 
    */
  var numberOfRecordsSuccess: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Start time of the import task. 
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Status of import file task. 
    */
  var status: js.UndefOr[ImportFileTaskStatus] = js.undefined
  
  /**
    *  The S3 bucket name for status report of import task. 
    */
  var statusReportS3Bucket: js.UndefOr[importS3Bucket] = js.undefined
  
  /**
    *  The Amazon S3 key name for status report of import task. The report contains details about whether each record imported successfully or why it did not. 
    */
  var statusReportS3Key: js.UndefOr[importS3Key] = js.undefined
}
object ImportFileTaskInformation {
  
  inline def apply(): ImportFileTaskInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportFileTaskInformation]
  }
  
  extension [Self <: ImportFileTaskInformation](x: Self) {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImportName(value: String): Self = StObject.set(x, "importName", value.asInstanceOf[js.Any])
    
    inline def setImportNameUndefined: Self = StObject.set(x, "importName", js.undefined)
    
    inline def setInputS3Bucket(value: importS3Bucket): Self = StObject.set(x, "inputS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setInputS3BucketUndefined: Self = StObject.set(x, "inputS3Bucket", js.undefined)
    
    inline def setInputS3Key(value: importS3Key): Self = StObject.set(x, "inputS3Key", value.asInstanceOf[js.Any])
    
    inline def setInputS3KeyUndefined: Self = StObject.set(x, "inputS3Key", js.undefined)
    
    inline def setNumberOfRecordsFailed(value: Integer): Self = StObject.set(x, "numberOfRecordsFailed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecordsFailedUndefined: Self = StObject.set(x, "numberOfRecordsFailed", js.undefined)
    
    inline def setNumberOfRecordsSuccess(value: Integer): Self = StObject.set(x, "numberOfRecordsSuccess", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecordsSuccessUndefined: Self = StObject.set(x, "numberOfRecordsSuccess", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: ImportFileTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReportS3Bucket(value: importS3Bucket): Self = StObject.set(x, "statusReportS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setStatusReportS3BucketUndefined: Self = StObject.set(x, "statusReportS3Bucket", js.undefined)
    
    inline def setStatusReportS3Key(value: importS3Key): Self = StObject.set(x, "statusReportS3Key", value.asInstanceOf[js.Any])
    
    inline def setStatusReportS3KeyUndefined: Self = StObject.set(x, "statusReportS3Key", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
