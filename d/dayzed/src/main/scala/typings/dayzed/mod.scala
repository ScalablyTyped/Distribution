package typings.dayzed

import typings.dayzed.anon.OmitPropschildrenrender
import typings.dayzed.dayzedNumbers.`0`
import typings.dayzed.dayzedNumbers.`10`
import typings.dayzed.dayzedNumbers.`11`
import typings.dayzed.dayzedNumbers.`1`
import typings.dayzed.dayzedNumbers.`2`
import typings.dayzed.dayzedNumbers.`3`
import typings.dayzed.dayzedNumbers.`4`
import typings.dayzed.dayzedNumbers.`5`
import typings.dayzed.dayzedNumbers.`6`
import typings.dayzed.dayzedNumbers.`7`
import typings.dayzed.dayzedNumbers.`8`
import typings.dayzed.dayzedNumbers.`9`
import typings.dayzed.dayzedStrings._empty
import typings.react.mod.HTMLProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLButtonElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dayzed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PropsWithChildren[Props]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useDayzed(props: OmitPropschildrenrender): RenderProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDayzed")(props.asInstanceOf[js.Any]).asInstanceOf[RenderProps]
  
  trait Calendar extends StObject {
    
    var firstDayOfMonth: js.Date
    
    var lastDayOfMonth: js.Date
    
    var month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`
    
    var weeks: js.Array[js.Array[DateObj | _empty]]
    
    var year: Double
  }
  object Calendar {
    
    inline def apply(
      firstDayOfMonth: js.Date,
      lastDayOfMonth: js.Date,
      month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`,
      weeks: js.Array[js.Array[DateObj | _empty]],
      year: Double
    ): Calendar = {
      val __obj = js.Dynamic.literal(firstDayOfMonth = firstDayOfMonth.asInstanceOf[js.Any], lastDayOfMonth = lastDayOfMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendar]
    }
    
    extension [Self <: Calendar](x: Self) {
      
      inline def setFirstDayOfMonth(value: js.Date): Self = StObject.set(x, "firstDayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setLastDayOfMonth(value: js.Date): Self = StObject.set(x, "lastDayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setWeeks(value: js.Array[js.Array[DateObj | _empty]]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      inline def setWeeksVarargs(value: (js.Array[DateObj | _empty])*): Self = StObject.set(x, "weeks", js.Array(value*))
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateObj extends StObject {
    
    var date: js.Date
    
    var nextMonth: Boolean
    
    var prevMonth: Boolean
    
    var selectable: Boolean
    
    var selected: Boolean
    
    var today: Boolean
  }
  object DateObj {
    
    inline def apply(
      date: js.Date,
      nextMonth: Boolean,
      prevMonth: Boolean,
      selectable: Boolean,
      selected: Boolean,
      today: Boolean
    ): DateObj = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], prevMonth = prevMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObj]
    }
    
    extension [Self <: DateObj](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setNextMonth(value: Boolean): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      inline def setPrevMonth(value: Boolean): Self = StObject.set(x, "prevMonth", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetBackForwardPropsOptions
    extends StObject
       with HTMLProps[HTMLButtonElement] {
    
    var calendars: js.Array[Calendar]
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object GetBackForwardPropsOptions {
    
    inline def apply(calendars: js.Array[Calendar]): GetBackForwardPropsOptions = {
      val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBackForwardPropsOptions]
    }
    
    extension [Self <: GetBackForwardPropsOptions](x: Self) {
      
      inline def setCalendars(value: js.Array[Calendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      inline def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait GetDatePropsOptions
    extends StObject
       with HTMLProps[HTMLButtonElement] {
    
    var dateObj: DateObj
  }
  object GetDatePropsOptions {
    
    inline def apply(dateObj: DateObj): GetDatePropsOptions = {
      val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDatePropsOptions]
    }
    
    extension [Self <: GetDatePropsOptions](x: Self) {
      
      inline def setDateObj(value: DateObj): Self = StObject.set(x, "dateObj", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var children: js.UndefOr[RenderFn] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var monthsToDisplay: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    def onDateSelected(selectedDate: DateObj, event: SyntheticEvent[Element, Event]): Unit
    
    var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
    
    var render: js.UndefOr[RenderFn] = js.undefined
    
    var selected: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
    
    var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(onDateSelected: (DateObj, SyntheticEvent[Element, Event]) => Unit): Props = {
      val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction2(onDateSelected))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* renderProps */ RenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthsToDisplay(value: Double): Self = StObject.set(x, "monthsToDisplay", value.asInstanceOf[js.Any])
      
      inline def setMonthsToDisplayUndefined: Self = StObject.set(x, "monthsToDisplay", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnDateSelected(value: (DateObj, SyntheticEvent[Element, Event]) => Unit): Self = StObject.set(x, "onDateSelected", js.Any.fromFunction2(value))
      
      inline def setOnOffsetChanged(value: /* offset */ Double => Unit): Self = StObject.set(x, "onOffsetChanged", js.Any.fromFunction1(value))
      
      inline def setOnOffsetChangedUndefined: Self = StObject.set(x, "onOffsetChanged", js.undefined)
      
      inline def setRender(value: /* renderProps */ RenderProps => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSelected(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: js.Date*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
      
      inline def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
    }
  }
  
  type RenderFn = js.Function1[/* renderProps */ RenderProps, ReactNode]
  
  trait RenderProps extends StObject {
    
    var calendars: js.Array[Calendar]
    
    def getBackProps(data: GetBackForwardPropsOptions): Record[String, Any]
    
    def getDateProps(data: GetDatePropsOptions): Record[String, Any]
    
    def getForwardProps(data: GetBackForwardPropsOptions): Record[String, Any]
  }
  object RenderProps {
    
    inline def apply(
      calendars: js.Array[Calendar],
      getBackProps: GetBackForwardPropsOptions => Record[String, Any],
      getDateProps: GetDatePropsOptions => Record[String, Any],
      getForwardProps: GetBackForwardPropsOptions => Record[String, Any]
    ): RenderProps = {
      val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], getBackProps = js.Any.fromFunction1(getBackProps), getDateProps = js.Any.fromFunction1(getDateProps), getForwardProps = js.Any.fromFunction1(getForwardProps))
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setCalendars(value: js.Array[Calendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      inline def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value*))
      
      inline def setGetBackProps(value: GetBackForwardPropsOptions => Record[String, Any]): Self = StObject.set(x, "getBackProps", js.Any.fromFunction1(value))
      
      inline def setGetDateProps(value: GetDatePropsOptions => Record[String, Any]): Self = StObject.set(x, "getDateProps", js.Any.fromFunction1(value))
      
      inline def setGetForwardProps(value: GetBackForwardPropsOptions => Record[String, Any]): Self = StObject.set(x, "getForwardProps", js.Any.fromFunction1(value))
    }
  }
}
