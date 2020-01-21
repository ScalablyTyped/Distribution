package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSAsExpression
  extends Node
     with Expression {
  var expression: Expression
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSAsExpression: typings.babelTypes.babelTypesStrings.TSAsExpression
}

@JSImport("babel-types", "TSAsExpression")
@js.native
object TSAsExpression extends js.Object {
  def apply(expression: Expression, typeAnnotation: TSType): TSAsExpression = js.native
}

