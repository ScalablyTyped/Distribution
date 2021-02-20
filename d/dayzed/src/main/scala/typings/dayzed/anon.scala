package typings.dayzed

import typings.dayzed.dayzedNumbers.`0`
import typings.dayzed.dayzedNumbers.`1`
import typings.dayzed.dayzedNumbers.`2`
import typings.dayzed.dayzedNumbers.`3`
import typings.dayzed.dayzedNumbers.`4`
import typings.dayzed.dayzedNumbers.`5`
import typings.dayzed.dayzedNumbers.`6`
import typings.dayzed.mod.Calendar
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Calendars extends StObject {
    
    var calendars: js.Array[Calendar] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object Calendars {
    
    @scala.inline
    def apply(calendars: js.Array[Calendar]): Calendars = {
      val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendars]
    }
    
    @scala.inline
    implicit class CalendarsMutableBuilder[Self <: Calendars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendars(value: js.Array[Calendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait DateObj extends StObject {
    
    var dateObj: typings.dayzed.mod.DateObj = js.native
  }
  object DateObj {
    
    @scala.inline
    def apply(dateObj: typings.dayzed.mod.DateObj): DateObj = {
      val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObj]
    }
    
    @scala.inline
    implicit class DateObjMutableBuilder[Self <: DateObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateObj(value: typings.dayzed.mod.DateObj): Self = StObject.set(x, "dateObj", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<dayzed.dayzed.Props, 'children' | 'render'> */
  @js.native
  trait OmitPropschildrenrender extends StObject {
    
    var date: js.UndefOr[Date] = js.native
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
    
    var maxDate: js.UndefOr[Date] = js.native
    
    var minDate: js.UndefOr[Date] = js.native
    
    var monthsToDisplay: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var onDateSelected: js.Function1[/* selectedDate */ typings.dayzed.mod.DateObj, Unit] = js.native
    
    var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
    
    var selected: js.UndefOr[Date | js.Array[Date]] = js.native
    
    var showOutsideDays: js.UndefOr[Boolean] = js.native
  }
  object OmitPropschildrenrender {
    
    @scala.inline
    def apply(onDateSelected: /* selectedDate */ typings.dayzed.mod.DateObj => Unit): OmitPropschildrenrender = {
      val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
      __obj.asInstanceOf[OmitPropschildrenrender]
    }
    
    @scala.inline
    implicit class OmitPropschildrenrenderMutableBuilder[Self <: OmitPropschildrenrender] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMonthsToDisplay(value: Double): Self = StObject.set(x, "monthsToDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsToDisplayUndefined: Self = StObject.set(x, "monthsToDisplay", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnDateSelected(value: /* selectedDate */ typings.dayzed.mod.DateObj => Unit): Self = StObject.set(x, "onDateSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOffsetChanged(value: /* offset */ Double => Unit): Self = StObject.set(x, "onOffsetChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOffsetChangedUndefined: Self = StObject.set(x, "onOffsetChanged", js.undefined)
      
      @scala.inline
      def setSelected(value: Date | js.Array[Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectedVarargs(value: Date*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      @scala.inline
      def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
    }
  }
}
