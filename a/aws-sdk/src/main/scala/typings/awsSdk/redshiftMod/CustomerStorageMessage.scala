package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerStorageMessage extends js.Object {
  /**
    * The total amount of storage currently used for snapshots.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The total amount of storage currently provisioned.
    */
  var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.native
}

object CustomerStorageMessage {
  @scala.inline
  def apply(
    TotalBackupSizeInMegaBytes: Int | scala.Double = null,
    TotalProvisionedStorageInMegaBytes: Int | scala.Double = null
  ): CustomerStorageMessage = {
    val __obj = js.Dynamic.literal()
    if (TotalBackupSizeInMegaBytes != null) __obj.updateDynamic("TotalBackupSizeInMegaBytes")(TotalBackupSizeInMegaBytes.asInstanceOf[js.Any])
    if (TotalProvisionedStorageInMegaBytes != null) __obj.updateDynamic("TotalProvisionedStorageInMegaBytes")(TotalProvisionedStorageInMegaBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerStorageMessage]
  }
}

