package typings.chromeApps.chrome.bluetooth

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Some criteria to filter the list of returned bluetooth devices. If the filter is not set or set to {}, returned device list will contain all bluetooth devices. Right now this is only supported in ChromeOS, for other platforms, a full list is returned.
  */
@js.native
trait DeviceFilter extends js.Object {
  
  /** Type of filter to apply to the device list. Default is all. */
  var filterType: js.UndefOr[DeviceFilterType] = js.native
  
  /** Maximum number of bluetoth devices to return. Default is 0 (no limit) if unspecified. */
  var limit: js.UndefOr[integer] = js.native
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
    def setFilterType(value: DeviceFilterType): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setLimit(value: integer): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
}
