package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexedAccessType
  extends Node
     with TSType {
  var indexType: TSType
  var objectType: TSType
  @JSName("type")
  var type_TSIndexedAccessType: typings.babelDashTypes.babelDashTypesStrings.TSIndexedAccessType
}

@JSImport("babel-types", "TSIndexedAccessType")
@js.native
object TSIndexedAccessType extends js.Object {
  def apply(objectType: TSType, indexType: TSType): TSIndexedAccessType = js.native
}

