package typings.blueprintjsDatetime.anon

import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typings.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/shortcuts.IShortcutsProps> */
@js.native
trait PartialIShortcutsProps extends js.Object {
  
  var allowSingleDayRange: js.UndefOr[Boolean] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var onShortcutClick: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.native
  
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  
  var shortcuts: js.UndefOr[js.Array[IDateRangeShortcut] | `true`] = js.native
  
  var timePrecision: js.UndefOr[TimePrecision] = js.native
  
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.native
}
object PartialIShortcutsProps {
  
  @scala.inline
  def apply(): PartialIShortcutsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIShortcutsProps]
  }
  
  @scala.inline
  implicit class PartialIShortcutsPropsOps[Self <: PartialIShortcutsProps] (val x: Self) extends AnyVal {
    
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
    def setAllowSingleDayRange(value: Boolean): Self = this.set("allowSingleDayRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSingleDayRange: Self = this.set("allowSingleDayRange", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnShortcutClick(value: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit): Self = this.set("onShortcutClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShortcutClick: Self = this.set("onShortcutClick", js.undefined)
    
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
    
    @scala.inline
    def setShortcutsVarargs(value: IDateRangeShortcut*): Self = this.set("shortcuts", js.Array(value :_*))
    
    @scala.inline
    def setShortcuts(value: js.Array[IDateRangeShortcut] | `true`): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    
    @scala.inline
    def setTimePrecision(value: TimePrecision): Self = this.set("timePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePrecision: Self = this.set("timePrecision", js.undefined)
    
    @scala.inline
    def setUseSingleDateShortcuts(value: Boolean): Self = this.set("useSingleDateShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSingleDateShortcuts: Self = this.set("useSingleDateShortcuts", js.undefined)
  }
}
