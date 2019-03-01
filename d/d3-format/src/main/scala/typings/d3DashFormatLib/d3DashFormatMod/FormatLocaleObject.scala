package typings
package d3DashFormatLib.d3DashFormatMod

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
  def format(specifier: java.lang.String): js.Function1[/* n */ scala.Double | d3DashFormatLib.Anon_ValueOf, java.lang.String]
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
  def formatPrefix(specifier: java.lang.String, value: scala.Double): js.Function1[/* n */ scala.Double | d3DashFormatLib.Anon_ValueOf, java.lang.String]
}

object FormatLocaleObject {
  @scala.inline
  def apply(
    format: js.Function1[
      java.lang.String, 
      js.Function1[/* n */ scala.Double | d3DashFormatLib.Anon_ValueOf, java.lang.String]
    ],
    formatPrefix: js.Function2[
      java.lang.String, 
      scala.Double, 
      js.Function1[/* n */ scala.Double | d3DashFormatLib.Anon_ValueOf, java.lang.String]
    ]
  ): FormatLocaleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("formatPrefix")(formatPrefix)
    __obj.asInstanceOf[FormatLocaleObject]
  }
}

