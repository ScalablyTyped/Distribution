package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExportAssignment
  extends Node
     with Statement {
  var expression: Expression = js.native
  @JSName("type")
  var type_TSExportAssignment: typings.babelTypes.babelTypesStrings.TSExportAssignment = js.native
}

@JSImport("babel-types", "TSExportAssignment")
@js.native
object TSExportAssignment extends js.Object {
  def apply(expression: Expression): TSExportAssignment = js.native
}

