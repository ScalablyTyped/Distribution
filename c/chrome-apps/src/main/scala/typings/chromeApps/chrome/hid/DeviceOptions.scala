package typings.chromeApps.chrome.hid

import typings.chromeApps.chrome.deprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOptions extends js.Object {
  /**
    * A device matching any given filter will be returned.
    * An empty filter list will return all devices the app has permission for.
    * @since Chrome 39
    */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.native
  /**
    * Equivalent to setting DeviceFilter.productId.
    * @deprecated Deprecated since Chrome 39.
    */
  var productId: js.UndefOr[deprecated] = js.native
  /**
    * Equivalent to setting DeviceFilter.vendorId.
    * @deprecated Deprecated since Chrome 39
    */
  var vendorId: js.UndefOr[deprecated] = js.native
}

object DeviceOptions {
  @scala.inline
  def apply(): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOptions]
  }
  @scala.inline
  implicit class DeviceOptionsOps[Self <: DeviceOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: DeviceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[DeviceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setProductId(value: deprecated): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setVendorId(value: deprecated): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
  }
  
}

