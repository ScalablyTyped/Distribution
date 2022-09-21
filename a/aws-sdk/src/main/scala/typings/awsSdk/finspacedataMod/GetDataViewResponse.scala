package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataViewResponse extends StObject {
  
  /**
    * Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var asOfTimestamp: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Flag to indicate Dataview should be updated automatically.
    */
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var createTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * The ARN identifier of the Dataview.
    */
  var dataViewArn: js.UndefOr[DataViewArn] = js.undefined
  
  /**
    * The unique identifier for the Dataview.
    */
  var dataViewId: js.UndefOr[DataViewId] = js.undefined
  
  /**
    * The unique identifier for the Dataset used in the Dataview.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
  
  /**
    * Options that define the destination type for the Dataview.
    */
  var destinationTypeParams: js.UndefOr[DataViewDestinationTypeParams] = js.undefined
  
  /**
    * Information about an error that occurred for the Dataview.
    */
  var errorInfo: js.UndefOr[DataViewErrorInfo] = js.undefined
  
  /**
    * The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Ordered set of column names used to partition data.
    */
  var partitionColumns: js.UndefOr[PartitionColumnList] = js.undefined
  
  /**
    * Columns to be used for sorting the data.
    */
  var sortColumns: js.UndefOr[SortColumnList] = js.undefined
  
  /**
    * The status of a Dataview creation.    RUNNING – Dataview creation is running.    STARTING – Dataview creation is starting.    FAILED – Dataview creation has failed.    CANCELLED – Dataview creation has been cancelled.    TIMEOUT – Dataview creation has timed out.    SUCCESS – Dataview creation has succeeded.    PENDING – Dataview creation is pending.    FAILED_CLEANUP_FAILED – Dataview creation failed and resource cleanup failed.  
    */
  var status: js.UndefOr[DataViewStatus] = js.undefined
}
object GetDataViewResponse {
  
  inline def apply(): GetDataViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataViewResponse]
  }
  
  extension [Self <: GetDataViewResponse](x: Self) {
    
    inline def setAsOfTimestamp(value: TimestampEpoch): Self = StObject.set(x, "asOfTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAsOfTimestampUndefined: Self = StObject.set(x, "asOfTimestamp", js.undefined)
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    inline def setCreateTime(value: TimestampEpoch): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataViewArn(value: DataViewArn): Self = StObject.set(x, "dataViewArn", value.asInstanceOf[js.Any])
    
    inline def setDataViewArnUndefined: Self = StObject.set(x, "dataViewArn", js.undefined)
    
    inline def setDataViewId(value: DataViewId): Self = StObject.set(x, "dataViewId", value.asInstanceOf[js.Any])
    
    inline def setDataViewIdUndefined: Self = StObject.set(x, "dataViewId", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setDestinationTypeParams(value: DataViewDestinationTypeParams): Self = StObject.set(x, "destinationTypeParams", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeParamsUndefined: Self = StObject.set(x, "destinationTypeParams", js.undefined)
    
    inline def setErrorInfo(value: DataViewErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setLastModifiedTime(value: TimestampEpoch): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setPartitionColumns(value: PartitionColumnList): Self = StObject.set(x, "partitionColumns", value.asInstanceOf[js.Any])
    
    inline def setPartitionColumnsUndefined: Self = StObject.set(x, "partitionColumns", js.undefined)
    
    inline def setPartitionColumnsVarargs(value: StringValueLength1to255_ *): Self = StObject.set(x, "partitionColumns", js.Array(value*))
    
    inline def setSortColumns(value: SortColumnList): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
    
    inline def setSortColumnsUndefined: Self = StObject.set(x, "sortColumns", js.undefined)
    
    inline def setSortColumnsVarargs(value: StringValueLength1to255_ *): Self = StObject.set(x, "sortColumns", js.Array(value*))
    
    inline def setStatus(value: DataViewStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
