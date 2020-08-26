package typings.chrome.chrome.serial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInfo extends js.Object {
  /** Optional. A human-readable display name for the underlying device if one can be queried from the host driver. */
  var displayName: js.UndefOr[Double] = js.native
  /** The device's system path. This should be passed as the path argument to chrome.serial.connect in order to connect to this device. */
  var path: String = js.native
  /** Optional. A USB product ID if one can be determined for the underlying device. */
  var productId: js.UndefOr[Double] = js.native
  /** Optional. A PCI or USB vendor ID if one can be determined for the underlying device. */
  var vendorId: js.UndefOr[Double] = js.native
}

object DeviceInfo {
  @scala.inline
  def apply(path: String): DeviceInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  @scala.inline
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: Double): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setProductId(value: Double): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setVendorId(value: Double): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
  }
  
}

