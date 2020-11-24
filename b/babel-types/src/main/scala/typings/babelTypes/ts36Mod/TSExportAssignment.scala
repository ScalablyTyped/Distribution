package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExportAssignment
  extends Node
     with Statement {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_TSExportAssignment: typings.babelTypes.babelTypesStrings.TSExportAssignment = js.native
}
@JSImport("babel-types/ts3.6", "TSExportAssignment")
@js.native
object TSExportAssignment extends js.Object {
  
  def apply(expression: Expression): TSExportAssignment = js.native
}
