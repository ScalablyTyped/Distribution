package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ConditionalExpression_
  - typings.babelTypes.mod.IfStatement_
*/
trait Conditional
  extends StObject
     with _Node
object Conditional {
  
  @scala.inline
  def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typings.babelTypes.mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ConditionalExpression_]
  }
  
  @scala.inline
  def IfStatement_(consequent: Statement, test: Expression): typings.babelTypes.mod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], alternate = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.IfStatement_]
  }
}
