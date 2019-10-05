package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParenthesizedType
  extends Node
     with TSType {
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSParenthesizedType: typings.babelDashTypes.babelDashTypesStrings.TSParenthesizedType
}

@JSImport("babel-types", "TSParenthesizedType")
@js.native
object TSParenthesizedType extends js.Object {
  def apply(typeAnnotation: TSType): TSParenthesizedType = js.native
}

