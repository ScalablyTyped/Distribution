package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreBackupResponse extends js.Object {
  /**
    * Information on the Backup object created.
    */
  var Backup: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Backup] = js.native
}

object RestoreBackupResponse {
  @scala.inline
  def apply(Backup: Backup = null): RestoreBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (Backup != null) __obj.updateDynamic("Backup")(Backup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreBackupResponse]
  }
}

