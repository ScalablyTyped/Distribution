package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchStatement_
  extends StObject
     with BaseNode {
  
  var cases: js.Array[SwitchCase_]
  
  var discriminant: Expression
  
  @JSName("type")
  var type_SwitchStatement_ : "SwitchStatement"
}
object SwitchStatement_ {
  
  inline def apply(cases: js.Array[SwitchCase_], discriminant: Expression): SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[SwitchStatement_]
  }
  
  extension [Self <: SwitchStatement_](x: Self) {
    
    inline def setCases(value: js.Array[SwitchCase_]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: SwitchCase_ *): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setDiscriminant(value: Expression): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    inline def setType(value: "SwitchStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
