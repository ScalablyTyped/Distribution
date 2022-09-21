package typings.chartJs.anon

import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  /**
    * The Intl.NumberFormat options used by the default label formatter
    */
  var format: NumberFormatOptions
}
object Format {
  
  inline def apply(format: NumberFormatOptions): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: NumberFormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
