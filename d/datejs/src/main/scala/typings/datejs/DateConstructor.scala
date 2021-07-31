package typings.datejs

import typings.datejs.sugarpak.IDateLiteral
import typings.datejs.sugarpak.IOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DateJS Public Static Methods */
@js.native
trait DateConstructor extends StObject {
  
  /** Contains the day-of-week value for Friday */
  var FRIDAY: Double = js.native
  
  /** Contains the day-of-week value for Monday */
  var MONDAY: Double = js.native
  
  /** Contains the day-of-week value for Saturday */
  var SATURDAY: Double = js.native
  
  /** Contains the day-of-week value for Sunday */
  var SUNDAY: Double = js.native
  
  /** Contains the day-of-week value for Thursday */
  var THURSDAY: Double = js.native
  
  /** Contains the day-of-week value for Tuesday */
  var TUESDAY: Double = js.native
  
  /** Contains the day-of-week value for Wednesday */
  var WEDNESDAY: Double = js.native
  
  def apr(): Date = js.native
  
  def april(): Date = js.native
  
  def aug(): Date = js.native
  
  def august(): Date = js.native
  
  /** Compares the first date to the second date and returns an number indication of their relative values. -1 = this is lessthan date. 0 = values are equal. 1 = this is greaterthan date. */
  def compare(date1: Date, date2: Date): Double = js.native
  
  def dec(): Date = js.native
  
  def december(): Date = js.native
  
  /** Compares the first Date object to the second Date object and returns true if they are equal. */
  def equals(date1: Date): Boolean = js.native
  def equals(date1: Date, date2: Date): Boolean = js.native
  
  def feb(): Date = js.native
  
  def february(): Date = js.native
  
  def fri(): Date = js.native
  
  def friday(): Date = js.native
  
  /** Instantiates a DateJS object from a literal */
  def fromObject(date: IDateLiteral): Date = js.native
  
  /** Gets the day number (0-6) if given a culture-specific string which is a valid full or abbreviated day name. */
  def getDayNumberFromName(dayName: String): Double = js.native
  
  /** Gets the number of days in the month, given a year and month value. Automatically corrects for leap year. */
  def getDaysInMonth(year: Double, month: Double): Double = js.native
  
  /** Gets the month number (0-11) if given a culture-specific string which is a valid full or abbreviated month name. */
  def getMonthNumberFromName(monthName: String): Double = js.native
  
  /** Returns a culture-specific timezone abbreviation based on a given offset and a boolean indicating whether daylight savings time is in effect. */
  def getTimezoneAbbreviation(timezoneOffset: Double, isDayLightSavingsTime: Boolean): String = js.native
  
  /** Gets the timezone offset if given a culture-specific string which is a valid full or abbreviated timezone name and a boolean indicating whether daylight savings time is in effect. */
  def getTimezoneOffset(): Double = js.native
  def getTimezoneOffset(timezoneAbbreviation: String): Double = js.native
  def getTimezoneOffset(timezoneAbbreviation: String, isDayLightSavingsTime: Boolean): Double = js.native
  def getTimezoneOffset(timezoneAbbreviation: Unit, isDayLightSavingsTime: Boolean): Double = js.native
  
  /** Returns true if the given year is a leap year, false otherwise. */
  def isLeapYear(year: Double): Boolean = js.native
  
  def jan(): Date = js.native
  
  def january(): Date = js.native
  
  def jul(): Date = js.native
  
  def july(): Date = js.native
  
  // may
  def jun(): Date = js.native
  
  def june(): Date = js.native
  
  def last(): IOrientation = js.native
  
  def mar(): Date = js.native
  
  def march(): Date = js.native
  
  def may(): Date = js.native
  
  def mon(): Date = js.native
  
  def monday(): Date = js.native
  
  def next(): IOrientation = js.native
  
  def nov(): Date = js.native
  
  def november(): Date = js.native
  
  def oct(): Date = js.native
  
  def october(): Date = js.native
  
  /** Converts the specified string value into its JavaScript Date equivalent using culture-specific format information. */
  def parse(dateString: String): Date = js.native
  
  /** Converts the specified string value into its JavaScript Date equivalent using the specified formats (array). The format of the string value must match one of the supplied formats exactly. */
  def parseExact(dateString: String, formatArray: js.Array[String]): Date = js.native
  /** Converts the specified string value into its JavaScript Date equivalent using the specified format. The format of the string value must match one of the supplied formats exactly. */
  def parseExact(dateString: String, formatString: String): Date = js.native
  
  def prev(): IOrientation = js.native
  
  def previous(): IOrientation = js.native
  
  def sat(): Date = js.native
  
  def saturday(): Date = js.native
  
  def sep(): Date = js.native
  
  def september(): Date = js.native
  
  def sun(): Date = js.native
  
  def sunday(): Date = js.native
  
  def thu(): Date = js.native
  
  def thursday(): Date = js.native
  
  /** Gets a date that is set to the current date. The time is set to the start of the day (00:00 or 12:00 AM) */
  def today(): Date = js.native
  
  def tue(): Date = js.native
  
  def tuesday(): Date = js.native
  
  /** Validates the number is within an acceptable range for the days in a month [0-MaxDaysInMonth]. */
  def validateDay(day: Double, fullYear: Double, monthNumber: Double): Boolean = js.native
  
  /** Validates the number is within an acceptable range for hours[0 - 23].Returns true if within range, otherwise false. */
  def validateHour(hour: Double): Boolean = js.native
  
  /** Validates the number is within an acceptable range for milliseconds[0 - 999].Returns true if within range, otherwise false. */
  def validateMillisecond(milliseconds: Double): Boolean = js.native
  
  /** Validates the number is within an acceptable range for minutes[0 - 59].Returns true if within range, otherwise false. */
  def validateMinute(minutes: Double): Boolean = js.native
  
  /** Validates the number is within an acceptable range for months[0 - 11]. */
  def validateMonth(month: Double): Boolean = js.native
  
  /** Validates the number is within an acceptable range for seconds[0 - 59].Returns true if within range, otherwise false. */
  def validateSecond(second: Double): Boolean = js.native
  
  /** Validates the number is within an acceptable range for years[0 - 9999]. */
  def validateYear(year: Double): Boolean = js.native
  
  def wed(): Date = js.native
  
  def wednesday(): Date = js.native
}
