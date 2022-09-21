package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFinalizable
  extends StObject
     with IFinalizableToString {
  
  /** Get the resulting CAML query as SP.CamlQuery object */
  def ToCamlQuery(): Any
}
object IFinalizable {
  
  inline def apply(ToCamlQuery: () => Any, ToString: () => String): IFinalizable = {
    val __obj = js.Dynamic.literal(ToCamlQuery = js.Any.fromFunction0(ToCamlQuery), ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[IFinalizable]
  }
  
  extension [Self <: IFinalizable](x: Self) {
    
    inline def setToCamlQuery(value: () => Any): Self = StObject.set(x, "ToCamlQuery", js.Any.fromFunction0(value))
  }
}
