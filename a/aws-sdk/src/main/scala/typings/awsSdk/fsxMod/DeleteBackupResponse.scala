package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupResponse extends js.Object {
  /**
    * The ID of the backup deleted.
    */
  var BackupId: js.UndefOr[typings.awsSdk.fsxMod.BackupId] = js.native
  /**
    * The lifecycle of the backup. Should be DELETED.
    */
  var Lifecycle: js.UndefOr[BackupLifecycle] = js.native
}

object DeleteBackupResponse {
  @scala.inline
  def apply(BackupId: BackupId = null, Lifecycle: BackupLifecycle = null): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (BackupId != null) __obj.updateDynamic("BackupId")(BackupId.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupResponse]
  }
}

