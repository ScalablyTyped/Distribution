package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTaskStats extends StObject {
  
  /**
    * The elapsed time of the task, in milliseconds.
    */
  var ElapsedTimeMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The date the replication task was started either with a fresh start or a target reload.
    */
  var FreshStartDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The date the replication task full load was completed.
    */
  var FullLoadFinishDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The percent complete for the full load migration task.
    */
  var FullLoadProgressPercent: js.UndefOr[Integer] = js.undefined
  
  /**
    * The date the replication task full load was started.
    */
  var FullLoadStartDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The date the replication task was started either with a fresh start or a resume. For more information, see StartReplicationTaskType.
    */
  var StartDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The date the replication task was stopped.
    */
  var StopDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The number of errors that have occurred during this task.
    */
  var TablesErrored: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of tables loaded for this task.
    */
  var TablesLoaded: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of tables currently loading for this task.
    */
  var TablesLoading: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of tables queued for this task.
    */
  var TablesQueued: js.UndefOr[Integer] = js.undefined
}
object ReplicationTaskStats {
  
  inline def apply(): ReplicationTaskStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskStats]
  }
  
  extension [Self <: ReplicationTaskStats](x: Self) {
    
    inline def setElapsedTimeMillis(value: Long): Self = StObject.set(x, "ElapsedTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeMillisUndefined: Self = StObject.set(x, "ElapsedTimeMillis", js.undefined)
    
    inline def setFreshStartDate(value: TStamp): Self = StObject.set(x, "FreshStartDate", value.asInstanceOf[js.Any])
    
    inline def setFreshStartDateUndefined: Self = StObject.set(x, "FreshStartDate", js.undefined)
    
    inline def setFullLoadFinishDate(value: TStamp): Self = StObject.set(x, "FullLoadFinishDate", value.asInstanceOf[js.Any])
    
    inline def setFullLoadFinishDateUndefined: Self = StObject.set(x, "FullLoadFinishDate", js.undefined)
    
    inline def setFullLoadProgressPercent(value: Integer): Self = StObject.set(x, "FullLoadProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setFullLoadProgressPercentUndefined: Self = StObject.set(x, "FullLoadProgressPercent", js.undefined)
    
    inline def setFullLoadStartDate(value: TStamp): Self = StObject.set(x, "FullLoadStartDate", value.asInstanceOf[js.Any])
    
    inline def setFullLoadStartDateUndefined: Self = StObject.set(x, "FullLoadStartDate", js.undefined)
    
    inline def setStartDate(value: TStamp): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setStopDate(value: TStamp): Self = StObject.set(x, "StopDate", value.asInstanceOf[js.Any])
    
    inline def setStopDateUndefined: Self = StObject.set(x, "StopDate", js.undefined)
    
    inline def setTablesErrored(value: Integer): Self = StObject.set(x, "TablesErrored", value.asInstanceOf[js.Any])
    
    inline def setTablesErroredUndefined: Self = StObject.set(x, "TablesErrored", js.undefined)
    
    inline def setTablesLoaded(value: Integer): Self = StObject.set(x, "TablesLoaded", value.asInstanceOf[js.Any])
    
    inline def setTablesLoadedUndefined: Self = StObject.set(x, "TablesLoaded", js.undefined)
    
    inline def setTablesLoading(value: Integer): Self = StObject.set(x, "TablesLoading", value.asInstanceOf[js.Any])
    
    inline def setTablesLoadingUndefined: Self = StObject.set(x, "TablesLoading", js.undefined)
    
    inline def setTablesQueued(value: Integer): Self = StObject.set(x, "TablesQueued", value.asInstanceOf[js.Any])
    
    inline def setTablesQueuedUndefined: Self = StObject.set(x, "TablesQueued", js.undefined)
  }
}
