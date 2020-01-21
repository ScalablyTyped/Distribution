package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationTask extends js.Object {
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typings.awsSdk.migrationhubMod.MigrationTaskName] = js.native
  /**
    * A name that identifies the vendor of the migration tool being used.
    */
  var ProgressUpdateStream: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressUpdateStream] = js.native
  /**
    * Information about the resource that is being migrated. This data will be used to map the task to a resource in the Application Discovery Service repository.
    */
  var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList] = js.native
  /**
    * Task object encapsulating task information.
    */
  var Task: js.UndefOr[typings.awsSdk.migrationhubMod.Task] = js.native
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[typings.awsSdk.migrationhubMod.UpdateDateTime] = js.native
}

object MigrationTask {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName = null,
    ProgressUpdateStream: ProgressUpdateStream = null,
    ResourceAttributeList: LatestResourceAttributeList = null,
    Task: Task = null,
    UpdateDateTime: UpdateDateTime = null
  ): MigrationTask = {
    val __obj = js.Dynamic.literal()
    if (MigrationTaskName != null) __obj.updateDynamic("MigrationTaskName")(MigrationTaskName.asInstanceOf[js.Any])
    if (ProgressUpdateStream != null) __obj.updateDynamic("ProgressUpdateStream")(ProgressUpdateStream.asInstanceOf[js.Any])
    if (ResourceAttributeList != null) __obj.updateDynamic("ResourceAttributeList")(ResourceAttributeList.asInstanceOf[js.Any])
    if (Task != null) __obj.updateDynamic("Task")(Task.asInstanceOf[js.Any])
    if (UpdateDateTime != null) __obj.updateDynamic("UpdateDateTime")(UpdateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationTask]
  }
}

