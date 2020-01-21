package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemWindowsResponse extends js.Object {
  /**
    * The ID of the final backup for this file system.
    */
  var FinalBackupId: js.UndefOr[BackupId] = js.native
  /**
    * The set of tags applied to the final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.native
}

object DeleteFileSystemWindowsResponse {
  @scala.inline
  def apply(FinalBackupId: BackupId = null, FinalBackupTags: Tags = null): DeleteFileSystemWindowsResponse = {
    val __obj = js.Dynamic.literal()
    if (FinalBackupId != null) __obj.updateDynamic("FinalBackupId")(FinalBackupId.asInstanceOf[js.Any])
    if (FinalBackupTags != null) __obj.updateDynamic("FinalBackupTags")(FinalBackupTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemWindowsResponse]
  }
}

