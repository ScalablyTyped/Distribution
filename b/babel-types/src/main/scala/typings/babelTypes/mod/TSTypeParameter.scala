package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter extends Node {
  var constraint: TSType | Null
  var default: TSType | Null
  var name: String | Null
  @JSName("type")
  var type_TSTypeParameter: typings.babelTypes.babelTypesStrings.TSTypeParameter
}

@JSImport("babel-types", "TSTypeParameter")
@js.native
object TSTypeParameter extends js.Object {
  def apply(): TSTypeParameter = js.native
  def apply(constraint: TSType): TSTypeParameter = js.native
  def apply(constraint: TSType, default_ : TSType): TSTypeParameter = js.native
}

