package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainDoubleRange
  extends StObject
     with DoubleRange {
  
  var exact: js.UndefOr[Double] = js.undefined
  
  var ideal: js.UndefOr[Double] = js.undefined
}
object ConstrainDoubleRange {
  
  inline def apply(): ConstrainDoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDoubleRange]
  }
  
  extension [Self <: ConstrainDoubleRange](x: Self) {
    
    inline def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setIdeal(value: Double): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
