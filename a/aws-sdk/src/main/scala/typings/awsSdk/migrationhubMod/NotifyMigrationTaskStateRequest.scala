package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyMigrationTaskStateRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.migrationhubMod.MigrationTaskName = js.native
  /**
    * Number of seconds after the UpdateDateTime within which the Migration Hub can expect an update. If Migration Hub does not receive an update within the specified interval, then the migration task will be considered stale.
    */
  var NextUpdateSeconds: typings.awsSdk.migrationhubMod.NextUpdateSeconds = js.native
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
  /**
    * Information about the task's progress and status.
    */
  var Task: typings.awsSdk.migrationhubMod.Task = js.native
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: typings.awsSdk.migrationhubMod.UpdateDateTime = js.native
}

object NotifyMigrationTaskStateRequest {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName,
    NextUpdateSeconds: NextUpdateSeconds,
    ProgressUpdateStream: ProgressUpdateStream,
    Task: Task,
    UpdateDateTime: UpdateDateTime
  ): NotifyMigrationTaskStateRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], NextUpdateSeconds = NextUpdateSeconds.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any], UpdateDateTime = UpdateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyMigrationTaskStateRequest]
  }
  @scala.inline
  implicit class NotifyMigrationTaskStateRequestOps[Self <: NotifyMigrationTaskStateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = this.set("MigrationTaskName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextUpdateSeconds(value: NextUpdateSeconds): Self = this.set("NextUpdateSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = this.set("ProgressUpdateStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: Task): Self = this.set("Task", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateDateTime(value: UpdateDateTime): Self = this.set("UpdateDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: DryRun): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

