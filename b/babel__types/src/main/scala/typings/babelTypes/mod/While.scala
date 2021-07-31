package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.DoWhileStatement_
  - typings.babelTypes.mod.WhileStatement_
*/
trait While
  extends StObject
     with _Node
object While {
  
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.DoWhileStatement_]
  }
  
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.WhileStatement_]
  }
}
