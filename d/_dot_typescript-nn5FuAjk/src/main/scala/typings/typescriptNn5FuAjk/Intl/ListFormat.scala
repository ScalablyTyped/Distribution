package typings.typescriptNn5FuAjk.Intl

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.Iterable
import typings.typescriptNn5FuAjk.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFormat extends StObject {
  
  /**
    * Returns a string with a language-specific representation of the list.
    *
    * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
    *
    * @throws `TypeError` if `list` includes something other than the possible values.
    *
    * @returns {string} A language-specific formatted string representing the elements of the list.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/format).
    */
  def format(list: Iterable[String]): String
  
  /**
    * Returns an Array of objects representing the different components that can be used to format a list of values in a locale-aware fashion.
    *
    * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array), to be formatted according to a locale.
    *
    * @throws `TypeError` if `list` includes something other than the possible values.
    *
    * @returns {{ type: "element" | "literal", value: string; }[]} An Array of components which contains the formatted parts from the list.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/formatToParts).
    */
  def formatToParts(list: Iterable[String]): Array[Type]
}
object ListFormat {
  
  inline def apply(format: Iterable[String] => String, formatToParts: Iterable[String] => Array[Type]): ListFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts))
    __obj.asInstanceOf[ListFormat]
  }
  
  extension [Self <: ListFormat](x: Self) {
    
    inline def setFormat(value: Iterable[String] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatToParts(value: Iterable[String] => Array[Type]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction1(value))
  }
}
