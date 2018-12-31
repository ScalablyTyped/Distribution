package typings
package dateDotFormatDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accepts a date, a mask, or a date and a mask.
  * Returns a formatted version of the given date.
  * The date defaults to the current date/time.
  * The mask defaults to dateFormat.masks.default.
  * @param {Date=} date
  * @param {string=} mask
  * @param {boolean=} utc
  */
@JSGlobal("dateFormat")
@js.native
object dateFormat extends js.Object {
  var i18n: dateDotFormatDotJsLib.DateFormatI18n = js.native
  var masks: dateDotFormatDotJsLib.DateFormatMasks = js.native
  def apply(): java.lang.String = js.native
  def apply(date: js.Any): java.lang.String = js.native
  def apply(date: js.Any, mask: java.lang.String): java.lang.String = js.native
  def apply(date: js.Any, mask: java.lang.String, utc: scala.Boolean): java.lang.String = js.native
}

