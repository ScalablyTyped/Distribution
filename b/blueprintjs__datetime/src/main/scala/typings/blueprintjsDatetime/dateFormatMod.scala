package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFormatMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateFormat", "getFormattedDateString")
  @js.native
  def getFormattedDateString(date: Null, props: IDateFormatProps with IDatePickerBaseProps): String = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/dateFormat", "getFormattedDateString")
  @js.native
  def getFormattedDateString(date: Null, props: IDateFormatProps with IDatePickerBaseProps, ignoreRange: Boolean): String = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/dateFormat", "getFormattedDateString")
  @js.native
  def getFormattedDateString(date: Date, props: IDateFormatProps with IDatePickerBaseProps): String = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/dateFormat", "getFormattedDateString")
  @js.native
  def getFormattedDateString(date: Date, props: IDateFormatProps with IDatePickerBaseProps, ignoreRange: Boolean): String = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/dateFormat", "getFormattedDateString")
  @js.native
  def getFormattedDateString_false(date: `false`, props: IDateFormatProps with IDatePickerBaseProps): String = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/dateFormat", "getFormattedDateString")
  @js.native
  def getFormattedDateString_false(date: `false`, props: IDateFormatProps with IDatePickerBaseProps, ignoreRange: Boolean): String = js.native
  
  @js.native
  trait IDateFormatProps extends StObject {
    
    /**
      * Function to render a JavaScript `Date` to a string.
      * Optional `locale` argument comes directly from the prop on this component:
      * if the prop is defined, then the argument will be too.
      */
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, locale: String): String = js.native
    
    /**
      * The error message to display when the date selected is invalid.
      * @default "Invalid date"
      */
    var invalidDateMessage: js.UndefOr[String] = js.native
    
    /**
      * The locale name, which is passed to `formatDate`, `parseDate`, and the functions in `localeUtils`.
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * The error message to display when the date selected is out of range.
      * @default "Out of range"
      */
    var outOfRangeMessage: js.UndefOr[String] = js.native
    
    /**
      * Function to deserialize user input text to a JavaScript `Date` object.
      * Return `false` if the string is an invalid date.
      * Return `null` to represent the absence of a date.
      * Optional `locale` argument comes directly from the prop on this component.
      */
    def parseDate(str: String): Date | `false` | Null = js.native
    def parseDate(str: String, locale: String): Date | `false` | Null = js.native
    
    /**
      * Placeholder text to display in empty input fields.
      * Recommended practice is to indicate the expected date format.
      */
    var placeholder: js.UndefOr[String] = js.native
  }
}
