package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISeparatedIterationResult[OUT] extends StObject {
  
  var separators: js.Array[IToken]
  
  var values: js.Array[OUT]
}
object ISeparatedIterationResult {
  
  inline def apply[OUT](separators: js.Array[IToken], values: js.Array[OUT]): ISeparatedIterationResult[OUT] = {
    val __obj = js.Dynamic.literal(separators = separators.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeparatedIterationResult[OUT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISeparatedIterationResult[?], OUT] (val x: Self & ISeparatedIterationResult[OUT]) extends AnyVal {
    
    inline def setSeparators(value: js.Array[IToken]): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
    
    inline def setSeparatorsVarargs(value: IToken*): Self = StObject.set(x, "separators", js.Array(value*))
    
    inline def setValues(value: js.Array[OUT]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: OUT*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
