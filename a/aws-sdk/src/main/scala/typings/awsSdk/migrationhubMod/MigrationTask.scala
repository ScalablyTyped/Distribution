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
  def apply(): MigrationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationTask]
  }
  @scala.inline
  implicit class MigrationTaskOps[Self <: MigrationTask] (val x: Self) extends AnyVal {
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
    def deleteMigrationTaskName: Self = this.set("MigrationTaskName", js.undefined)
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = this.set("ProgressUpdateStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressUpdateStream: Self = this.set("ProgressUpdateStream", js.undefined)
    @scala.inline
    def setResourceAttributeListVarargs(value: ResourceAttribute*): Self = this.set("ResourceAttributeList", js.Array(value :_*))
    @scala.inline
    def setResourceAttributeList(value: LatestResourceAttributeList): Self = this.set("ResourceAttributeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAttributeList: Self = this.set("ResourceAttributeList", js.undefined)
    @scala.inline
    def setTask(value: Task): Self = this.set("Task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTask: Self = this.set("Task", js.undefined)
    @scala.inline
    def setUpdateDateTime(value: UpdateDateTime): Self = this.set("UpdateDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDateTime: Self = this.set("UpdateDateTime", js.undefined)
  }
  
}

