package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSLiteralType
  extends Node
     with TSType {
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ = js.native
  @JSName("type")
  var type_TSLiteralType: typings.babelTypes.babelTypesStrings.TSLiteralType = js.native
}

@JSImport("babel-types", "TSLiteralType")
@js.native
object TSLiteralType extends js.Object {
  def apply(literal: BooleanLiteral_): TSLiteralType = js.native
  def apply(literal: NumericLiteral_): TSLiteralType = js.native
  def apply(literal: StringLiteral_): TSLiteralType = js.native
}

