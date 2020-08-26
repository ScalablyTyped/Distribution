package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemLustreResponse extends js.Object {
  /**
    * The ID of the final backup for this file system.
    */
  var FinalBackupId: js.UndefOr[BackupId] = js.native
  /**
    * The set of tags applied to the final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.native
}

object DeleteFileSystemLustreResponse {
  @scala.inline
  def apply(): DeleteFileSystemLustreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemLustreResponse]
  }
  @scala.inline
  implicit class DeleteFileSystemLustreResponseOps[Self <: DeleteFileSystemLustreResponse] (val x: Self) extends AnyVal {
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
    def setFinalBackupId(value: BackupId): Self = this.set("FinalBackupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalBackupId: Self = this.set("FinalBackupId", js.undefined)
    @scala.inline
    def setFinalBackupTagsVarargs(value: Tag*): Self = this.set("FinalBackupTags", js.Array(value :_*))
    @scala.inline
    def setFinalBackupTags(value: Tags): Self = this.set("FinalBackupTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalBackupTags: Self = this.set("FinalBackupTags", js.undefined)
  }
  
}

