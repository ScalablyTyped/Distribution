package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.DeclaredPredicate_
  - typings.babelTypes.mod.InferredPredicate_
*/
trait FlowPredicate
  extends StObject
     with _Node
object FlowPredicate {
  
  @scala.inline
  def DeclaredPredicate_(value: Flow): typings.babelTypes.mod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclaredPredicate_]
  }
  
  @scala.inline
  def InferredPredicate_(): typings.babelTypes.mod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typings.babelTypes.mod.InferredPredicate_]
  }
}
