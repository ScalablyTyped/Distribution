package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.BreakStatement_
  - typings.babelTypes.mod.ContinueStatement_
  - typings.babelTypes.mod.ReturnStatement_
  - typings.babelTypes.mod.ThrowStatement_
  - typings.babelTypes.mod.YieldExpression_
  - typings.babelTypes.mod.AwaitExpression_
*/
trait Terminatorless
  extends StObject
     with _Node
object Terminatorless {
  
  @scala.inline
  def AwaitExpression_(argument: Expression): typings.babelTypes.mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.AwaitExpression_]
  }
  
  @scala.inline
  def BreakStatement_(): typings.babelTypes.mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.BreakStatement_]
  }
  
  @scala.inline
  def ContinueStatement_(): typings.babelTypes.mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ContinueStatement_]
  }
  
  @scala.inline
  def ReturnStatement_(): typings.babelTypes.mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ReturnStatement_]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression): typings.babelTypes.mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ThrowStatement_]
  }
  
  @scala.inline
  def YieldExpression_(delegate: Boolean): typings.babelTypes.mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.YieldExpression_]
  }
}
