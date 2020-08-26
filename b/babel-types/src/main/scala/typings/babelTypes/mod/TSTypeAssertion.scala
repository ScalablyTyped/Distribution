package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAssertion
  extends Node
     with Expression {
  var expression: Expression = js.native
  var typeAnnotation: TSType = js.native
  @JSName("type")
  var type_TSTypeAssertion: typings.babelTypes.babelTypesStrings.TSTypeAssertion = js.native
}

@JSImport("babel-types", "TSTypeAssertion")
@js.native
object TSTypeAssertion extends js.Object {
  def apply(typeAnnotation: TSType, expression: Expression): TSTypeAssertion = js.native
}

