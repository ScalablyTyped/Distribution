package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFinalizable extends IFinalizableToString {
  
  /** Get the resulting CAML query as SP.CamlQuery object */
  def ToCamlQuery(): js.Any = js.native
}
object IFinalizable {
  
  @scala.inline
  def apply(ToCamlQuery: () => js.Any, ToString: () => String): IFinalizable = {
    val __obj = js.Dynamic.literal(ToCamlQuery = js.Any.fromFunction0(ToCamlQuery), ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[IFinalizable]
  }
  
  @scala.inline
  implicit class IFinalizableMutableBuilder[Self <: IFinalizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToCamlQuery(value: () => js.Any): Self = StObject.set(x, "ToCamlQuery", js.Any.fromFunction0(value))
  }
}
