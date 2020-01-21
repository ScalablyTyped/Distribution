package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSLiteralType
  extends Node
     with TSType {
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_
  @JSName("type")
  var type_TSLiteralType: typings.babelTypes.babelTypesStrings.TSLiteralType
}

@JSImport("babel-types", "TSLiteralType")
@js.native
object TSLiteralType extends js.Object {
  def apply(literal: BooleanLiteral_): TSLiteralType = js.native
  def apply(literal: NumericLiteral_): TSLiteralType = js.native
  def apply(literal: StringLiteral_): TSLiteralType = js.native
}

