package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMappedType
  extends Node
     with TSType {
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSType | Null
  var typeParameter: TypeParameter_
  @JSName("type")
  var type_TSMappedType: typings.babelTypes.babelTypesStrings.TSMappedType
}

@JSImport("babel-types", "TSMappedType")
@js.native
object TSMappedType extends js.Object {
  def apply(typeParameter: TypeParameter_): TSMappedType = js.native
  def apply(typeParameter: TypeParameter_, typeAnnotation: TSType): TSMappedType = js.native
}

