package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupDescription] = js.native
}

object DescribeBackupOutput {
  @scala.inline
  def apply(): DescribeBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupOutput]
  }
  @scala.inline
  implicit class DescribeBackupOutputOps[Self <: DescribeBackupOutput] (val x: Self) extends AnyVal {
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

