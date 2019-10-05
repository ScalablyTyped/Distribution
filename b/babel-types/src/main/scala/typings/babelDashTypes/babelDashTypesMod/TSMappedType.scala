package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMappedType
  extends Node
     with TSType {
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSType | Null
  var typeParameter: TypeParameter
  @JSName("type")
  var type_TSMappedType: typings.babelDashTypes.babelDashTypesStrings.TSMappedType
}

@JSImport("babel-types", "TSMappedType")
@js.native
object TSMappedType extends js.Object {
  def apply(typeParameter: TypeParameter): TSMappedType = js.native
  def apply(typeParameter: TypeParameter, typeAnnotation: TSType): TSMappedType = js.native
}

