package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.DoWhileStatement_
  - typings.babelTypes.indexTs37Mod.ForInStatement_
  - typings.babelTypes.indexTs37Mod.ForStatement_
  - typings.babelTypes.indexTs37Mod.WhileStatement_
  - typings.babelTypes.indexTs37Mod.ForOfStatement_
*/
trait Loop
  extends StObject
     with _Node
object Loop {
  
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression): typings.babelTypes.indexTs37Mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.DoWhileStatement_]
  }
  
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.indexTs37Mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ForInStatement_]
  }
  
  @scala.inline
  def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.indexTs37Mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ForOfStatement_]
  }
  
  @scala.inline
  def ForStatement_(body: Statement): typings.babelTypes.indexTs37Mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, init = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null, update = null)
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ForStatement_]
  }
  
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression): typings.babelTypes.indexTs37Mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.WhileStatement_]
  }
}
