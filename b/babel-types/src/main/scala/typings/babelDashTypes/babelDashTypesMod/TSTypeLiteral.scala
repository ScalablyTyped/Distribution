package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeLiteral
  extends Node
     with TSType {
  var members: js.Array[TSTypeElement]
  @JSName("type")
  var type_TSTypeLiteral: typings.babelDashTypes.babelDashTypesStrings.TSTypeLiteral
}

@JSImport("babel-types", "TSTypeLiteral")
@js.native
object TSTypeLiteral extends js.Object {
  def apply(members: js.Array[TSTypeElement]): TSTypeLiteral = js.native
}

