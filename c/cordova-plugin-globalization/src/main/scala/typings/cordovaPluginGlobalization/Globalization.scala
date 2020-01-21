package typings.cordovaPluginGlobalization

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This plugin obtains information and performs operations specific to the user's locale and timezone. */
@js.native
trait Globalization extends js.Object {
  /**
    * Returns a date formatted as a string according to the client's locale and timezone.
    * @param date      Date to format.
    * @param onSuccess Called on success with a properties object,
    *                  that should have a value property with a String value.
    * @param onError   Called on error with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.FORMATTING_ERROR.
    * @param options   Optional format parameters. Default {formatLength:'short', selector:'date and time'}
    *                      - 'formatLength' can be "short", "medium", "long", or "full".
    *                      - 'selector' can be "date", "time", or "date and time".
    */
  def dateToString(
    date: Date,
    onSuccess: js.Function1[/* date */ AnonValue, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def dateToString(
    date: Date,
    onSuccess: js.Function1[/* date */ AnonValue, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit],
    options: AnonFormatLength
  ): Unit = js.native
  /**
    * Returns a pattern string to format and parse currency values according to the client's user preferences and ISO 4217 currency code.
    * @param currencyCode Should be a String of one of the ISO 4217 currency codes, for example 'USD'.
    * @param onSuccess     Called on success getting pattern with a GlobalizatioCurrencyPattern object
    * @param onError       Called on error getting pattern with a GlobalizationError object.
    *                      The error's expected code is GlobalizationError.FORMATTING_ERROR.
    * @param options       Optional format parameters. Default {type:'decimal'}.
    */
  def getCurrencyPattern(
    currencyCode: String,
    onSuccess: js.Function1[/* result */ GlobalizationCurrencyPattern, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  /**
    * Returns an array of the names of the months or days of the week, depending on the client's user preferences and calendar.
    * @param onSuccess Called on success getting names with a properties object,
    *                  that should have a value property with a String[] value.
    * @param onError   Called on error getting the language with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.UNKNOWN_ERROR.
    * @param options   Optional parameters. Default: {type:'wide', item:'months'}
    */
  def getDateNames(
    onSuccess: js.Function1[/* names */ AnonValueArray, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def getDateNames(
    onSuccess: js.Function1[/* names */ AnonValueArray, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit],
    options: AnonItem
  ): Unit = js.native
  /**
    * Returns a pattern string to format and parse dates according to the client's user preferences.
    * @param onSuccess Called on success getting pattern with a GlobalizationDatePattern object
    * @param onError   Called on error getting pattern with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.PATTERN_ERROR.
    * @param options   Optional format parameters. Default {formatLength:'short', selector:'date and time'}
    */
  def getDatePattern(
    onSuccess: js.Function1[/* datePattern */ GlobalizationDatePattern, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def getDatePattern(
    onSuccess: js.Function1[/* datePattern */ GlobalizationDatePattern, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit],
    options: AnonItem
  ): Unit = js.native
  /**
    * Returns the first day of the week according to the client's user preferences and calendar.
    * @param onSuccess Called on success with a day object,
    *                  that should have a value property with a number value.
    * @param onError   Called on error with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.UNKNOWN_ERROR.
    */
  def getFirstDayOfWeek(
    onSuccess: js.Function1[/* day */ AnonValueNumber, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  /**
    * Get the string identifier for the client's current locale setting.
    * @param onSuccess Called on success getting the locale identifier with a properties object,
    *                  that should have a value property with a String value.
    * @param onError   Called on error getting the locale identifier with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.UNKNOWN\_ERROR.
    */
  def getLocaleName(
    onSuccess: js.Function1[/* locale */ AnonValue, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  /**
    * Returns a pattern string to format and parse numbers according to the client's user preferences.
    * @param onSuccess Called on success getting pattern with a GlobalizationNumberPattern object
    * @param onError   Called on error getting the language with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.PATTERN_ERROR.
    * @param options   Optional format parameters. Default {type:'decimal'}.
    */
  def getNumberPattern(
    onSuccess: js.Function1[/* result */ GlobalizationNumberPattern, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def getNumberPattern(
    onSuccess: js.Function1[/* result */ GlobalizationNumberPattern, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit],
    format: AnonType
  ): Unit = js.native
  /**
    * Get the string identifier for the client's current language.
    * @param onSuccess Called on success getting the language with a properties object,
    *                  that should have a value property with a String value.
    * @param onError   Called on error getting the language with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.UNKNOWN_ERROR.
    */
  def getPreferredLanguage(
    onSuccess: js.Function1[/* language */ AnonValue, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  /**
    * Indicates whether daylight savings time is in effect for a given date using the client's time zone and calendar.
    * @param {Date}                   date Date to check
    * @param onSuccess Called on success with a properties object,
    *                  that should have a dst property with a boolean value.
    * @param onError   Called on error with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.UNKNOWN_ERROR.
    */
  def isDaylightSavingsTime(
    date: Date,
    onSuccess: js.Function1[/* result */ AnonDst, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  /**
    * Returns a number formatted as a string according to the client's user preferences.
    * @param value     Number to format
    * @param onSuccess Called on success with a result object,
    *                  that should have a value property with a String value.
    * @param onError   Called on error with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.FORMATTING_ERROR.
    * @param format    Optional format parameters. Default: {type:'decimal'}
    */
  def nubmerToString(
    value: Double,
    onSuccess: js.Function1[/* result */ AnonValue, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def nubmerToString(
    value: Double,
    onSuccess: js.Function1[/* result */ AnonValue, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit],
    format: AnonType
  ): Unit = js.native
  /**
    * Parses a date formatted as a string, according to the client's user preferences
    * and calendar using the time zone of the client, and returns the corresponding date object.
    * @param dateString  String to parse
    * @param onSuccess   Called on success with GlobalizationDate object
    * @param onError     Called on error getting the language with a GlobalizationError object.
    *                    The error's expected code is GlobalizationError.PARSING_ERROR.
    * @param options     Optional parse parameters. Default {formatLength:'short', selector:'date and time'}
    */
  def stringToDate(
    dateString: String,
    onSuccess: js.Function1[/* date */ GlobalizationDate, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def stringToDate(
    dateString: String,
    onSuccess: js.Function1[/* date */ GlobalizationDate, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit],
    options: AnonItem
  ): Unit = js.native
  /**
    * Parses a number formatted as a string according to the client's user preferences and returns the corresponding number.
    * @param value     String to parse
    * @param onSuccess Called on success with a result object,
    *                  that should have a value property with a number value.
    * @param onError   Called on error with a GlobalizationError object.
    *                  The error's expected code is GlobalizationError.FORMATTING_ERROR.
    * @param format    Optional format parameters. Default: {type:'decimal'}
    */
  def stringToNumber(
    value: String,
    onSuccess: js.Function1[/* result */ AnonValueNumber, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def stringToNumber(
    value: String,
    onSuccess: js.Function1[/* result */ AnonValueNumber, Unit],
    onError: js.Function1[/* error */ GlobalizationError, Unit],
    format: AnonType
  ): Unit = js.native
}

