package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferredPredicate_
  extends StObject
     with BaseNode
     with Flow
     with FlowPredicate
     with Node {
  
  @JSName("type")
  var type_InferredPredicate_ : InferredPredicate
}
object InferredPredicate_ {
  
  inline def apply(): InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[InferredPredicate_]
  }
  
  extension [Self <: InferredPredicate_](x: Self) {
    
    inline def setType(value: InferredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
