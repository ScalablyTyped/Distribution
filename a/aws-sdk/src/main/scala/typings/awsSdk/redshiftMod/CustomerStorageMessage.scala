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
    TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
    TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined
  ): CustomerStorageMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(TotalBackupSizeInMegaBytes)) __obj.updateDynamic("TotalBackupSizeInMegaBytes")(TotalBackupSizeInMegaBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalProvisionedStorageInMegaBytes)) __obj.updateDynamic("TotalProvisionedStorageInMegaBytes")(TotalProvisionedStorageInMegaBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerStorageMessage]
  }
}

