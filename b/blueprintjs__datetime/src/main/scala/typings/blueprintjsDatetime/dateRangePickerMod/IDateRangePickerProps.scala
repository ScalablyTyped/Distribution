package typings.blueprintjsDatetime.dateRangePickerMod

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateRangePickerProps
  extends IDatePickerBaseProps
     with IProps {
  
  /**
    * Whether the start and end dates of the range can be the same day.
    * If `true`, clicking a selected date will create a one-day range.
    * If `false`, clicking a selected date will clear the selection.
    * @default false
    */
  var allowSingleDayRange: js.UndefOr[Boolean] = js.native
  
  /**
    * The date-range boundary that the next click should modify.
    * This will be honored unless the next click would overlap the other boundary date.
    * In that case, the two boundary dates will be auto-swapped to keep them in chronological order.
    * If `undefined`, the picker will revert to its default selection behavior.
    */
  var boundaryToModify: js.UndefOr[Boundary] = js.native
  
  /**
    * Whether displayed months in the calendar are contiguous.
    * If false, each side of the calendar can move independently to non-contiguous months.
    * @default true
    */
  var contiguousCalendarMonths: js.UndefOr[Boolean] = js.native
  
  /**
    * Initial `DateRange` the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[DateRange] = js.native
  
  /**
    * Called when the user selects a day.
    * If no days are selected, it will pass `[null, null]`.
    * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
    * If both a start and end date are selected, it will pass `[startDate, endDate]`.
    */
  var onChange: js.UndefOr[js.Function1[/* selectedDates */ DateRange, Unit]] = js.native
  
  /**
    * Called when the user changes the hovered date range, either from mouseenter or mouseleave.
    * When triggered from mouseenter, it will pass the date range that would result from next click.
    * When triggered from mouseleave, it will pass `undefined`.
    */
  var onHoverChange: js.UndefOr[
    js.Function3[
      /* hoveredDates */ DateRange, 
      /* hoveredDay */ Date, 
      /* hoveredBoundary */ Boundary, 
      Unit
    ]
  ] = js.native
  
  /**
    * Called when the `shortcuts` props is enabled and the user changes the shortcut.
    */
  var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.native
  
  /**
    * The currently selected shortcut.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  
  /**
    * Whether shortcuts to quickly select a range of dates are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    * @default true
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.native
  
  /**
    * Whether to show only a single month calendar.
    * @default false
    */
  var singleMonthOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The currently selected `DateRange`.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[DateRange] = js.native
}
object IDateRangePickerProps {
  
  @scala.inline
  def apply(): IDateRangePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateRangePickerProps]
  }
  
  @scala.inline
  implicit class IDateRangePickerPropsOps[Self <: IDateRangePickerProps] (val x: Self) extends AnyVal {
    
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
    def setBoundaryToModify(value: Boundary): Self = this.set("boundaryToModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryToModify: Self = this.set("boundaryToModify", js.undefined)
    
    @scala.inline
    def setContiguousCalendarMonths(value: Boolean): Self = this.set("contiguousCalendarMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContiguousCalendarMonths: Self = this.set("contiguousCalendarMonths", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: DateRange): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* selectedDates */ DateRange => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnHoverChange(
      value: (/* hoveredDates */ DateRange, /* hoveredDay */ Date, /* hoveredBoundary */ Boundary) => Unit
    ): Self = this.set("onHoverChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnHoverChange: Self = this.set("onHoverChange", js.undefined)
    
    @scala.inline
    def setOnShortcutChange(value: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit): Self = this.set("onShortcutChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShortcutChange: Self = this.set("onShortcutChange", js.undefined)
    
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
    
    @scala.inline
    def setShortcutsVarargs(value: IDateRangeShortcut*): Self = this.set("shortcuts", js.Array(value :_*))
    
    @scala.inline
    def setShortcuts(value: Boolean | js.Array[IDateRangeShortcut]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    
    @scala.inline
    def setSingleMonthOnly(value: Boolean): Self = this.set("singleMonthOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleMonthOnly: Self = this.set("singleMonthOnly", js.undefined)
    
    @scala.inline
    def setValue(value: DateRange): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
