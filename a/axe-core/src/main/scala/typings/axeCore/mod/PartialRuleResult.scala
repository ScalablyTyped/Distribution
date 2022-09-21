package typings.axeCore.mod

import typings.axeCore.axeCoreStrings.inapplicable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialRuleResult extends StObject {
  
  var id: String
  
  var impact: Null
  
  var nodes: js.Array[Record[String, Any]]
  
  var pageLevel: Boolean
  
  var result: inapplicable
}
object PartialRuleResult {
  
  inline def apply(id: String, impact: Null, nodes: js.Array[Record[String, Any]], pageLevel: Boolean): PartialRuleResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pageLevel = pageLevel.asInstanceOf[js.Any], result = "inapplicable")
    __obj.asInstanceOf[PartialRuleResult]
  }
  
  extension [Self <: PartialRuleResult](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: Null): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPageLevel(value: Boolean): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    inline def setResult(value: inapplicable): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
