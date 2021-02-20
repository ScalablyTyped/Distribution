package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNonNullExpression
  extends Node
     with Expression {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_TSNonNullExpression: typings.babelTypes.babelTypesStrings.TSNonNullExpression = js.native
}
object TSNonNullExpression {
  
  @JSImport("babel-types/ts3.6", "TSNonNullExpression")
  @js.native
  def apply(expression: Expression): TSNonNullExpression = js.native
  
  @scala.inline
  implicit class TSNonNullExpressionMutableBuilder[Self <: TSNonNullExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
