package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorator_
  extends StObject
     with BaseNode
     with Node {
  
  var expression: Expression
  
  @JSName("type")
  var type_Decorator_ : Decorator
}
object Decorator_ {
  
  inline def apply(expression: Expression): Decorator_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[Decorator_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Decorator_] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: Decorator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
