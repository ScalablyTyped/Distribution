package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameter extends Node {
  var constraint: TSType | Null = js.native
  var default: TSType | Null = js.native
  var name: String | Null = js.native
  @JSName("type")
  var type_TSTypeParameter: typings.babelTypes.babelTypesStrings.TSTypeParameter = js.native
}

@JSImport("babel-types", "TSTypeParameter")
@js.native
object TSTypeParameter extends js.Object {
  def apply(): TSTypeParameter = js.native
  def apply(constraint: js.UndefOr[scala.Nothing], default_ : TSType): TSTypeParameter = js.native
  def apply(constraint: TSType): TSTypeParameter = js.native
  def apply(constraint: TSType, default_ : TSType): TSTypeParameter = js.native
}

