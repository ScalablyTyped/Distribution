package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainBooleanParameters extends StObject {
  
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  
  var ideal: js.UndefOr[scala.Boolean] = js.undefined
}
object ConstrainBooleanParameters {
  
  inline def apply(): ConstrainBooleanParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainBooleanParameters]
  }
  
  extension [Self <: ConstrainBooleanParameters](x: Self) {
    
    inline def setExact(value: scala.Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setIdeal(value: scala.Boolean): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
