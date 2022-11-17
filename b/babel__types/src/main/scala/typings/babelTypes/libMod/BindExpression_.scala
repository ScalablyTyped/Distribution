package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindExpression_
  extends StObject
     with BaseNode {
  
  var callee: Expression
  
  var `object`: Expression
  
  @JSName("type")
  var type_BindExpression_ : "BindExpression"
}
object BindExpression_ {
  
  inline def apply(callee: Expression, `object`: Expression): BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[BindExpression_]
  }
  
  extension [Self <: BindExpression_](x: Self) {
    
    inline def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: "BindExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
