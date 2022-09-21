package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #############################################################################################
// Date formatting - https://github.com/zloirock/core-js/#date-formatting
// Modules: core.date
// #############################################################################################
trait Date extends StObject {
  
  /**
    * Non-standard.
    */
  var format: js.UndefOr[
    js.Function2[
      /* template */ java.lang.String, 
      /* locale */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  
  /**
    * Non-standard.
    */
  var formatUTC: js.UndefOr[
    js.Function2[
      /* template */ java.lang.String, 
      /* locale */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setFormat(
      value: (/* template */ java.lang.String, /* locale */ js.UndefOr[java.lang.String]) => java.lang.String
    ): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setFormatUTC(
      value: (/* template */ java.lang.String, /* locale */ js.UndefOr[java.lang.String]) => java.lang.String
    ): Self = StObject.set(x, "formatUTC", js.Any.fromFunction2(value))
    
    inline def setFormatUTCUndefined: Self = StObject.set(x, "formatUTC", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
