package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSUnionType
  extends Node
     with TSType {
  @JSName("type")
  var type_TSUnionType: typings.babelDashTypes.babelDashTypesStrings.TSUnionType
  var types: js.Array[TSType]
}

@JSImport("babel-types", "TSUnionType")
@js.native
object TSUnionType extends js.Object {
  def apply(types: js.Array[TSType]): TSUnionType = js.native
}

