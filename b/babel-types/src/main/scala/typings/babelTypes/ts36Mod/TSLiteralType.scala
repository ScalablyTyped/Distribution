package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSLiteralType
  extends Node
     with TSType {
  
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ = js.native
  
  @JSName("type")
  var type_TSLiteralType: typings.babelTypes.babelTypesStrings.TSLiteralType = js.native
}
@JSImport("babel-types/ts3.6", "TSLiteralType")
@js.native
object TSLiteralType extends js.Object {
  
  def apply(literal: BooleanLiteral_): TSLiteralType = js.native
  def apply(literal: NumericLiteral_): TSLiteralType = js.native
  def apply(literal: StringLiteral_): TSLiteralType = js.native
}
