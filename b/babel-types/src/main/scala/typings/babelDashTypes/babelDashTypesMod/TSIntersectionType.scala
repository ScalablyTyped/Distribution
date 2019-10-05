package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIntersectionType
  extends Node
     with TSType {
  @JSName("type")
  var type_TSIntersectionType: typings.babelDashTypes.babelDashTypesStrings.TSIntersectionType
  var types: js.Array[TSType]
}

@JSImport("babel-types", "TSIntersectionType")
@js.native
object TSIntersectionType extends js.Object {
  def apply(types: js.Array[TSType]): TSIntersectionType = js.native
}

