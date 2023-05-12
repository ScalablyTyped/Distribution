package typings.bson

import typings.bson.libBsonValueMod.BSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSymbolMod {
  
  @JSImport("bson/lib/symbol", "BSONSymbol")
  @js.native
  open class BSONSymbol protected () extends BSONValue {
    /**
      * @param value - the string representing the symbol.
      */
    def this(value: String) = this()
    
    def toJSON(): String = js.native
    
    var value: String = js.native
  }
  /* static members */
  object BSONSymbol {
    
    @JSImport("bson/lib/symbol", "BSONSymbol")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: BSONSymbolExtended): BSONSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[BSONSymbol]
  }
  
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
}
