package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAssertion
  extends Node
     with Expression {
  var expression: Expression
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeAssertion: typings.babelDashTypes.babelDashTypesStrings.TSTypeAssertion
}

@JSImport("babel-types", "TSTypeAssertion")
@js.native
object TSTypeAssertion extends js.Object {
  def apply(typeAnnotation: TSType, expression: Expression): TSTypeAssertion = js.native
}

