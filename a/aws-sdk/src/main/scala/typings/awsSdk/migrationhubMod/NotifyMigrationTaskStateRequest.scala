package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyMigrationTaskStateRequest extends StObject {
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.undefined
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.migrationhubMod.MigrationTaskName
  
  /**
    * Number of seconds after the UpdateDateTime within which the Migration Hub can expect an update. If Migration Hub does not receive an update within the specified interval, then the migration task will be considered stale.
    */
  var NextUpdateSeconds: typings.awsSdk.migrationhubMod.NextUpdateSeconds
  
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsSdk.migrationhubMod.ProgressUpdateStream
  
  /**
    * Information about the task's progress and status.
    */
  var Task: typings.awsSdk.migrationhubMod.Task
  
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: typings.awsSdk.migrationhubMod.UpdateDateTime
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
  implicit class NotifyMigrationTaskStateRequestMutableBuilder[Self <: NotifyMigrationTaskStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUpdateSeconds(value: NextUpdateSeconds): Self = StObject.set(x, "NextUpdateSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: Task): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateTime(value: UpdateDateTime): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
  }
}
