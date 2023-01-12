package typings.baseui.datepickerTypesMod

import typings.baseui.anon.DateEvent
import typings.baseui.anon.`9`
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayProps[T] extends StObject {
  
  var adapter: DateIOAdapter[T]
  
  var date: T
  
  var dateLabel: js.UndefOr[(js.Function1[/* day */ T, ReactNode]) | Null] = js.undefined
  
  var density: Density
  
  var disabled: Boolean
  
  var filterDate: js.UndefOr[(js.Function1[/* day */ T, Boolean]) | Null] = js.undefined
  
  var focusedCalendar: Boolean
  
  var hasLockedBehavior: Boolean
  
  var highlighted: Boolean
  
  var highlightedDate: js.UndefOr[T | Null] = js.undefined
  
  var includeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  var locale: js.UndefOr[Locale | Null] = js.undefined
  
  var maxDate: js.UndefOr[T | Null] = js.undefined
  
  var minDate: js.UndefOr[T | Null] = js.undefined
  
  var month: js.UndefOr[Double | Null] = js.undefined
  
  def onBlur(a: DateEvent[T]): Any
  
  def onClick(a: DateEvent[T]): Any
  
  def onFocus(a: DateEvent[T]): Any
  
  def onMouseLeave(a: DateEvent[T]): Any
  
  def onMouseOver(a: DateEvent[T]): Any
  
  def onSelect(a: `9`[T]): Any
  
  var overrides: js.UndefOr[DatepickerOverrides] = js.undefined
  
  var peekNextMonth: Boolean
  
  var range: Boolean
  
  var selectedInput: InputRole
  
  var value: js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])] = js.undefined
}
object DayProps {
  
  inline def apply[T](
    adapter: DateIOAdapter[T],
    date: T,
    density: Density,
    disabled: Boolean,
    focusedCalendar: Boolean,
    hasLockedBehavior: Boolean,
    highlighted: Boolean,
    onBlur: DateEvent[T] => Any,
    onClick: DateEvent[T] => Any,
    onFocus: DateEvent[T] => Any,
    onMouseLeave: DateEvent[T] => Any,
    onMouseOver: DateEvent[T] => Any,
    onSelect: `9`[T] => Any,
    peekNextMonth: Boolean,
    range: Boolean
  ): DayProps[T] = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusedCalendar = focusedCalendar.asInstanceOf[js.Any], hasLockedBehavior = hasLockedBehavior.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseOver = js.Any.fromFunction1(onMouseOver), onSelect = js.Any.fromFunction1(onSelect), peekNextMonth = peekNextMonth.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayProps[?], T] (val x: Self & DayProps[T]) extends AnyVal {
    
    inline def setAdapter(value: DateIOAdapter[T]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateLabel(value: /* day */ T => ReactNode): Self = StObject.set(x, "dateLabel", js.Any.fromFunction1(value))
    
    inline def setDateLabelNull: Self = StObject.set(x, "dateLabel", null)
    
    inline def setDateLabelUndefined: Self = StObject.set(x, "dateLabel", js.undefined)
    
    inline def setDensity(value: Density): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setFilterDate(value: /* day */ T => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    inline def setFilterDateNull: Self = StObject.set(x, "filterDate", null)
    
    inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    inline def setFocusedCalendar(value: Boolean): Self = StObject.set(x, "focusedCalendar", value.asInstanceOf[js.Any])
    
    inline def setHasLockedBehavior(value: Boolean): Self = StObject.set(x, "hasLockedBehavior", value.asInstanceOf[js.Any])
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
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
    
    inline def setOnBlur(value: DateEvent[T] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnClick(value: DateEvent[T] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: DateEvent[T] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeave(value: DateEvent[T] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseOver(value: DateEvent[T] => Any): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnSelect(value: `9`[T] => Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOverrides(value: DatepickerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSelectedInput(value: InputRole): Self = StObject.set(x, "selectedInput", value.asInstanceOf[js.Any])
    
    inline def setSelectedInputNull: Self = StObject.set(x, "selectedInput", null)
    
    inline def setSelectedInputUndefined: Self = StObject.set(x, "selectedInput", js.undefined)
    
    inline def setValue(value: T | (js.Array[js.UndefOr[T | Null]])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
