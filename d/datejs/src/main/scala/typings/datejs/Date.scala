package typings.datejs

import typings.datejs.sugarpak.IAddOrientation
import typings.datejs.sugarpak.IDateLiteral
import typings.datejs.sugarpak.IDatePartComparer
import typings.datejs.sugarpak.IOrientation
import typings.datejs.sugarpak.IPredicate
import typings.datejs.sugarpak.ITimeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DateJS Public Instance Methods */
@js.native
trait Date extends StObject {
  
  /** Adds(or subtracts) to the value of the year, month, day, hour, minute, second, millisecond of the date instance using given configuration object. Positive and Negative values allowed. */
  def add(): Date = js.native
  def add(config: IDateJSLiteral): Date = js.native
  def add(n: Double): IAddOrientation = js.native
  
  /** Adds the specified number of days to this instance.The number can be positive or negative. */
  def addDays(days: Double): Date = js.native
  
  /** Adds the specified number of hours to this instance given the number of hours to add.The number can be positive or negative. */
  def addHours(hours: Double): Date = js.native
  
  /** Adds the specified number of milliseconds to this instance. */
  def addMilliseconds(milliseconds: Double): Date = js.native
  
  /** Adds the specified number of minutes to this instance given the number of minutes to add.The number can be positive or negative. */
  def addMinutes(minutes: Double): Date = js.native
  
  /** Adds the specified number of months to this instance given the number of months to add.The number can be positive or negative. */
  def addMonths(months: Double): Date = js.native
  
  /** Adds the specified number of seconds to this instance given the number of seconds to add.The number can be positive or negative. */
  def addSeconds(seconds: Double): Date = js.native
  
  /** Adds the specified number of weeks to this instance given the number of weeks to add.The number can be positive or negative. */
  def addWeeks(weeks: Double): Date = js.native
  
  /** Adds the specified number of years to this instance given the number of years to add.The number can be positive or negative. */
  def addYears(years: Double): Date = js.native
  
  def at(time: String): Date = js.native
  def at(time: ITimeLiteral): Date = js.native
  
  /** Determines if this instance is between a range of two dates or equal to either the start or end dates. */
  def between(startDate: Date, endDate: Date): Boolean = js.native
  
  /** Resets the time of this Date object to 12:00 AM(00:00), which is the start of the day. */
  def clearTime(): Date = js.native
  
  /** Compares this instance to a Date object and returns an number indication of their relative values. -1 = this is lessthan date. 0 = values are equal. 1 = this is greaterthan date. */
  def compareTo(date: Date): Double = js.native
  
  /** Compares this instance to another Date object and returns true if they are equal, otherwise false. */
  def equals(date: Date): Boolean = js.native
  
  def fifth(): IOrientation = js.native
  
  def `final`(): IOrientation = js.native
  
  def first(): IOrientation = js.native
  
  def fourth(): IOrientation = js.native
  
  /** Returns the number of milliseconds between this date and date. */
  def getElapsed(date: Date): Double = js.native
  
  /** Get the ISO 8601 week number. Week one ("01") is the week which contains the first Thursday of the year. Monday is considered the first day of the week. */
  def getISOWeek(): String = js.native
  
  /** Get the Ordinal day (numeric day number) of the year, adjusted for leap year. Returns 1 through 365 (366 in leap years) */
  def getOrdinalNumber(): Double = js.native
  
  /** Get the timezone abbreviation of the current date. */
  def getTimezone(): String = js.native
  
  /** Get the offset from UTC of the current date. Returns the 4-character offset string prefixed with + or - (e.g. "-0500"). */
  def getUTCOffset(): String = js.native
  
  /** Get the week number. Week one (1) is the week which contains the first Thursday of the year. Monday is considered the first day of the week. */
  def getWeek(): Double = js.native
  
  /** Indicates whether Daylight Saving Time is observed in the current time zone. */
  def hasDaylightSavingTime(): Boolean = js.native
  
  def is(): IPredicate = js.native
  
  /** Determines if this date occurs after the date to compare to. */
  def isAfter(date: Date): Boolean = js.native
  
  /** Determines if this date occurs before the date to compare to. */
  def isBefore(date: Date): Boolean = js.native
  
  /** Indicates whether this Date instance is within the Daylight Saving Time range for the current time zone. */
  def isDaylightSavingTime(): Boolean = js.native
  
  /** Determines if the current Date instance occurs on the same Date as the supplied 'date'. */
  def isToday(date: Date): Boolean = js.native
  
  def last(): IOrientation = js.native
  
  /** Move to the next or previous dayOfWeek. Whether to move into the future (+1) or past(-1) is controlled by the optional direction parameter. */
  def moveToDayOfWeek(dayOfWeek: Double, direction: Double): Date = js.native
  
  /** Moves the date to the first day of the month. */
  def moveToFirstDayOfMonth(): Date = js.native
  
  /** Moves the date to the last day of the month. */
  def moveToLastDayOfMonth(): Date = js.native
  
  /** Move to the next or previous month.Whether to move into the future(+1) or past(-1) is controlled by the optional direction parameter. */
  def moveToMonth(month: Double, direction: Double): Date = js.native
  
  /** Moves the date to the next nth occurrence of the dayOfWeek starting from the beginning of the month. The number (-1) is a magic number and will return the last occurrence of the dayOfWeek in the month. */
  def moveToNthOccurrence(dayOfWeek: Double, occurrence: Double): Date = js.native
  
  def next(): IOrientation = js.native
  
  def prev(): IOrientation = js.native
  
  def previous(): IOrientation = js.native
  
  /**  Determines if two date objects occur on/in exactly the same instance of the subsequent date part function. Must be followed by a date part function (example: .day(), .month(), .year(), etc) */
  def same(): IDatePartComparer = js.native
  
  def second(): IOrientation = js.native
  
  /** Set the value of year, month, day, hour, minute, second, millisecond of date instance using given configuration object. */
  def set(config: IDateJSLiteral): Date = js.native
  
  /** Resets the time of this Date object to the current time('now'). */
  def setTimeToNow(): Date = js.native
  
  /** Set the timezone for the current date using a culture - specific timezone abbreviation("PST").Note that in most JavaScript implementations, this will appear to change the time since the timezone is always based on the locale. */
  def setTimezone(timezoneAbbreviation: String): Date = js.native
  
  /** Set the timezone for the current date using an offset(-0700).Note that in most JavaScript implementations, this will appear to change the time since the timezone is always based on the locale. */
  def setTimezoneOffset(timezoneOffset: Double): Date = js.native
  
  /** Moves the date to Monday of the week set. Week one (1) is the week which contains the first Thursday of the year. */
  def setWeek(week: Double): Date = js.native
  
  def third(): IOrientation = js.native
  
  /** Converts the current date instance into a string with an ISO 8601 format.The date is converted to it's UTC value. As per the ISO 8601 specification, the string will be wrapped with double quotation marks ("). */
  def toISOString(): String = js.native
  
  /** Returns a date literal from a DateJS instance */
  def toObject(): IDateLiteral = js.native
  
  def toString(format: String): String = js.native
}
