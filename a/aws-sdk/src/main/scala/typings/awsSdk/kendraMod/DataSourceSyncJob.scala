package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSyncJob extends StObject {
  
  /**
    * If the reason that the synchronization failed is due to an error with the underlying data source, this field contains a code that identifies the error.
    */
  var DataSourceErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The UNIX datetime that the synchronization job was completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * If the Status field is set to FAILED, the ErrorCode field contains a the reason that the synchronization failed.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.kendraMod.ErrorCode] = js.native
  
  /**
    * If the Status field is set to ERROR, the ErrorMessage field contains a description of the error that caused the synchronization to fail.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  
  /**
    * A unique identifier for the synchronization job.
    */
  var ExecutionId: js.UndefOr[String] = js.native
  
  /**
    * Maps a batch delete document request to a specific data source sync job. This is optional and should only be supplied when documents are deleted by a data source connector.
    */
  var Metrics: js.UndefOr[DataSourceSyncJobMetrics] = js.native
  
  /**
    * The UNIX datetime that the synchronization job was started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The execution status of the synchronization job. When the Status field is set to SUCCEEDED, the synchronization job is done. If the status code is set to FAILED, the ErrorCode and ErrorMessage fields give you the reason for the failure.
    */
  var Status: js.UndefOr[DataSourceSyncJobStatus] = js.native
}
object DataSourceSyncJob {
  
  @scala.inline
  def apply(): DataSourceSyncJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSyncJob]
  }
  
  @scala.inline
  implicit class DataSourceSyncJobMutableBuilder[Self <: DataSourceSyncJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceErrorCode(value: String): Self = StObject.set(x, "DataSourceErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceErrorCodeUndefined: Self = StObject.set(x, "DataSourceErrorCode", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    @scala.inline
    def setMetrics(value: DataSourceSyncJobMetrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: DataSourceSyncJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
