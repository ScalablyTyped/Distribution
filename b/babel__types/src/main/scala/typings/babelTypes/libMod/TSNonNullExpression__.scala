package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSNonNullExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNonNullExpression__
  extends StObject
     with BaseNode
     with Expression
     with LVal
     with Node
     with PatternLike
     with TypeScript {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSNonNullExpression__ : TSNonNullExpression
}
object TSNonNullExpression__ {
  
  inline def apply(expression: Expression): TSNonNullExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[TSNonNullExpression__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNonNullExpression__] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
