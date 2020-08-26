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
  def apply(): CustomerStorageMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerStorageMessage]
  }
  @scala.inline
  implicit class CustomerStorageMessageOps[Self <: CustomerStorageMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTotalBackupSizeInMegaBytes(value: Double): Self = this.set("TotalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBackupSizeInMegaBytes: Self = this.set("TotalBackupSizeInMegaBytes", js.undefined)
    @scala.inline
    def setTotalProvisionedStorageInMegaBytes(value: Double): Self = this.set("TotalProvisionedStorageInMegaBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalProvisionedStorageInMegaBytes: Self = this.set("TotalProvisionedStorageInMegaBytes", js.undefined)
  }
  
}

