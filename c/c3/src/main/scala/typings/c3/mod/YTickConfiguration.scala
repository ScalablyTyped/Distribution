package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YTickConfiguration
  extends StObject
     with TickConfiguration {
  
  /**
    * A function to format y-axis tick values.
    */
  var format: js.UndefOr[js.Function1[/* x */ Double, String | Double]] = js.undefined
}
object YTickConfiguration {
  
  inline def apply(): YTickConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YTickConfiguration]
  }
  
  extension [Self <: YTickConfiguration](x: Self) {
    
    inline def setFormat(value: /* x */ Double => String | Double): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
