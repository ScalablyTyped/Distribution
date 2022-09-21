package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logarithmic extends StObject {
  
  /**
    * Formatter for logarithmic ticks
    * @param tickValue the value to be formatted
    * @param index the position of the tickValue parameter in the ticks array
    * @param ticks the list of ticks being converted
    * @return string representation of the tickValue parameter
    */
  def logarithmic(tickValue: Double, index: Double, ticks: js.Array[Value]): String
  
  /**
    * Formatter for numeric ticks
    * @param tickValue the value to be formatted
    * @param index the position of the tickValue parameter in the ticks array
    * @param ticks the list of ticks being converted
    * @return string representation of the tickValue parameter
    */
  def numeric(tickValue: Double, index: Double, ticks: js.Array[Value]): String
  
  /**
    * Formatter for value labels
    * @param value the value to display
    * @return {string|string[]} the label to display
    */
  def values(value: Any): String | js.Array[String]
}
object Logarithmic {
  
  inline def apply(
    logarithmic: (Double, Double, js.Array[Value]) => String,
    numeric: (Double, Double, js.Array[Value]) => String,
    values: Any => String | js.Array[String]
  ): Logarithmic = {
    val __obj = js.Dynamic.literal(logarithmic = js.Any.fromFunction3(logarithmic), numeric = js.Any.fromFunction3(numeric), values = js.Any.fromFunction1(values))
    __obj.asInstanceOf[Logarithmic]
  }
  
  extension [Self <: Logarithmic](x: Self) {
    
    inline def setLogarithmic(value: (Double, Double, js.Array[Value]) => String): Self = StObject.set(x, "logarithmic", js.Any.fromFunction3(value))
    
    inline def setNumeric(value: (Double, Double, js.Array[Value]) => String): Self = StObject.set(x, "numeric", js.Any.fromFunction3(value))
    
    inline def setValues(value: Any => String | js.Array[String]): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
  }
}
