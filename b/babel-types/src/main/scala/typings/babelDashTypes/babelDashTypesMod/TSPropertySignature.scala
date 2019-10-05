package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSPropertySignature
  extends Node
     with TSTypeElement {
  var computed: Boolean | Null
  var initializer: Expression | Null
  var key: Expression
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSPropertySignature: typings.babelDashTypes.babelDashTypesStrings.TSPropertySignature
}

@JSImport("babel-types", "TSPropertySignature")
@js.native
object TSPropertySignature extends js.Object {
  def apply(key: Expression): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): TSPropertySignature = js.native
}

