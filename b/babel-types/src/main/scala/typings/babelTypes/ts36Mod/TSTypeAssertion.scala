package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAssertion
  extends Node
     with Expression {
  
  var expression: Expression = js.native
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeAssertion: typings.babelTypes.babelTypesStrings.TSTypeAssertion = js.native
}
object TSTypeAssertion {
  
  @JSImport("babel-types/ts3.6", "TSTypeAssertion")
  @js.native
  def apply(typeAnnotation: TSType, expression: Expression): TSTypeAssertion = js.native
  
  @scala.inline
  implicit class TSTypeAssertionMutableBuilder[Self <: TSTypeAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeAssertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
