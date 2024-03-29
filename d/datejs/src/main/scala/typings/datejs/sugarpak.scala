package typings.datejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sugarpak {
  
  trait IAddOrientation extends StObject {
    
    def day(): Date
    
    def days(): Date
    
    def hour(): Date
    
    def hours(): Date
    
    def millisecond(): Date
    
    def milliseconds(): Date
    
    def minute(): Date
    
    def minutes(): Date
    
    def month(): Date
    
    def months(): Date
    
    def second(): Date
    
    def seconds(): Date
    
    def week(): Date
    
    def weeks(): Date
    
    def year(): Date
    
    def years(): Date
  }
  object IAddOrientation {
    
    inline def apply(
      day: () => Date,
      days: () => Date,
      hour: () => Date,
      hours: () => Date,
      millisecond: () => Date,
      milliseconds: () => Date,
      minute: () => Date,
      minutes: () => Date,
      month: () => Date,
      months: () => Date,
      second: () => Date,
      seconds: () => Date,
      week: () => Date,
      weeks: () => Date,
      year: () => Date,
      years: () => Date
    ): IAddOrientation = {
      val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
      __obj.asInstanceOf[IAddOrientation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAddOrientation] (val x: Self) extends AnyVal {
      
      inline def setDay(value: () => Date): Self = StObject.set(x, "day", js.Any.fromFunction0(value))
      
      inline def setDays(value: () => Date): Self = StObject.set(x, "days", js.Any.fromFunction0(value))
      
      inline def setHour(value: () => Date): Self = StObject.set(x, "hour", js.Any.fromFunction0(value))
      
      inline def setHours(value: () => Date): Self = StObject.set(x, "hours", js.Any.fromFunction0(value))
      
      inline def setMillisecond(value: () => Date): Self = StObject.set(x, "millisecond", js.Any.fromFunction0(value))
      
      inline def setMilliseconds(value: () => Date): Self = StObject.set(x, "milliseconds", js.Any.fromFunction0(value))
      
      inline def setMinute(value: () => Date): Self = StObject.set(x, "minute", js.Any.fromFunction0(value))
      
      inline def setMinutes(value: () => Date): Self = StObject.set(x, "minutes", js.Any.fromFunction0(value))
      
      inline def setMonth(value: () => Date): Self = StObject.set(x, "month", js.Any.fromFunction0(value))
      
      inline def setMonths(value: () => Date): Self = StObject.set(x, "months", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => Date): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setSeconds(value: () => Date): Self = StObject.set(x, "seconds", js.Any.fromFunction0(value))
      
      inline def setWeek(value: () => Date): Self = StObject.set(x, "week", js.Any.fromFunction0(value))
      
      inline def setWeeks(value: () => Date): Self = StObject.set(x, "weeks", js.Any.fromFunction0(value))
      
      inline def setYear(value: () => Date): Self = StObject.set(x, "year", js.Any.fromFunction0(value))
      
      inline def setYears(value: () => Date): Self = StObject.set(x, "years", js.Any.fromFunction0(value))
    }
  }
  
  trait IDateElement extends StObject {
    
    def day(): IDateElementEvaluator
    
    def days(): IDateElementEvaluator
    
    def hour(): IDateElementEvaluator
    
    def hours(): IDateElementEvaluator
    
    def millisecond(): IDateElementEvaluator
    
    def milliseconds(): IDateElementEvaluator
    
    def minute(): IDateElementEvaluator
    
    def minutes(): IDateElementEvaluator
    
    def month(): IDateElementEvaluator
    
    def months(): IDateElementEvaluator
    
    def second(): IDateElementEvaluator
    
    def seconds(): IDateElementEvaluator
    
    def week(): IDateElementEvaluator
    
    def weeks(): IDateElementEvaluator
    
    def year(): IDateElementEvaluator
    
    def years(): IDateElementEvaluator
  }
  object IDateElement {
    
    inline def apply(
      day: () => IDateElementEvaluator,
      days: () => IDateElementEvaluator,
      hour: () => IDateElementEvaluator,
      hours: () => IDateElementEvaluator,
      millisecond: () => IDateElementEvaluator,
      milliseconds: () => IDateElementEvaluator,
      minute: () => IDateElementEvaluator,
      minutes: () => IDateElementEvaluator,
      month: () => IDateElementEvaluator,
      months: () => IDateElementEvaluator,
      second: () => IDateElementEvaluator,
      seconds: () => IDateElementEvaluator,
      week: () => IDateElementEvaluator,
      weeks: () => IDateElementEvaluator,
      year: () => IDateElementEvaluator,
      years: () => IDateElementEvaluator
    ): IDateElement = {
      val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
      __obj.asInstanceOf[IDateElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateElement] (val x: Self) extends AnyVal {
      
      inline def setDay(value: () => IDateElementEvaluator): Self = StObject.set(x, "day", js.Any.fromFunction0(value))
      
      inline def setDays(value: () => IDateElementEvaluator): Self = StObject.set(x, "days", js.Any.fromFunction0(value))
      
      inline def setHour(value: () => IDateElementEvaluator): Self = StObject.set(x, "hour", js.Any.fromFunction0(value))
      
      inline def setHours(value: () => IDateElementEvaluator): Self = StObject.set(x, "hours", js.Any.fromFunction0(value))
      
      inline def setMillisecond(value: () => IDateElementEvaluator): Self = StObject.set(x, "millisecond", js.Any.fromFunction0(value))
      
      inline def setMilliseconds(value: () => IDateElementEvaluator): Self = StObject.set(x, "milliseconds", js.Any.fromFunction0(value))
      
      inline def setMinute(value: () => IDateElementEvaluator): Self = StObject.set(x, "minute", js.Any.fromFunction0(value))
      
      inline def setMinutes(value: () => IDateElementEvaluator): Self = StObject.set(x, "minutes", js.Any.fromFunction0(value))
      
      inline def setMonth(value: () => IDateElementEvaluator): Self = StObject.set(x, "month", js.Any.fromFunction0(value))
      
      inline def setMonths(value: () => IDateElementEvaluator): Self = StObject.set(x, "months", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => IDateElementEvaluator): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setSeconds(value: () => IDateElementEvaluator): Self = StObject.set(x, "seconds", js.Any.fromFunction0(value))
      
      inline def setWeek(value: () => IDateElementEvaluator): Self = StObject.set(x, "week", js.Any.fromFunction0(value))
      
      inline def setWeeks(value: () => IDateElementEvaluator): Self = StObject.set(x, "weeks", js.Any.fromFunction0(value))
      
      inline def setYear(value: () => IDateElementEvaluator): Self = StObject.set(x, "year", js.Any.fromFunction0(value))
      
      inline def setYears(value: () => IDateElementEvaluator): Self = StObject.set(x, "years", js.Any.fromFunction0(value))
    }
  }
  
  trait IDateElementEvaluator extends StObject {
    
    def after(): Date
    
    def ago(): Date
    
    def before(): Date
    
    def fromNow(): Date
  }
  object IDateElementEvaluator {
    
    inline def apply(after: () => Date, ago: () => Date, before: () => Date, fromNow: () => Date): IDateElementEvaluator = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction0(after), ago = js.Any.fromFunction0(ago), before = js.Any.fromFunction0(before), fromNow = js.Any.fromFunction0(fromNow))
      __obj.asInstanceOf[IDateElementEvaluator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateElementEvaluator] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: () => Date): Self = StObject.set(x, "after", js.Any.fromFunction0(value))
      
      inline def setAgo(value: () => Date): Self = StObject.set(x, "ago", js.Any.fromFunction0(value))
      
      inline def setBefore(value: () => Date): Self = StObject.set(x, "before", js.Any.fromFunction0(value))
      
      inline def setFromNow(value: () => Date): Self = StObject.set(x, "fromNow", js.Any.fromFunction0(value))
    }
  }
  
  trait IDateLiteral
    extends StObject
       with ITimeLiteral {
    
    var day: Double
    
    var month: Double
    
    var week: Double
    
    var year: Double
  }
  object IDateLiteral {
    
    inline def apply(
      day: Double,
      hour: Double,
      millisecond: Double,
      minute: Double,
      month: Double,
      second: Double,
      week: Double,
      year: Double
    ): IDateLiteral = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateLiteral]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateLiteral] (val x: Self) extends AnyVal {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDatePartComparer extends StObject {
    
    def day(): Boolean = js.native
    def day(date: Date): Boolean = js.native
    
    def hour(): Boolean = js.native
    def hour(date: Date): Boolean = js.native
    
    def millisecond(): Boolean = js.native
    def millisecond(date: Date): Boolean = js.native
    
    def minute(): Boolean = js.native
    def minute(date: Date): Boolean = js.native
    
    def month(): Boolean = js.native
    def month(date: Date): Boolean = js.native
    
    def second(): Boolean = js.native
    def second(date: Date): Boolean = js.native
    
    def week(): Boolean = js.native
    def week(date: Date): Boolean = js.native
    
    def year(): Boolean = js.native
    def year(date: Date): Boolean = js.native
  }
  
  trait IOrientation
    extends StObject
       with IAddOrientation {
    
    def apr(): Date
    
    def april(): Date
    
    def aug(): Date
    
    def august(): Date
    
    def dec(): Date
    
    def december(): Date
    
    def feb(): Date
    
    def february(): Date
    
    def fri(): Date
    
    def friday(): Date
    
    def jan(): Date
    
    def january(): Date
    
    def jul(): Date
    
    def july(): Date
    
    // may
    def jun(): Date
    
    def june(): Date
    
    def mar(): Date
    
    def march(): Date
    
    def may(): Date
    
    def mon(): Date
    
    def monday(): Date
    
    def nov(): Date
    
    def november(): Date
    
    def oct(): Date
    
    def october(): Date
    
    def sat(): Date
    
    def saturday(): Date
    
    def sep(): Date
    
    def september(): Date
    
    def sun(): Date
    
    def sunday(): Date
    
    def thu(): Date
    
    def thursday(): Date
    
    def tue(): Date
    
    def tuesday(): Date
    
    def wed(): Date
    
    def wednesday(): Date
  }
  object IOrientation {
    
    inline def apply(
      apr: () => Date,
      april: () => Date,
      aug: () => Date,
      august: () => Date,
      day: () => Date,
      days: () => Date,
      dec: () => Date,
      december: () => Date,
      feb: () => Date,
      february: () => Date,
      fri: () => Date,
      friday: () => Date,
      hour: () => Date,
      hours: () => Date,
      jan: () => Date,
      january: () => Date,
      jul: () => Date,
      july: () => Date,
      jun: () => Date,
      june: () => Date,
      mar: () => Date,
      march: () => Date,
      may: () => Date,
      millisecond: () => Date,
      milliseconds: () => Date,
      minute: () => Date,
      minutes: () => Date,
      mon: () => Date,
      monday: () => Date,
      month: () => Date,
      months: () => Date,
      nov: () => Date,
      november: () => Date,
      oct: () => Date,
      october: () => Date,
      sat: () => Date,
      saturday: () => Date,
      second: () => Date,
      seconds: () => Date,
      sep: () => Date,
      september: () => Date,
      sun: () => Date,
      sunday: () => Date,
      thu: () => Date,
      thursday: () => Date,
      tue: () => Date,
      tuesday: () => Date,
      wed: () => Date,
      wednesday: () => Date,
      week: () => Date,
      weeks: () => Date,
      year: () => Date,
      years: () => Date
    ): IOrientation = {
      val __obj = js.Dynamic.literal(apr = js.Any.fromFunction0(apr), april = js.Any.fromFunction0(april), aug = js.Any.fromFunction0(aug), august = js.Any.fromFunction0(august), day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), dec = js.Any.fromFunction0(dec), december = js.Any.fromFunction0(december), feb = js.Any.fromFunction0(feb), february = js.Any.fromFunction0(february), fri = js.Any.fromFunction0(fri), friday = js.Any.fromFunction0(friday), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), jan = js.Any.fromFunction0(jan), january = js.Any.fromFunction0(january), jul = js.Any.fromFunction0(jul), july = js.Any.fromFunction0(july), jun = js.Any.fromFunction0(jun), june = js.Any.fromFunction0(june), mar = js.Any.fromFunction0(mar), march = js.Any.fromFunction0(march), may = js.Any.fromFunction0(may), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), mon = js.Any.fromFunction0(mon), monday = js.Any.fromFunction0(monday), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), nov = js.Any.fromFunction0(nov), november = js.Any.fromFunction0(november), oct = js.Any.fromFunction0(oct), october = js.Any.fromFunction0(october), sat = js.Any.fromFunction0(sat), saturday = js.Any.fromFunction0(saturday), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), sep = js.Any.fromFunction0(sep), september = js.Any.fromFunction0(september), sun = js.Any.fromFunction0(sun), sunday = js.Any.fromFunction0(sunday), thu = js.Any.fromFunction0(thu), thursday = js.Any.fromFunction0(thursday), tue = js.Any.fromFunction0(tue), tuesday = js.Any.fromFunction0(tuesday), wed = js.Any.fromFunction0(wed), wednesday = js.Any.fromFunction0(wednesday), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
      __obj.asInstanceOf[IOrientation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOrientation] (val x: Self) extends AnyVal {
      
      inline def setApr(value: () => Date): Self = StObject.set(x, "apr", js.Any.fromFunction0(value))
      
      inline def setApril(value: () => Date): Self = StObject.set(x, "april", js.Any.fromFunction0(value))
      
      inline def setAug(value: () => Date): Self = StObject.set(x, "aug", js.Any.fromFunction0(value))
      
      inline def setAugust(value: () => Date): Self = StObject.set(x, "august", js.Any.fromFunction0(value))
      
      inline def setDec(value: () => Date): Self = StObject.set(x, "dec", js.Any.fromFunction0(value))
      
      inline def setDecember(value: () => Date): Self = StObject.set(x, "december", js.Any.fromFunction0(value))
      
      inline def setFeb(value: () => Date): Self = StObject.set(x, "feb", js.Any.fromFunction0(value))
      
      inline def setFebruary(value: () => Date): Self = StObject.set(x, "february", js.Any.fromFunction0(value))
      
      inline def setFri(value: () => Date): Self = StObject.set(x, "fri", js.Any.fromFunction0(value))
      
      inline def setFriday(value: () => Date): Self = StObject.set(x, "friday", js.Any.fromFunction0(value))
      
      inline def setJan(value: () => Date): Self = StObject.set(x, "jan", js.Any.fromFunction0(value))
      
      inline def setJanuary(value: () => Date): Self = StObject.set(x, "january", js.Any.fromFunction0(value))
      
      inline def setJul(value: () => Date): Self = StObject.set(x, "jul", js.Any.fromFunction0(value))
      
      inline def setJuly(value: () => Date): Self = StObject.set(x, "july", js.Any.fromFunction0(value))
      
      inline def setJun(value: () => Date): Self = StObject.set(x, "jun", js.Any.fromFunction0(value))
      
      inline def setJune(value: () => Date): Self = StObject.set(x, "june", js.Any.fromFunction0(value))
      
      inline def setMar(value: () => Date): Self = StObject.set(x, "mar", js.Any.fromFunction0(value))
      
      inline def setMarch(value: () => Date): Self = StObject.set(x, "march", js.Any.fromFunction0(value))
      
      inline def setMay(value: () => Date): Self = StObject.set(x, "may", js.Any.fromFunction0(value))
      
      inline def setMon(value: () => Date): Self = StObject.set(x, "mon", js.Any.fromFunction0(value))
      
      inline def setMonday(value: () => Date): Self = StObject.set(x, "monday", js.Any.fromFunction0(value))
      
      inline def setNov(value: () => Date): Self = StObject.set(x, "nov", js.Any.fromFunction0(value))
      
      inline def setNovember(value: () => Date): Self = StObject.set(x, "november", js.Any.fromFunction0(value))
      
      inline def setOct(value: () => Date): Self = StObject.set(x, "oct", js.Any.fromFunction0(value))
      
      inline def setOctober(value: () => Date): Self = StObject.set(x, "october", js.Any.fromFunction0(value))
      
      inline def setSat(value: () => Date): Self = StObject.set(x, "sat", js.Any.fromFunction0(value))
      
      inline def setSaturday(value: () => Date): Self = StObject.set(x, "saturday", js.Any.fromFunction0(value))
      
      inline def setSep(value: () => Date): Self = StObject.set(x, "sep", js.Any.fromFunction0(value))
      
      inline def setSeptember(value: () => Date): Self = StObject.set(x, "september", js.Any.fromFunction0(value))
      
      inline def setSun(value: () => Date): Self = StObject.set(x, "sun", js.Any.fromFunction0(value))
      
      inline def setSunday(value: () => Date): Self = StObject.set(x, "sunday", js.Any.fromFunction0(value))
      
      inline def setThu(value: () => Date): Self = StObject.set(x, "thu", js.Any.fromFunction0(value))
      
      inline def setThursday(value: () => Date): Self = StObject.set(x, "thursday", js.Any.fromFunction0(value))
      
      inline def setTue(value: () => Date): Self = StObject.set(x, "tue", js.Any.fromFunction0(value))
      
      inline def setTuesday(value: () => Date): Self = StObject.set(x, "tuesday", js.Any.fromFunction0(value))
      
      inline def setWed(value: () => Date): Self = StObject.set(x, "wed", js.Any.fromFunction0(value))
      
      inline def setWednesday(value: () => Date): Self = StObject.set(x, "wednesday", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IPredicate extends StObject {
    
    def apr(): Boolean = js.native
    
    def april(): Boolean = js.native
    
    def aug(): Boolean = js.native
    
    def august(): Boolean = js.native
    
    def day(): Boolean = js.native
    def day(date: Date): Boolean = js.native
    
    def dec(): Boolean = js.native
    
    def december(): Boolean = js.native
    
    def feb(): Boolean = js.native
    
    def february(): Boolean = js.native
    
    def fri(): Boolean = js.native
    
    def friday(): Boolean = js.native
    
    def jan(): Boolean = js.native
    
    def january(): Boolean = js.native
    
    def jul(): Boolean = js.native
    
    def july(): Boolean = js.native
    
    def jun(): Boolean = js.native
    
    def june(): Boolean = js.native
    
    def mar(): Boolean = js.native
    
    def march(): Boolean = js.native
    
    def may(): Boolean = js.native
    
    def mon(): Boolean = js.native
    
    def monday(): Boolean = js.native
    
    def month(): Boolean = js.native
    def month(date: Date): Boolean = js.native
    
    def nov(): Boolean = js.native
    
    def november(): Boolean = js.native
    
    def oct(): Boolean = js.native
    
    def october(): Boolean = js.native
    
    def sat(): Boolean = js.native
    
    def saturday(): Boolean = js.native
    
    def sep(): Boolean = js.native
    
    def september(): Boolean = js.native
    
    def sun(): Boolean = js.native
    
    def sunday(): Boolean = js.native
    
    def thu(): Boolean = js.native
    
    def thursday(): Boolean = js.native
    
    def today(): Boolean = js.native
    
    def tue(): Boolean = js.native
    
    def tuesday(): Boolean = js.native
    
    def wed(): Boolean = js.native
    
    def wednesday(): Boolean = js.native
    
    def week(): Boolean = js.native
    def week(date: Date): Boolean = js.native
    
    def weekday(): Boolean = js.native
    
    def year(): Boolean = js.native
    def year(date: Date): Boolean = js.native
  }
  
  trait ITimeLiteral extends StObject {
    
    var hour: Double
    
    var millisecond: Double
    
    var minute: Double
    
    var second: Double
  }
  object ITimeLiteral {
    
    inline def apply(hour: Double, millisecond: Double, minute: Double, second: Double): ITimeLiteral = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeLiteral]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITimeLiteral] (val x: Self) extends AnyVal {
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    }
  }
}
