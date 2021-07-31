package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ForInStatement_
  - typings.babelTypes.mod.ForStatement_
  - typings.babelTypes.mod.ForOfStatement_
*/
trait For
  extends StObject
     with _Node
object For {
  
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForInStatement_]
  }
  
  @scala.inline
  def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForOfStatement_]
  }
  
  @scala.inline
  def ForStatement_(body: Statement): typings.babelTypes.mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, init = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null, update = null)
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForStatement_]
  }
}
