package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTaskStats extends js.Object {
  
  /**
    * The elapsed time of the task, in milliseconds.
    */
  var ElapsedTimeMillis: js.UndefOr[Long] = js.native
  
  /**
    * The date the replication task was started either with a fresh start or a target reload.
    */
  var FreshStartDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The date the replication task full load was completed.
    */
  var FullLoadFinishDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The percent complete for the full load migration task.
    */
  var FullLoadProgressPercent: js.UndefOr[Integer] = js.native
  
  /**
    * The date the replication task full load was started.
    */
  var FullLoadStartDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The date the replication task was started either with a fresh start or a resume. For more information, see StartReplicationTaskType.
    */
  var StartDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The date the replication task was stopped.
    */
  var StopDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The number of errors that have occurred during this task.
    */
  var TablesErrored: js.UndefOr[Integer] = js.native
  
  /**
    * The number of tables loaded for this task.
    */
  var TablesLoaded: js.UndefOr[Integer] = js.native
  
  /**
    * The number of tables currently loading for this task.
    */
  var TablesLoading: js.UndefOr[Integer] = js.native
  
  /**
    * The number of tables queued for this task.
    */
  var TablesQueued: js.UndefOr[Integer] = js.native
}
object ReplicationTaskStats {
  
  @scala.inline
  def apply(): ReplicationTaskStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskStats]
  }
  
  @scala.inline
  implicit class ReplicationTaskStatsOps[Self <: ReplicationTaskStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElapsedTimeMillis(value: Long): Self = this.set("ElapsedTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTimeMillis: Self = this.set("ElapsedTimeMillis", js.undefined)
    
    @scala.inline
    def setFreshStartDate(value: TStamp): Self = this.set("FreshStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreshStartDate: Self = this.set("FreshStartDate", js.undefined)
    
    @scala.inline
    def setFullLoadFinishDate(value: TStamp): Self = this.set("FullLoadFinishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadFinishDate: Self = this.set("FullLoadFinishDate", js.undefined)
    
    @scala.inline
    def setFullLoadProgressPercent(value: Integer): Self = this.set("FullLoadProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadProgressPercent: Self = this.set("FullLoadProgressPercent", js.undefined)
    
    @scala.inline
    def setFullLoadStartDate(value: TStamp): Self = this.set("FullLoadStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadStartDate: Self = this.set("FullLoadStartDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: TStamp): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
    
    @scala.inline
    def setStopDate(value: TStamp): Self = this.set("StopDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopDate: Self = this.set("StopDate", js.undefined)
    
    @scala.inline
    def setTablesErrored(value: Integer): Self = this.set("TablesErrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablesErrored: Self = this.set("TablesErrored", js.undefined)
    
    @scala.inline
    def setTablesLoaded(value: Integer): Self = this.set("TablesLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablesLoaded: Self = this.set("TablesLoaded", js.undefined)
    
    @scala.inline
    def setTablesLoading(value: Integer): Self = this.set("TablesLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablesLoading: Self = this.set("TablesLoading", js.undefined)
    
    @scala.inline
    def setTablesQueued(value: Integer): Self = this.set("TablesQueued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablesQueued: Self = this.set("TablesQueued", js.undefined)
  }
}
