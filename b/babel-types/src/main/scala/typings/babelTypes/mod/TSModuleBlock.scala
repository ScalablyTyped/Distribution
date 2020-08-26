package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSModuleBlock extends Node {
  var body: js.Array[Statement] = js.native
  @JSName("type")
  var type_TSModuleBlock: typings.babelTypes.babelTypesStrings.TSModuleBlock = js.native
}

@JSImport("babel-types", "TSModuleBlock")
@js.native
object TSModuleBlock extends js.Object {
  def apply(body: js.Array[Statement]): TSModuleBlock = js.native
}

