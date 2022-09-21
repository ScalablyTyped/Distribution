package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Util extends StObject {
  
  def argsToArray(args: scala.Any): scala.Any
  
  def extend(destination: scala.Any, source: scala.Any): scala.Any
  
  def formatException(e: scala.Any): scala.Any
  
  def htmlEscape(str: String): String
  
  def inherit(childClass: js.Function, parentClass: js.Function): scala.Any
}
object Util {
  
  inline def apply(
    argsToArray: scala.Any => scala.Any,
    extend: (scala.Any, scala.Any) => scala.Any,
    formatException: scala.Any => scala.Any,
    htmlEscape: String => String,
    inherit: (js.Function, js.Function) => scala.Any
  ): Util = {
    val __obj = js.Dynamic.literal(argsToArray = js.Any.fromFunction1(argsToArray), extend = js.Any.fromFunction2(extend), formatException = js.Any.fromFunction1(formatException), htmlEscape = js.Any.fromFunction1(htmlEscape), inherit = js.Any.fromFunction2(inherit))
    __obj.asInstanceOf[Util]
  }
  
  extension [Self <: Util](x: Self) {
    
    inline def setArgsToArray(value: scala.Any => scala.Any): Self = StObject.set(x, "argsToArray", js.Any.fromFunction1(value))
    
    inline def setExtend(value: (scala.Any, scala.Any) => scala.Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    inline def setFormatException(value: scala.Any => scala.Any): Self = StObject.set(x, "formatException", js.Any.fromFunction1(value))
    
    inline def setHtmlEscape(value: String => String): Self = StObject.set(x, "htmlEscape", js.Any.fromFunction1(value))
    
    inline def setInherit(value: (js.Function, js.Function) => scala.Any): Self = StObject.set(x, "inherit", js.Any.fromFunction2(value))
  }
}
