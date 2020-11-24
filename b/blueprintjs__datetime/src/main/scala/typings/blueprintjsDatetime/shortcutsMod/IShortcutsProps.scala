package typings.blueprintjsDatetime.shortcutsMod

import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShortcutsProps extends js.Object {
  
  var allowSingleDayRange: Boolean = js.native
  
  var maxDate: Date = js.native
  
  var minDate: Date = js.native
  
  def onShortcutClick(shortcut: IDateRangeShortcut, index: Double): Unit = js.native
  
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  
  var shortcuts: js.Array[IDateRangeShortcut] | `true` = js.native
  
  var timePrecision: TimePrecision = js.native
  
  /**
    * The DatePicker component reuses this component for a single date.
    * This changes the default shortcut labels and affects which shortcuts are used.
    * @default false
    */
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.native
}
object IShortcutsProps {
  
  @scala.inline
  def apply(
    allowSingleDayRange: Boolean,
    maxDate: Date,
    minDate: Date,
    onShortcutClick: (IDateRangeShortcut, Double) => Unit,
    shortcuts: js.Array[IDateRangeShortcut] | `true`,
    timePrecision: TimePrecision
  ): IShortcutsProps = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutsProps]
  }
  
  @scala.inline
  implicit class IShortcutsPropsOps[Self <: IShortcutsProps] (val x: Self) extends AnyVal {
    
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
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShortcutClick(value: (IDateRangeShortcut, Double) => Unit): Self = this.set("onShortcutClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShortcutsVarargs(value: IDateRangeShortcut*): Self = this.set("shortcuts", js.Array(value :_*))
    
    @scala.inline
    def setShortcuts(value: js.Array[IDateRangeShortcut] | `true`): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePrecision(value: TimePrecision): Self = this.set("timePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
    
    @scala.inline
    def setUseSingleDateShortcuts(value: Boolean): Self = this.set("useSingleDateShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSingleDateShortcuts: Self = this.set("useSingleDateShortcuts", js.undefined)
  }
}
