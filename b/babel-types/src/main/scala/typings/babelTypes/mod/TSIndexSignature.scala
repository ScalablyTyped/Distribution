package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexSignature
  extends Node
     with TSTypeElement {
  var parameters: js.Array[Identifier_]
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSIndexSignature: typings.babelTypes.babelTypesStrings.TSIndexSignature
}

@JSImport("babel-types", "TSIndexSignature")
@js.native
object TSIndexSignature extends js.Object {
  def apply(parameters: js.Array[Identifier_]): TSIndexSignature = js.native
  def apply(parameters: js.Array[Identifier_], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
}

