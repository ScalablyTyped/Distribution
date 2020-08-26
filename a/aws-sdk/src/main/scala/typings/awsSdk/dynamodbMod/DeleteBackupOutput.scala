package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typings.awsSdk.dynamodbMod.BackupDescription] = js.native
}

object DeleteBackupOutput {
  @scala.inline
  def apply(): DeleteBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupOutput]
  }
  @scala.inline
  implicit class DeleteBackupOutputOps[Self <: DeleteBackupOutput] (val x: Self) extends AnyVal {
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
    def setBackupDescription(value: BackupDescription): Self = this.set("BackupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupDescription: Self = this.set("BackupDescription", js.undefined)
  }
  
}

