package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSUnionType
  extends Node
     with TSType {
  @JSName("type")
  var type_TSUnionType: typings.babelTypes.babelTypesStrings.TSUnionType = js.native
  var types: js.Array[TSType] = js.native
}

@JSImport("babel-types", "TSUnionType")
@js.native
object TSUnionType extends js.Object {
  def apply(types: js.Array[TSType]): TSUnionType = js.native
}

