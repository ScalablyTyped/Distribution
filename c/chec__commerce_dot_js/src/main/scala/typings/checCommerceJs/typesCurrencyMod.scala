package typings.checCommerceJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCurrencyMod {
  
  trait Currency extends StObject {
    
    var code: String
    
    var symbol: String
  }
  object Currency {
    
    inline def apply(code: String, symbol: String): Currency = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    extension [Self <: Currency](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
}
