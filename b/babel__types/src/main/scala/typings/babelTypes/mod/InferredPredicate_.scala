package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait InferredPredicate_
  extends StObject
     with BaseNode
     with Flow
     with FlowPredicate {
  
  @JSName("type")
  var type_InferredPredicate_ : InferredPredicate
}
object InferredPredicate_ {
  
  @scala.inline
  def apply(): InferredPredicate_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[InferredPredicate_]
  }
  
  @scala.inline
  implicit class InferredPredicate_MutableBuilder[Self <: InferredPredicate_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InferredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
