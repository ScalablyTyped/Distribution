package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexSignature
  extends Node
     with TSTypeElement {
  var parameters: js.Array[Identifier]
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSIndexSignature: typings.babelDashTypes.babelDashTypesStrings.TSIndexSignature
}

@JSImport("babel-types", "TSIndexSignature")
@js.native
object TSIndexSignature extends js.Object {
  def apply(parameters: js.Array[Identifier]): TSIndexSignature = js.native
  def apply(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
}

