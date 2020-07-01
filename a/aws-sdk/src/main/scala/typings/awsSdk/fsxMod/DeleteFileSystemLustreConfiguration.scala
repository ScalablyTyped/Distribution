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
  def apply(FinalBackupTags: Tags = null, SkipFinalBackup: js.UndefOr[Flag] = js.undefined): DeleteFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    if (FinalBackupTags != null) __obj.updateDynamic("FinalBackupTags")(FinalBackupTags.asInstanceOf[js.Any])
    if (!js.isUndefined(SkipFinalBackup)) __obj.updateDynamic("SkipFinalBackup")(SkipFinalBackup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemLustreConfiguration]
  }
}

