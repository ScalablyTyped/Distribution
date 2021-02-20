package typings.chromeApps.anon

import typings.chromeApps.chrome.usb.DeviceFilterStrict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiltersArray extends StObject {
  
  /**
    * A list of USB device filters matching supported devices.
    * A device only needs to match one of the provided filters.
    * A vendorId is required and only one of productId or interfaceClass may be provided.
    */
  var filters: js.Array[DeviceFilterStrict] = js.native
}
object FiltersArray {
  
  @scala.inline
  def apply(filters: js.Array[DeviceFilterStrict]): FiltersArray = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiltersArray]
  }
  
  @scala.inline
  implicit class FiltersArrayMutableBuilder[Self <: FiltersArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[DeviceFilterStrict]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: DeviceFilterStrict*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
