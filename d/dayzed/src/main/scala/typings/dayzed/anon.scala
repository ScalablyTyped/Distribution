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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Calendars extends StObject {
    
    var calendars: js.Array[Calendar]
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Calendars {
    
    inline def apply(calendars: js.Array[Calendar]): Calendars = {
      val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendars]
    }
    
    extension [Self <: Calendars](x: Self) {
      
      inline def setCalendars(value: js.Array[Calendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      inline def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value :_*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait DateObj extends StObject {
    
    var dateObj: typings.dayzed.mod.DateObj
  }
  object DateObj {
    
    inline def apply(dateObj: typings.dayzed.mod.DateObj): DateObj = {
      val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObj]
    }
    
    extension [Self <: DateObj](x: Self) {
      
      inline def setDateObj(value: typings.dayzed.mod.DateObj): Self = StObject.set(x, "dateObj", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<dayzed.dayzed.Props, 'children' | 'render'> */
  trait OmitPropschildrenrender extends StObject {
    
    var date: js.UndefOr[Date] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var monthsToDisplay: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var onDateSelected: js.Function1[/* selectedDate */ typings.dayzed.mod.DateObj, Unit]
    
    var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
    
    var selected: js.UndefOr[Date | js.Array[Date]] = js.undefined
    
    var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  }
  object OmitPropschildrenrender {
    
    inline def apply(onDateSelected: /* selectedDate */ typings.dayzed.mod.DateObj => Unit): OmitPropschildrenrender = {
      val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
      __obj.asInstanceOf[OmitPropschildrenrender]
    }
    
    extension [Self <: OmitPropschildrenrender](x: Self) {
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthsToDisplay(value: Double): Self = StObject.set(x, "monthsToDisplay", value.asInstanceOf[js.Any])
      
      inline def setMonthsToDisplayUndefined: Self = StObject.set(x, "monthsToDisplay", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnDateSelected(value: /* selectedDate */ typings.dayzed.mod.DateObj => Unit): Self = StObject.set(x, "onDateSelected", js.Any.fromFunction1(value))
      
      inline def setOnOffsetChanged(value: /* offset */ Double => Unit): Self = StObject.set(x, "onOffsetChanged", js.Any.fromFunction1(value))
      
      inline def setOnOffsetChangedUndefined: Self = StObject.set(x, "onOffsetChanged", js.undefined)
      
      inline def setSelected(value: Date | js.Array[Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: Date*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      inline def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
      
      inline def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
    }
  }
}
