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
  def apply(Backup: Backup = null): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (Backup != null) __obj.updateDynamic("Backup")(Backup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupResponse]
  }
}

