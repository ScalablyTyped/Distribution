package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ElapsedTimeMillis: js.UndefOr[Long] = js.undefined,
    FreshStartDate: TStamp = null,
    FullLoadFinishDate: TStamp = null,
    FullLoadProgressPercent: js.UndefOr[Integer] = js.undefined,
    FullLoadStartDate: TStamp = null,
    StartDate: TStamp = null,
    StopDate: TStamp = null,
    TablesErrored: js.UndefOr[Integer] = js.undefined,
    TablesLoaded: js.UndefOr[Integer] = js.undefined,
    TablesLoading: js.UndefOr[Integer] = js.undefined,
    TablesQueued: js.UndefOr[Integer] = js.undefined
  ): ReplicationTaskStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ElapsedTimeMillis)) __obj.updateDynamic("ElapsedTimeMillis")(ElapsedTimeMillis.get.asInstanceOf[js.Any])
    if (FreshStartDate != null) __obj.updateDynamic("FreshStartDate")(FreshStartDate.asInstanceOf[js.Any])
    if (FullLoadFinishDate != null) __obj.updateDynamic("FullLoadFinishDate")(FullLoadFinishDate.asInstanceOf[js.Any])
    if (!js.isUndefined(FullLoadProgressPercent)) __obj.updateDynamic("FullLoadProgressPercent")(FullLoadProgressPercent.get.asInstanceOf[js.Any])
    if (FullLoadStartDate != null) __obj.updateDynamic("FullLoadStartDate")(FullLoadStartDate.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    if (StopDate != null) __obj.updateDynamic("StopDate")(StopDate.asInstanceOf[js.Any])
    if (!js.isUndefined(TablesErrored)) __obj.updateDynamic("TablesErrored")(TablesErrored.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TablesLoaded)) __obj.updateDynamic("TablesLoaded")(TablesLoaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TablesLoading)) __obj.updateDynamic("TablesLoading")(TablesLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TablesQueued)) __obj.updateDynamic("TablesQueued")(TablesQueued.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTaskStats]
  }
}

