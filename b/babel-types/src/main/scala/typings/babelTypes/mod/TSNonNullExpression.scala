package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNonNullExpression
  extends StObject
     with Node
     with Expression {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSNonNullExpression: typings.babelTypes.babelTypesStrings.TSNonNullExpression
}
object TSNonNullExpression {
  
  @JSImport("babel-types", "TSNonNullExpression")
  @js.native
  def apply(expression: Expression): TSNonNullExpression = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNonNullExpression] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
