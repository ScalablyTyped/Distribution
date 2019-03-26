package typings
package atBlueprintjsDatetimeLib.libEsmDateFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateFormatProps extends js.Object {
  /**
    * The error message to display when the date selected is invalid.
    * @default "Invalid date"
    */
  var invalidDateMessage: js.UndefOr[java.lang.String] = js.native
  /**
    * The locale name, which is passed to `formatDate`, `parseDate` and the functions in `localeUtils`.
    */
  var locale: js.UndefOr[java.lang.String] = js.native
  /**
    * The error message to display when the date selected is out of range.
    * @default "Out of range"
    */
  var outOfRangeMessage: js.UndefOr[java.lang.String] = js.native
  /**
    * Placeholder text to display in empty input fields.
    * Recommended practice is to indicate the expected date format.
    */
  var placeholder: js.UndefOr[java.lang.String] = js.native
  /**
    * Function to render a JavaScript `Date` to a string.
    * Optional `locale` argument comes directly from the prop on this component:
    * if the prop is defined, then the argument will be too.
    */
  def formatDate(date: stdLib.Date): java.lang.String = js.native
  def formatDate(date: stdLib.Date, locale: java.lang.String): java.lang.String = js.native
  /**
    * Function to deserialize user input text to a JavaScript `Date` object.
    * Return `false` if the string is an invalid date.
    * Return `null` to represent the absence of a date.
    * Optional `locale` argument comes directly from the prop on this component.
    */
  def parseDate(str: java.lang.String): stdLib.Date | atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibNumbers.`false` | scala.Null = js.native
  def parseDate(str: java.lang.String, locale: java.lang.String): stdLib.Date | atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibNumbers.`false` | scala.Null = js.native
}

