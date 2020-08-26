package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMigrationTaskResult extends js.Object {
  /**
    * Object encapsulating information about the migration task.
    */
  var MigrationTask: js.UndefOr[typings.awsSdk.migrationhubMod.MigrationTask] = js.native
}

object DescribeMigrationTaskResult {
  @scala.inline
  def apply(): DescribeMigrationTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMigrationTaskResult]
  }
  @scala.inline
  implicit class DescribeMigrationTaskResultOps[Self <: DescribeMigrationTaskResult] (val x: Self) extends AnyVal {
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
    def setMigrationTask(value: MigrationTask): Self = this.set("MigrationTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMigrationTask: Self = this.set("MigrationTask", js.undefined)
  }
  
}

