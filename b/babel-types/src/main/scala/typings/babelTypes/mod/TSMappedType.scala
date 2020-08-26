package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMappedType
  extends Node
     with TSType {
  var optional: Boolean | Null = js.native
  var readonly: Boolean | Null = js.native
  var typeAnnotation: TSType | Null = js.native
  var typeParameter: TypeParameter_ = js.native
  @JSName("type")
  var type_TSMappedType: typings.babelTypes.babelTypesStrings.TSMappedType = js.native
}

@JSImport("babel-types", "TSMappedType")
@js.native
object TSMappedType extends js.Object {
  def apply(typeParameter: TypeParameter_): TSMappedType = js.native
  def apply(typeParameter: TypeParameter_, typeAnnotation: TSType): TSMappedType = js.native
}

