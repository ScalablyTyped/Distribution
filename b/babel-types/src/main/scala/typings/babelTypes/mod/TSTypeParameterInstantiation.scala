package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterInstantiation extends Node {
  var params: js.Array[TSType] = js.native
  @JSName("type")
  var type_TSTypeParameterInstantiation: typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation = js.native
}

@JSImport("babel-types", "TSTypeParameterInstantiation")
@js.native
object TSTypeParameterInstantiation extends js.Object {
  def apply(params: js.Array[TSType]): TSTypeParameterInstantiation = js.native
}

