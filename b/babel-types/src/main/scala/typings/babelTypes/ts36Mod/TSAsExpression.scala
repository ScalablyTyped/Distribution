package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSAsExpression
  extends Node
     with Expression {
  
  var expression: Expression = js.native
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSAsExpression: typings.babelTypes.babelTypesStrings.TSAsExpression = js.native
}
object TSAsExpression {
  
  @JSImport("babel-types/ts3.6", "TSAsExpression")
  @js.native
  def apply(expression: Expression, typeAnnotation: TSType): TSAsExpression = js.native
  
  @scala.inline
  implicit class TSAsExpressionMutableBuilder[Self <: TSAsExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
