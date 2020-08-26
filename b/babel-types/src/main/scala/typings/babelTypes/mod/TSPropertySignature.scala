package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSPropertySignature
  extends Node
     with TSTypeElement {
  var computed: Boolean | Null = js.native
  var initializer: Expression | Null = js.native
  var key: Expression = js.native
  var optional: Boolean | Null = js.native
  var readonly: Boolean | Null = js.native
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  @JSName("type")
  var type_TSPropertySignature: typings.babelTypes.babelTypesStrings.TSPropertySignature = js.native
}

@JSImport("babel-types", "TSPropertySignature")
@js.native
object TSPropertySignature extends js.Object {
  def apply(key: Expression): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: js.UndefOr[scala.Nothing], initializer: Expression): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): TSPropertySignature = js.native
}

