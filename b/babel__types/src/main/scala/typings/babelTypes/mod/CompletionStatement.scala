package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BreakStatement
import typings.babelTypes.babelTypesStrings.ContinueStatement
import typings.babelTypes.babelTypesStrings.ReturnStatement
import typings.babelTypes.babelTypesStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.BreakStatement_
  - typings.babelTypes.mod.ContinueStatement_
  - typings.babelTypes.mod.ReturnStatement_
  - typings.babelTypes.mod.ThrowStatement_
*/
trait CompletionStatement extends _Node
object CompletionStatement {
  
  @scala.inline
  def BreakStatement_(`type`: BreakStatement): typings.babelTypes.mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.BreakStatement_]
  }
  
  @scala.inline
  def ContinueStatement_(`type`: ContinueStatement): typings.babelTypes.mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ContinueStatement_]
  }
  
  @scala.inline
  def ReturnStatement_(`type`: ReturnStatement): typings.babelTypes.mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ReturnStatement_]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression, `type`: ThrowStatement): typings.babelTypes.mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ThrowStatement_]
  }
}
