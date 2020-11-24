package typings.blueprintjsDatetime.datePickerMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerProps
  extends IDatePickerBaseProps
     with IProps {
  
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Text for the reset button in the action bar.
    * @default "Clear"
    */
  var clearButtonText: js.UndefOr[String] = js.native
  
  /**
    * Initial day the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[Date] = js.native
  
  /**
    * Called when the user selects a day.
    * If being used in an uncontrolled manner, `selectedDate` will be `null` if the user clicks the currently selected
    * day. If being used in a controlled manner, `selectedDate` will contain the day clicked no matter what.
    * `isUserChange` is true if the user selected a day, and false if the date was automatically changed
    * by the user navigating to a new month or year rather than explicitly clicking on a date in the calendar.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.native
  
  /**
    * Called when the `shortcuts` props is enabled and the user changes the shortcut.
    */
  var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDatePickerShortcut, /* index */ Double, Unit]] = js.native
  
  /**
    * The currently selected shortcut.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  
  /**
    * Whether shortcuts to quickly select a date are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.native
  
  /**
    * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown.
    * @default false
    */
  var showActionsBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Text for the today button in the action bar.
    * @default "Today"
    */
  var todayButtonText: js.UndefOr[String] = js.native
  
  /**
    * The currently selected day. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[Date | Null] = js.native
}
object IDatePickerProps {
  
  @scala.inline
  def apply(): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerProps]
  }
  
  @scala.inline
  implicit class IDatePickerPropsOps[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
    
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
    def setCanClearSelection(value: Boolean): Self = this.set("canClearSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanClearSelection: Self = this.set("canClearSelection", js.undefined)
    
    @scala.inline
    def setClearButtonText(value: String): Self = this.set("clearButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonText: Self = this.set("clearButtonText", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnShortcutChange(value: (/* shortcut */ IDatePickerShortcut, /* index */ Double) => Unit): Self = this.set("onShortcutChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShortcutChange: Self = this.set("onShortcutChange", js.undefined)
    
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
    
    @scala.inline
    def setShortcutsVarargs(value: IDatePickerShortcut*): Self = this.set("shortcuts", js.Array(value :_*))
    
    @scala.inline
    def setShortcuts(value: Boolean | js.Array[IDatePickerShortcut]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    
    @scala.inline
    def setShowActionsBar(value: Boolean): Self = this.set("showActionsBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowActionsBar: Self = this.set("showActionsBar", js.undefined)
    
    @scala.inline
    def setTodayButtonText(value: String): Self = this.set("todayButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayButtonText: Self = this.set("todayButtonText", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
