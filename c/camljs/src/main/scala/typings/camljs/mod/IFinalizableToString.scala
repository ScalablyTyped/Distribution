package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFinalizableToString extends StObject {
  
  /** Get the resulting CAML query as string */
  def ToString(): String
}
object IFinalizableToString {
  
  inline def apply(ToString: () => String): IFinalizableToString = {
    val __obj = js.Dynamic.literal(ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[IFinalizableToString]
  }
  
  extension [Self <: IFinalizableToString](x: Self) {
    
    inline def setToString(value: () => String): Self = StObject.set(x, "ToString", js.Any.fromFunction0(value))
  }
}
