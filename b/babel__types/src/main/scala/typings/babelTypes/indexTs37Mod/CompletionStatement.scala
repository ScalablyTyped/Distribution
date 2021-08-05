package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.BreakStatement_
  - typings.babelTypes.indexTs37Mod.ContinueStatement_
  - typings.babelTypes.indexTs37Mod.ReturnStatement_
  - typings.babelTypes.indexTs37Mod.ThrowStatement_
*/
trait CompletionStatement
  extends StObject
     with _Node
object CompletionStatement {
  
  inline def BreakStatement_(): typings.babelTypes.indexTs37Mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BreakStatement_]
  }
  
  inline def ContinueStatement_(): typings.babelTypes.indexTs37Mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ContinueStatement_]
  }
  
  inline def ReturnStatement_(): typings.babelTypes.indexTs37Mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ReturnStatement_]
  }
  
  inline def ThrowStatement_(argument: Expression): typings.babelTypes.indexTs37Mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ThrowStatement_]
  }
}
