package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupResponse extends js.Object {
  /**
    * Information on the Backup object deleted.
    */
  var Backup: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Backup] = js.native
}

object DeleteBackupResponse {
  @scala.inline
  def apply(): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupResponse]
  }
  @scala.inline
  implicit class DeleteBackupResponseOps[Self <: DeleteBackupResponse] (val x: Self) extends AnyVal {
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
    def setBackup(value: Backup): Self = this.set("Backup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackup: Self = this.set("Backup", js.undefined)
  }
  
}

