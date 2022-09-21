package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICstVisitor[IN, OUT] extends StObject {
  
  /**
    * Will throw an error if the visitor is missing any required methods
    * - `visitXYZ` for each `XYZ` grammar rule.
    */
  def validateVisitor(): Unit = js.native
  
  def visit(cstNode: js.Array[CstNode]): OUT = js.native
  def visit(cstNode: js.Array[CstNode], param: IN): OUT = js.native
  def visit(cstNode: CstNode): OUT = js.native
  def visit(cstNode: CstNode, param: IN): OUT = js.native
}
