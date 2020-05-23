package typings.d3Format.mod

import typings.d3Format.anon.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLocaleObject extends js.Object {
  /**
    * Returns a new format function for the given string specifier. The returned function
    * takes a number as the only argument, and returns a string representing the formatted number.
    *
    * @param specifier A Specifier string.
    * @throws Error on invalid format specifier.
    */
  def format(specifier: String): js.Function1[/* n */ Double | ValueOf, String]
  /**
    * Returns a new format function for the given string specifier. The returned function
    * takes a number as the only argument, and returns a string representing the formatted number.
    * The returned function will convert values to the units of the appropriate SI prefix for the
    * specified numeric reference value before formatting in fixed point notation.
    *
    * @param specifier A Specifier string.
    * @param value The reference value to determine the appropriate SI prefix.
    * @throws Error on invalid format specifier.
    */
  def formatPrefix(specifier: String, value: Double): js.Function1[/* n */ Double | ValueOf, String]
}

object FormatLocaleObject {
  @scala.inline
  def apply(
    format: String => js.Function1[/* n */ Double | ValueOf, String],
    formatPrefix: (String, Double) => js.Function1[/* n */ Double | ValueOf, String]
  ): FormatLocaleObject = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatPrefix = js.Any.fromFunction2(formatPrefix))
    __obj.asInstanceOf[FormatLocaleObject]
  }
}

