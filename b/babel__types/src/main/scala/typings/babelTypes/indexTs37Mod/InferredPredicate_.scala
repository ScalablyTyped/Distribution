package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait InferredPredicate_
  extends StObject
     with BaseNode
     with Flow
     with FlowPredicate {
  
  @JSName("type")
  var type_InferredPredicate_ : InferredPredicate
}
object InferredPredicate_ {
  
  inline def apply(): InferredPredicate_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[InferredPredicate_]
  }
  
  extension [Self <: InferredPredicate_](x: Self) {
    
    inline def setType(value: InferredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
