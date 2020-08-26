package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemLustreConfiguration extends js.Object {
  /**
    * Use if SkipFinalBackup is set to false, and you want to apply an array of tags to the final backup. If you have set the file system property CopyTagsToBackups to true, and you specify one or more FinalBackupTags when deleting a file system, Amazon FSx will not copy any existing file system tags to the backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.native
  /**
    * Set SkipFinalBackup to false if you want to take a final backup of the file system you are deleting. By default, Amazon FSx will not take a final backup on your behalf when the DeleteFileSystem operation is invoked. (Default = true)
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.native
}

object DeleteFileSystemLustreConfiguration {
  @scala.inline
  def apply(): DeleteFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemLustreConfiguration]
  }
  @scala.inline
  implicit class DeleteFileSystemLustreConfigurationOps[Self <: DeleteFileSystemLustreConfiguration] (val x: Self) extends AnyVal {
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
    def setFinalBackupTagsVarargs(value: Tag*): Self = this.set("FinalBackupTags", js.Array(value :_*))
    @scala.inline
    def setFinalBackupTags(value: Tags): Self = this.set("FinalBackupTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalBackupTags: Self = this.set("FinalBackupTags", js.undefined)
    @scala.inline
    def setSkipFinalBackup(value: Flag): Self = this.set("SkipFinalBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipFinalBackup: Self = this.set("SkipFinalBackup", js.undefined)
  }
  
}

