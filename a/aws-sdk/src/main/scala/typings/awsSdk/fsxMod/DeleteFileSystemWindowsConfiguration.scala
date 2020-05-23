package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemWindowsConfiguration extends js.Object {
  /**
    * A set of tags for your final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.native
  /**
    * By default, Amazon FSx for Windows takes a final backup on your behalf when the DeleteFileSystem operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final backup. If you want to skip this backup, use this flag to do so.
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.native
}

object DeleteFileSystemWindowsConfiguration {
  @scala.inline
  def apply(FinalBackupTags: Tags = null, SkipFinalBackup: js.UndefOr[Flag] = js.undefined): DeleteFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (FinalBackupTags != null) __obj.updateDynamic("FinalBackupTags")(FinalBackupTags.asInstanceOf[js.Any])
    if (!js.isUndefined(SkipFinalBackup)) __obj.updateDynamic("SkipFinalBackup")(SkipFinalBackup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemWindowsConfiguration]
  }
}

