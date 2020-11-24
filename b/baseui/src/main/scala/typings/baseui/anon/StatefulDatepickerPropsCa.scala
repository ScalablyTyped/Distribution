package typings.baseui.anon

import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.mouseOver
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveLeft
import typings.baseui.baseuiStrings.moveRight
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.vertical
import typings.baseui.datepickerMod.CalendarProps
import typings.baseui.datepickerMod.ContainerState
import typings.baseui.datepickerMod.DatepickerOverrides
import typings.baseui.datepickerMod.SharedStylePropsT
import typings.baseui.datepickerMod.StateReducer
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/datepicker.StatefulDatepickerProps<baseui.baseui/datepicker.CalendarProps> */
@js.native
trait StatefulDatepickerPropsCa extends js.Object {
  
  var autoFocusCalendar: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Function1[/* args */ CalendarProps, ReactNode]] = js.native
  
  var excludeDates: js.UndefOr[js.Array[typings.std.Date]] = js.native
  
  var filterDate: js.UndefOr[js.Function1[/* day */ typings.std.Date, Boolean]] = js.native
  
  var highlightedDate: js.UndefOr[typings.std.Date] = js.native
  
  var includeDates: js.UndefOr[js.Array[typings.std.Date]] = js.native
  
  var initialState: js.UndefOr[ContainerState] = js.native
  
  // see https://github.com/date-fns/date-fns/blob/master/src/locale/index.js.flow
  var locale: js.UndefOr[js.Any] = js.native
  
  var maxDate: js.UndefOr[typings.std.Date] = js.native
  
  var minDate: js.UndefOr[typings.std.Date] = js.native
  
  var monthsShown: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[typings.baseui.datepickerMod.onChange] = js.native
  
  var onDayClick: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  
  var onDayMouseLeave: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  
  var onDayMouseOver: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  
  var onMonthChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.native
  
  var onYearChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.native
  
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  var overrides: js.UndefOr[DatepickerOverrides[SharedStylePropsT]] = js.native
  
  var peekNextMonth: js.UndefOr[Boolean] = js.native
  
  var quickSelect: js.UndefOr[Boolean] = js.native
  
  var quickSelectOptions: js.UndefOr[js.Array[BeginDate]] = js.native
  
  var range: js.UndefOr[Boolean] = js.native
  
  var stateReducer: js.UndefOr[StateReducer] = js.native
  
  var timeSelectEnd: js.UndefOr[Boolean] = js.native
  
  var timeSelectStart: js.UndefOr[Boolean] = js.native
  
  var trapTabbing: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[typings.std.Date | js.Array[typings.std.Date] | Null] = js.native
}
object StatefulDatepickerPropsCa {
  
  @scala.inline
  def apply(): StatefulDatepickerPropsCa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulDatepickerPropsCa]
  }
  
  @scala.inline
  implicit class StatefulDatepickerPropsCaOps[Self <: StatefulDatepickerPropsCa] (val x: Self) extends AnyVal {
    
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
    def setAutoFocusCalendar(value: Boolean): Self = this.set("autoFocusCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocusCalendar: Self = this.set("autoFocusCalendar", js.undefined)
    
    @scala.inline
    def setChildren(value: /* args */ CalendarProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setExcludeDatesVarargs(value: typings.std.Date*): Self = this.set("excludeDates", js.Array(value :_*))
    
    @scala.inline
    def setExcludeDates(value: js.Array[typings.std.Date]): Self = this.set("excludeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeDates: Self = this.set("excludeDates", js.undefined)
    
    @scala.inline
    def setFilterDate(value: /* day */ typings.std.Date => Boolean): Self = this.set("filterDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterDate: Self = this.set("filterDate", js.undefined)
    
    @scala.inline
    def setHighlightedDate(value: typings.std.Date): Self = this.set("highlightedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightedDate: Self = this.set("highlightedDate", js.undefined)
    
    @scala.inline
    def setIncludeDatesVarargs(value: typings.std.Date*): Self = this.set("includeDates", js.Array(value :_*))
    
    @scala.inline
    def setIncludeDates(value: js.Array[typings.std.Date]): Self = this.set("includeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDates: Self = this.set("includeDates", js.undefined)
    
    @scala.inline
    def setInitialState(value: ContainerState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: typings.std.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: typings.std.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMonthsShown(value: Double): Self = this.set("monthsShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthsShown: Self = this.set("monthsShown", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ Date => js.Any): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnDayClick(value: /* args */ DateEvent => _): Self = this.set("onDayClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDayClick: Self = this.set("onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(value: /* args */ DateEvent => _): Self = this.set("onDayMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDayMouseLeave: Self = this.set("onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setOnDayMouseOver(value: /* args */ DateEvent => _): Self = this.set("onDayMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDayMouseOver: Self = this.set("onDayMouseOver", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* args */ DateDate => _): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* args */ DateDate => _): Self = this.set("onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setOverrides(value: DatepickerOverrides[SharedStylePropsT]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPeekNextMonth(value: Boolean): Self = this.set("peekNextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeekNextMonth: Self = this.set("peekNextMonth", js.undefined)
    
    @scala.inline
    def setQuickSelect(value: Boolean): Self = this.set("quickSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSelect: Self = this.set("quickSelect", js.undefined)
    
    @scala.inline
    def setQuickSelectOptionsVarargs(value: BeginDate*): Self = this.set("quickSelectOptions", js.Array(value :_*))
    
    @scala.inline
    def setQuickSelectOptions(value: js.Array[BeginDate]): Self = this.set("quickSelectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSelectOptions: Self = this.set("quickSelectOptions", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState
    ): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
    
    @scala.inline
    def setTimeSelectEnd(value: Boolean): Self = this.set("timeSelectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSelectEnd: Self = this.set("timeSelectEnd", js.undefined)
    
    @scala.inline
    def setTimeSelectStart(value: Boolean): Self = this.set("timeSelectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSelectStart: Self = this.set("timeSelectStart", js.undefined)
    
    @scala.inline
    def setTrapTabbing(value: Boolean): Self = this.set("trapTabbing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrapTabbing: Self = this.set("trapTabbing", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: typings.std.Date*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: typings.std.Date | js.Array[typings.std.Date]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
