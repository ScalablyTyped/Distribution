package typings.cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolConstructor extends StObject {
  
  /**
    * A String value that is used in the creation of the default string description of an object.
    * Called by the built-in method Object.prototype.toString.
    */
  val toStringTag: js.Symbol
}
object SymbolConstructor {
  
  inline def apply(toStringTag: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(toStringTag = toStringTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolConstructor]
  }
  
  extension [Self <: SymbolConstructor](x: Self) {
    
    inline def setToStringTag(value: js.Symbol): Self = StObject.set(x, "toStringTag", value.asInstanceOf[js.Any])
  }
}
