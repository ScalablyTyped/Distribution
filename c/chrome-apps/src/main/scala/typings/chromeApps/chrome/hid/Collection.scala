package typings.chromeApps.chrome.hid

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection extends js.Object {
  
  /** Report IDs which belong to the collection and to its children. */
  var reportIds: js.Array[integer] = js.native
  
  /** Page-defined usage identifier. */
  var usage: integer = js.native
  
  /** HID usage page identifier. */
  var usagePage: integer = js.native
}
object Collection {
  
  @scala.inline
  def apply(reportIds: js.Array[integer], usage: integer, usagePage: integer): Collection = {
    val __obj = js.Dynamic.literal(reportIds = reportIds.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    
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
    def setReportIdsVarargs(value: integer*): Self = this.set("reportIds", js.Array(value :_*))
    
    @scala.inline
    def setReportIds(value: js.Array[integer]): Self = this.set("reportIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: integer): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePage(value: integer): Self = this.set("usagePage", value.asInstanceOf[js.Any])
  }
}
