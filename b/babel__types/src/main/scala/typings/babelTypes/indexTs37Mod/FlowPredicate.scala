package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.DeclaredPredicate_
  - typings.babelTypes.indexTs37Mod.InferredPredicate_
*/
trait FlowPredicate
  extends StObject
     with _Node
object FlowPredicate {
  
  @scala.inline
  def DeclaredPredicate_(value: Flow): typings.babelTypes.indexTs37Mod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.DeclaredPredicate_]
  }
  
  @scala.inline
  def InferredPredicate_(): typings.babelTypes.indexTs37Mod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.InferredPredicate_]
  }
}
