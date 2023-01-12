package typings.checCommerceJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPriceMod {
  
  trait Price extends StObject {
    
    var formatted: String
    
    var formatted_with_code: String
    
    var formatted_with_symbol: String
    
    var raw: Double
  }
  object Price {
    
    inline def apply(formatted: String, formatted_with_code: String, formatted_with_symbol: String, raw: Double): Price = {
      val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any], formatted_with_code = formatted_with_code.asInstanceOf[js.Any], formatted_with_symbol = formatted_with_symbol.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Price]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Price] (val x: Self) extends AnyVal {
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      inline def setFormatted_with_code(value: String): Self = StObject.set(x, "formatted_with_code", value.asInstanceOf[js.Any])
      
      inline def setFormatted_with_symbol(value: String): Self = StObject.set(x, "formatted_with_symbol", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Double): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
