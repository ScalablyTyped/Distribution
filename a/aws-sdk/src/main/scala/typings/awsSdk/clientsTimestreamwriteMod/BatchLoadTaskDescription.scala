package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchLoadTaskDescription extends StObject {
  
  /**
    * The time when the Timestream batch load task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Data model configuration for a batch load task. This contains details about where a data model for a batch load task is stored.
    */
  var DataModelConfiguration: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.DataModelConfiguration] = js.undefined
  
  /**
    * Configuration details about the data source for a batch load task.
    */
  var DataSourceConfiguration: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.DataSourceConfiguration] = js.undefined
  
  /**
    * 
    */
  var ErrorMessage: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    * The time when the Timestream batch load task was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    */
  var ProgressReport: js.UndefOr[BatchLoadProgressReport] = js.undefined
  
  /**
    * 
    */
  var RecordVersion: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.RecordVersion] = js.undefined
  
  /**
    * Report configuration for a batch load task. This contains details about where error reports are stored.
    */
  var ReportConfiguration: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.ReportConfiguration] = js.undefined
  
  /**
    *  
    */
  var ResumableUntil: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    */
  var TargetDatabaseName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * 
    */
  var TargetTableName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The ID of the batch load task.
    */
  var TaskId: js.UndefOr[BatchLoadTaskId] = js.undefined
  
  /**
    * Status of the batch load task.
    */
  var TaskStatus: js.UndefOr[BatchLoadStatus] = js.undefined
}
object BatchLoadTaskDescription {
  
  inline def apply(): BatchLoadTaskDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchLoadTaskDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchLoadTaskDescription] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataModelConfiguration(value: DataModelConfiguration): Self = StObject.set(x, "DataModelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataModelConfigurationUndefined: Self = StObject.set(x, "DataModelConfiguration", js.undefined)
    
    inline def setDataSourceConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "DataSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfigurationUndefined: Self = StObject.set(x, "DataSourceConfiguration", js.undefined)
    
    inline def setErrorMessage(value: StringValue2048): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setProgressReport(value: BatchLoadProgressReport): Self = StObject.set(x, "ProgressReport", value.asInstanceOf[js.Any])
    
    inline def setProgressReportUndefined: Self = StObject.set(x, "ProgressReport", js.undefined)
    
    inline def setRecordVersion(value: RecordVersion): Self = StObject.set(x, "RecordVersion", value.asInstanceOf[js.Any])
    
    inline def setRecordVersionUndefined: Self = StObject.set(x, "RecordVersion", js.undefined)
    
    inline def setReportConfiguration(value: ReportConfiguration): Self = StObject.set(x, "ReportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReportConfigurationUndefined: Self = StObject.set(x, "ReportConfiguration", js.undefined)
    
    inline def setResumableUntil(value: js.Date): Self = StObject.set(x, "ResumableUntil", value.asInstanceOf[js.Any])
    
    inline def setResumableUntilUndefined: Self = StObject.set(x, "ResumableUntil", js.undefined)
    
    inline def setTargetDatabaseName(value: ResourceName): Self = StObject.set(x, "TargetDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseNameUndefined: Self = StObject.set(x, "TargetDatabaseName", js.undefined)
    
    inline def setTargetTableName(value: ResourceName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    
    inline def setTargetTableNameUndefined: Self = StObject.set(x, "TargetTableName", js.undefined)
    
    inline def setTaskId(value: BatchLoadTaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "TaskId", js.undefined)
    
    inline def setTaskStatus(value: BatchLoadStatus): Self = StObject.set(x, "TaskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "TaskStatus", js.undefined)
  }
}
