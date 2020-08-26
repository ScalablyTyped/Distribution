package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIndexedAccessType
  extends Node
     with TSType {
  var indexType: TSType = js.native
  var objectType: TSType = js.native
  @JSName("type")
  var type_TSIndexedAccessType: typings.babelTypes.babelTypesStrings.TSIndexedAccessType = js.native
}

@JSImport("babel-types", "TSIndexedAccessType")
@js.native
object TSIndexedAccessType extends js.Object {
  def apply(objectType: TSType, indexType: TSType): TSIndexedAccessType = js.native
}

