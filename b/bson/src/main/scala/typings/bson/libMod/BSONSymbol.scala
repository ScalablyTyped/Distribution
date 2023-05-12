package typings.bson.libMod

import typings.bson.libSymbolMod.BSONSymbolExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "BSONSymbol")
@js.native
open class BSONSymbol protected ()
  extends typings.bson.libBsonMod.BSONSymbol {
  /**
    * @param value - the string representing the symbol.
    */
  def this(value: String) = this()
}
/* static members */
object BSONSymbol {
  
  @JSImport("bson/lib", "BSONSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromExtendedJSON(doc: BSONSymbolExtended): typings.bson.libSymbolMod.BSONSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libSymbolMod.BSONSymbol]
}
