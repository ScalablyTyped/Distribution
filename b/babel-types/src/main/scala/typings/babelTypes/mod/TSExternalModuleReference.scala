package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExternalModuleReference extends Node {
  var expression: StringLiteral_ = js.native
  @JSName("type")
  var type_TSExternalModuleReference: typings.babelTypes.babelTypesStrings.TSExternalModuleReference = js.native
}

@JSImport("babel-types", "TSExternalModuleReference")
@js.native
object TSExternalModuleReference extends js.Object {
  def apply(expression: StringLiteral_): TSExternalModuleReference = js.native
}

