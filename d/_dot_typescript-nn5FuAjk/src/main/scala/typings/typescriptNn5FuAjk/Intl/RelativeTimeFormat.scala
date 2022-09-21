package typings.typescriptNn5FuAjk.Intl

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeTimeFormat extends StObject {
  
  /**
    * Formats a value and a unit according to the locale
    * and formatting options of the given
    * [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
    * object.
    *
    * While this method automatically provides the correct plural forms,
    * the grammatical form is otherwise as neutral as possible.
    *
    * It is the caller's responsibility to handle cut-off logic
    * such as deciding between displaying "in 7 days" or "in 1 week".
    * This API does not support relative dates involving compound units.
    * e.g "in 5 days and 4 hours".
    *
    * @param value -  Numeric value to use in the internationalized relative time message
    *
    * @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
    *
    * @throws `RangeError` if `unit` was given something other than `unit` possible values
    *
    * @returns {string} Internationalized relative time message as string
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/format).
    */
  def format(value: Double, unit: RelativeTimeFormatUnit): String
  
  /**
    *  Returns an array of objects representing the relative time format in parts that can be used for custom locale-aware formatting.
    *
    *  @param value - Numeric value to use in the internationalized relative time message
    *
    *  @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
    *
    *  @throws `RangeError` if `unit` was given something other than `unit` possible values
    *
    *  [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts).
    */
  def formatToParts(value: Double, unit: RelativeTimeFormatUnit): Array[RelativeTimeFormatPart]
  
  /**
    * Provides access to the locale and options computed during initialization of this `Intl.RelativeTimeFormat` object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/resolvedOptions).
    */
  def resolvedOptions(): ResolvedRelativeTimeFormatOptions
}
object RelativeTimeFormat {
  
  inline def apply(
    format: (Double, RelativeTimeFormatUnit) => String,
    formatToParts: (Double, RelativeTimeFormatUnit) => Array[RelativeTimeFormatPart],
    resolvedOptions: () => ResolvedRelativeTimeFormatOptions
  ): RelativeTimeFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatToParts = js.Any.fromFunction2(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[RelativeTimeFormat]
  }
  
  extension [Self <: RelativeTimeFormat](x: Self) {
    
    inline def setFormat(value: (Double, RelativeTimeFormatUnit) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setFormatToParts(value: (Double, RelativeTimeFormatUnit) => Array[RelativeTimeFormatPart]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction2(value))
    
    inline def setResolvedOptions(value: () => ResolvedRelativeTimeFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
  }
}
