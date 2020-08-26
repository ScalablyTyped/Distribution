package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSNonNullExpression
  extends Node
     with Expression {
  var expression: Expression = js.native
  @JSName("type")
  var type_TSNonNullExpression: typings.babelTypes.babelTypesStrings.TSNonNullExpression = js.native
}

@JSImport("babel-types", "TSNonNullExpression")
@js.native
object TSNonNullExpression extends js.Object {
  def apply(expression: Expression): TSNonNullExpression = js.native
}

