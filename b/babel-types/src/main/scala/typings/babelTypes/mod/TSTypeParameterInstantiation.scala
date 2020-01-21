package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterInstantiation extends Node {
  var params: js.Array[TSType]
  @JSName("type")
  var type_TSTypeParameterInstantiation: typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
}

@JSImport("babel-types", "TSTypeParameterInstantiation")
@js.native
object TSTypeParameterInstantiation extends js.Object {
  def apply(params: js.Array[TSType]): TSTypeParameterInstantiation = js.native
}

