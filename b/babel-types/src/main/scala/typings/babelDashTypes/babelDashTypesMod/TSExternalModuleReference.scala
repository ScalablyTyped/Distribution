package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExternalModuleReference extends Node {
  var expression: StringLiteral
  @JSName("type")
  var type_TSExternalModuleReference: typings.babelDashTypes.babelDashTypesStrings.TSExternalModuleReference
}

@JSImport("babel-types", "TSExternalModuleReference")
@js.native
object TSExternalModuleReference extends js.Object {
  def apply(expression: StringLiteral): TSExternalModuleReference = js.native
}

