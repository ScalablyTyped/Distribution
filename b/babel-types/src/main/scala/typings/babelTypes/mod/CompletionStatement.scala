package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BreakStatement
import typings.babelTypes.babelTypesStrings.ContinueStatement
import typings.babelTypes.babelTypesStrings.ReturnStatement
import typings.babelTypes.babelTypesStrings.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.BreakStatement_
  - typings.babelTypes.mod.ContinueStatement_
  - typings.babelTypes.mod.ReturnStatement_
  - typings.babelTypes.mod.ThrowStatement_
*/
trait CompletionStatement extends js.Object

object CompletionStatement {
  @scala.inline
  def BreakStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double, `type`: BreakStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
  @scala.inline
  def ContinueStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double, `type`: ContinueStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
  @scala.inline
  def ReturnStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: ReturnStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
  @scala.inline
  def ThrowStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: ThrowStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
}

