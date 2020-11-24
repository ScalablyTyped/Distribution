package typings.babelTypes.ts36Mod

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
@JSImport("babel-types/ts3.6", "TSAsExpression")
@js.native
object TSAsExpression extends js.Object {
  
  def apply(expression: Expression, typeAnnotation: TSType): TSAsExpression = js.native
}
