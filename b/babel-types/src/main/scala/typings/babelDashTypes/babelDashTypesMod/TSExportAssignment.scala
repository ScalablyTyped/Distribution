package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExportAssignment
  extends Node
     with Statement {
  var expression: Expression
  @JSName("type")
  var type_TSExportAssignment: typings.babelDashTypes.babelDashTypesStrings.TSExportAssignment
}

@JSImport("babel-types", "TSExportAssignment")
@js.native
object TSExportAssignment extends js.Object {
  def apply(expression: Expression): TSExportAssignment = js.native
}

