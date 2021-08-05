package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckResult extends StObject {
  
  var data: js.Any
  
  var id: String
  
  var impact: String
  
  var message: String
  
  var relatedNodes: js.UndefOr[js.Array[RelatedNode]] = js.undefined
}
object CheckResult {
  
  inline def apply(data: js.Any, id: String, impact: String, message: String): CheckResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResult]
  }
  
  extension [Self <: CheckResult](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: String): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRelatedNodes(value: js.Array[RelatedNode]): Self = StObject.set(x, "relatedNodes", value.asInstanceOf[js.Any])
    
    inline def setRelatedNodesUndefined: Self = StObject.set(x, "relatedNodes", js.undefined)
    
    inline def setRelatedNodesVarargs(value: RelatedNode*): Self = StObject.set(x, "relatedNodes", js.Array(value :_*))
  }
}
