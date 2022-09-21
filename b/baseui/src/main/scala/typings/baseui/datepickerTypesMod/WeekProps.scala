package typings.baseui.datepickerTypesMod

import typings.baseui.anon.DateTEventEvent
import typings.baseui.anon.`5`
import typings.baseui.utilsTypesMod.DateIOAdapter
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekProps[T] extends StObject {
  
  var adapter: DateIOAdapter[T]
  
  var date: T
  
  var dateLabel: js.UndefOr[(js.Function1[/* date */ T, ReactNode]) | Null] = js.undefined
  
  var density: Density
  
  var excludeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  var filterDate: js.UndefOr[(js.Function1[/* day */ T, Boolean]) | Null] = js.undefined
  
  var focusedCalendar: Boolean
  
  var hasLockedBehavior: Boolean
  
  var highlightedDate: js.UndefOr[T | Null] = js.undefined
  
  var includeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  var locale: js.UndefOr[Locale | Null] = js.undefined
  
  var maxDate: js.UndefOr[T | Null] = js.undefined
  
  var minDate: js.UndefOr[T | Null] = js.undefined
  
  var month: js.UndefOr[Double | Null] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* a */ `5`[T], Any]] = js.undefined
  
  def onDayBlur(a: DateTEventEvent[T]): Any
  
  def onDayClick(a: DateTEventEvent[T]): Any
  
  def onDayFocus(a: DateTEventEvent[T]): Any
  
  def onDayMouseLeave(a: DateTEventEvent[T]): Any
  
  def onDayMouseOver(a: DateTEventEvent[T]): Any
  
  var overrides: js.UndefOr[DatepickerOverrides] = js.undefined
  
  var peekNextMonth: Boolean
  
  var range: js.UndefOr[Boolean] = js.undefined
  
  var selectedInput: js.UndefOr[InputRole] = js.undefined
  
  var value: js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])] = js.undefined
}
object WeekProps {
  
  inline def apply[T](
    adapter: DateIOAdapter[T],
    date: T,
    density: Density,
    focusedCalendar: Boolean,
    hasLockedBehavior: Boolean,
    onDayBlur: DateTEventEvent[T] => Any,
    onDayClick: DateTEventEvent[T] => Any,
    onDayFocus: DateTEventEvent[T] => Any,
    onDayMouseLeave: DateTEventEvent[T] => Any,
    onDayMouseOver: DateTEventEvent[T] => Any,
    peekNextMonth: Boolean
  ): WeekProps[T] = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], focusedCalendar = focusedCalendar.asInstanceOf[js.Any], hasLockedBehavior = hasLockedBehavior.asInstanceOf[js.Any], onDayBlur = js.Any.fromFunction1(onDayBlur), onDayClick = js.Any.fromFunction1(onDayClick), onDayFocus = js.Any.fromFunction1(onDayFocus), onDayMouseLeave = js.Any.fromFunction1(onDayMouseLeave), onDayMouseOver = js.Any.fromFunction1(onDayMouseOver), peekNextMonth = peekNextMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekProps[T]]
  }
  
  extension [Self <: WeekProps[?], T](x: Self & WeekProps[T]) {
    
    inline def setAdapter(value: DateIOAdapter[T]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateLabel(value: /* date */ T => ReactNode): Self = StObject.set(x, "dateLabel", js.Any.fromFunction1(value))
    
    inline def setDateLabelNull: Self = StObject.set(x, "dateLabel", null)
    
    inline def setDateLabelUndefined: Self = StObject.set(x, "dateLabel", js.undefined)
    
    inline def setDensity(value: Density): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setExcludeDates(value: js.Array[T]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    inline def setExcludeDatesNull: Self = StObject.set(x, "excludeDates", null)
    
    inline def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    inline def setExcludeDatesVarargs(value: T*): Self = StObject.set(x, "excludeDates", js.Array(value*))
    
    inline def setFilterDate(value: /* day */ T => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    inline def setFilterDateNull: Self = StObject.set(x, "filterDate", null)
    
    inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    inline def setFocusedCalendar(value: Boolean): Self = StObject.set(x, "focusedCalendar", value.asInstanceOf[js.Any])
    
    inline def setHasLockedBehavior(value: Boolean): Self = StObject.set(x, "hasLockedBehavior", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDate(value: T): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDateNull: Self = StObject.set(x, "highlightedDate", null)
    
    inline def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    inline def setIncludeDates(value: js.Array[T]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesNull: Self = StObject.set(x, "includeDates", null)
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: T*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxDate(value: T): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: T): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthNull: Self = StObject.set(x, "month", null)
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setOnChange(value: /* a */ `5`[T] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDayBlur(value: DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayBlur", js.Any.fromFunction1(value))
    
    inline def setOnDayClick(value: DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayClick", js.Any.fromFunction1(value))
    
    inline def setOnDayFocus(value: DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction1(value))
    
    inline def setOnDayMouseLeave(value: DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnDayMouseOver(value: DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction1(value))
    
    inline def setOverrides(value: DatepickerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSelectedInput(value: InputRole): Self = StObject.set(x, "selectedInput", value.asInstanceOf[js.Any])
    
    inline def setSelectedInputNull: Self = StObject.set(x, "selectedInput", null)
    
    inline def setSelectedInputUndefined: Self = StObject.set(x, "selectedInput", js.undefined)
    
    inline def setValue(value: T | (js.Array[js.UndefOr[T | Null]])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
