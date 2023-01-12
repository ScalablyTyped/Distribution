package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BSONSymbolExtended extends StObject {
  
  @JSName("$symbol")
  var $symbol: String
}
object BSONSymbolExtended {
  
  inline def apply($symbol: String): BSONSymbolExtended = {
    val __obj = js.Dynamic.literal($symbol = $symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSONSymbolExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BSONSymbolExtended] (val x: Self) extends AnyVal {
    
    inline def set$symbol(value: String): Self = StObject.set(x, "$symbol", value.asInstanceOf[js.Any])
  }
}
