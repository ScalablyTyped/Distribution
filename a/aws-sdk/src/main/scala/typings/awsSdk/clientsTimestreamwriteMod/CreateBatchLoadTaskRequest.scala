package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchLoadTaskRequest extends StObject {
  
  /**
    * 
    */
  var ClientToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  var DataModelConfiguration: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.DataModelConfiguration] = js.undefined
  
  /**
    * Defines configuration details about the data source for a batch load task.
    */
  var DataSourceConfiguration: typings.awsSdk.clientsTimestreamwriteMod.DataSourceConfiguration
  
  /**
    * 
    */
  var RecordVersion: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.RecordVersion] = js.undefined
  
  var ReportConfiguration: typings.awsSdk.clientsTimestreamwriteMod.ReportConfiguration
  
  /**
    * Target Timestream database for a batch load task.
    */
  var TargetDatabaseName: ResourceCreateAPIName
  
  /**
    * Target Timestream table for a batch load task.
    */
  var TargetTableName: ResourceCreateAPIName
}
object CreateBatchLoadTaskRequest {
  
  inline def apply(
    DataSourceConfiguration: DataSourceConfiguration,
    ReportConfiguration: ReportConfiguration,
    TargetDatabaseName: ResourceCreateAPIName,
    TargetTableName: ResourceCreateAPIName
  ): CreateBatchLoadTaskRequest = {
    val __obj = js.Dynamic.literal(DataSourceConfiguration = DataSourceConfiguration.asInstanceOf[js.Any], ReportConfiguration = ReportConfiguration.asInstanceOf[js.Any], TargetDatabaseName = TargetDatabaseName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchLoadTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBatchLoadTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientRequestToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDataModelConfiguration(value: DataModelConfiguration): Self = StObject.set(x, "DataModelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataModelConfigurationUndefined: Self = StObject.set(x, "DataModelConfiguration", js.undefined)
    
    inline def setDataSourceConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "DataSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRecordVersion(value: RecordVersion): Self = StObject.set(x, "RecordVersion", value.asInstanceOf[js.Any])
    
    inline def setRecordVersionUndefined: Self = StObject.set(x, "RecordVersion", js.undefined)
    
    inline def setReportConfiguration(value: ReportConfiguration): Self = StObject.set(x, "ReportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseName(value: ResourceCreateAPIName): Self = StObject.set(x, "TargetDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTargetTableName(value: ResourceCreateAPIName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
  }
}
