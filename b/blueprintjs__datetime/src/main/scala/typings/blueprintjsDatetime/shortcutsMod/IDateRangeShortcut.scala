package typings.blueprintjsDatetime.shortcutsMod

import typings.blueprintjsDatetime.dateRangeMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateRangeShortcut extends IDateShortcutBase {
  
  /**
    * Date range represented by this shortcut. Note that time components of a
    * shortcut are ignored by default; set `includeTime: true` to respect them.
    */
  var dateRange: DateRange = js.native
}
object IDateRangeShortcut {
  
  @scala.inline
  def apply(dateRange: DateRange, label: String): IDateRangeShortcut = {
    val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateRangeShortcut]
  }
  
  @scala.inline
  implicit class IDateRangeShortcutOps[Self <: IDateRangeShortcut] (val x: Self) extends AnyVal {
    
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
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
  }
}
