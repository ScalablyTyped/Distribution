package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.AwaitExpression
import typings.babelTypes.babelTypesStrings.BreakStatement
import typings.babelTypes.babelTypesStrings.ContinueStatement
import typings.babelTypes.babelTypesStrings.ReturnStatement
import typings.babelTypes.babelTypesStrings.ThrowStatement
import typings.babelTypes.babelTypesStrings.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.BreakStatement_
  - typings.babelTypes.indexTs37Mod.ContinueStatement_
  - typings.babelTypes.indexTs37Mod.ReturnStatement_
  - typings.babelTypes.indexTs37Mod.ThrowStatement_
  - typings.babelTypes.indexTs37Mod.YieldExpression_
  - typings.babelTypes.indexTs37Mod.AwaitExpression_
*/
trait Terminatorless extends _Node
object Terminatorless {
  
  @scala.inline
  def YieldExpression_(delegate: Boolean, `type`: YieldExpression): Terminatorless = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression, `type`: ThrowStatement): Terminatorless = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def BreakStatement_(`type`: BreakStatement): Terminatorless = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def AwaitExpression_(argument: Expression, `type`: AwaitExpression): Terminatorless = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def ReturnStatement_(`type`: ReturnStatement): Terminatorless = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def ContinueStatement_(`type`: ContinueStatement): Terminatorless = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
}
