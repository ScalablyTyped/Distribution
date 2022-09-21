package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var description: String
  
  var help: String
  
  var helpUrl: String
  
  var id: String
  
  var impact: js.UndefOr[ImpactValue] = js.undefined
  
  var nodes: js.Array[NodeResult]
  
  var tags: js.Array[TagValue]
}
object Result {
  
  inline def apply(
    description: String,
    help: String,
    helpUrl: String,
    id: String,
    nodes: js.Array[NodeResult],
    tags: js.Array[TagValue]
  ): Result = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setImpactNull: Self = StObject.set(x, "impact", null)
    
    inline def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    inline def setNodes(value: js.Array[NodeResult]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeResult*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setTags(value: js.Array[TagValue]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: TagValue*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
