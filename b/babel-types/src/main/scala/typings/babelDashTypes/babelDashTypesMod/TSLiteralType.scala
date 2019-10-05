package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSLiteralType
  extends Node
     with TSType {
  var literal: NumericLiteral | StringLiteral | BooleanLiteral
  @JSName("type")
  var type_TSLiteralType: typings.babelDashTypes.babelDashTypesStrings.TSLiteralType
}

@JSImport("babel-types", "TSLiteralType")
@js.native
object TSLiteralType extends js.Object {
  def apply(literal: BooleanLiteral): TSLiteralType = js.native
  def apply(literal: NumericLiteral): TSLiteralType = js.native
  def apply(literal: StringLiteral): TSLiteralType = js.native
}

