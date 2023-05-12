package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchLoadTask extends StObject {
  
  /**
    * The time when the Timestream batch load task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Database name for the database into which a batch load task loads data.
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The time when the Timestream batch load task was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  
    */
  var ResumableUntil: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Table name for the table into which a batch load task loads data.
    */
  var TableName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The ID of the batch load task.
    */
  var TaskId: js.UndefOr[BatchLoadTaskId] = js.undefined
  
  /**
    * Status of the batch load task.
    */
  var TaskStatus: js.UndefOr[BatchLoadStatus] = js.undefined
}
object BatchLoadTask {
  
  inline def apply(): BatchLoadTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchLoadTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchLoadTask] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setResumableUntil(value: js.Date): Self = StObject.set(x, "ResumableUntil", value.asInstanceOf[js.Any])
    
    inline def setResumableUntilUndefined: Self = StObject.set(x, "ResumableUntil", js.undefined)
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTaskId(value: BatchLoadTaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "TaskId", js.undefined)
    
    inline def setTaskStatus(value: BatchLoadStatus): Self = StObject.set(x, "TaskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "TaskStatus", js.undefined)
  }
}
