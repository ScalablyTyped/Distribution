package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.BreakStatement_
  - typings.babelTypes.ts36Mod.ContinueStatement_
  - typings.babelTypes.ts36Mod.ReturnStatement_
  - typings.babelTypes.ts36Mod.ThrowStatement_
  - typings.babelTypes.ts36Mod.YieldExpression_
  - typings.babelTypes.ts36Mod.AwaitExpression_
*/
trait Terminatorless extends StObject
object Terminatorless {
  
  @scala.inline
  def AwaitExpression_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.AwaitExpression_]
  }
  
  @scala.inline
  def BreakStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BreakStatement_]
  }
  
  @scala.inline
  def ContinueStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ContinueStatement_]
  }
  
  @scala.inline
  def ReturnStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ReturnStatement_]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ThrowStatement_]
  }
  
  @scala.inline
  def YieldExpression_(argument: Expression, delegate: Boolean, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.YieldExpression_]
  }
}
