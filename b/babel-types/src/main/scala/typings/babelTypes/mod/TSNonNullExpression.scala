package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSNonNullExpression
  extends Node
     with Expression {
  var expression: Expression
  @JSName("type")
  var type_TSNonNullExpression: typings.babelTypes.babelTypesStrings.TSNonNullExpression
}

@JSImport("babel-types", "TSNonNullExpression")
@js.native
object TSNonNullExpression extends js.Object {
  def apply(expression: Expression): TSNonNullExpression = js.native
}

