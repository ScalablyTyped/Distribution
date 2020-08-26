package typings.chromeApps.chrome.hid

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
@js.native
trait DeviceFilter extends js.Object {
  /** Device product ID, only checked only if the vendor ID matches. */
  var productId: js.UndefOr[integer] = js.native
  /** HID usage identifier, checked only if the HID usage page matches. */
  var usage: js.UndefOr[integer] = js.native
  /** HID usage page identifier. */
  var usagePage: js.UndefOr[integer] = js.native
  /** Device vendor ID. */
  var vendorId: js.UndefOr[integer] = js.native
}

object DeviceFilter {
  @scala.inline
  def apply(): DeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFilter]
  }
  @scala.inline
  implicit class DeviceFilterOps[Self <: DeviceFilter] (val x: Self) extends AnyVal {
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
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setUsage(value: integer): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    @scala.inline
    def setUsagePage(value: integer): Self = this.set("usagePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsagePage: Self = this.set("usagePage", js.undefined)
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
  }
  
}

