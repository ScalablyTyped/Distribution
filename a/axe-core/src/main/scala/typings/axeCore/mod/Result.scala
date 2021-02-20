package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  var description: String = js.native
  
  var help: String = js.native
  
  var helpUrl: String = js.native
  
  var id: String = js.native
  
  var impact: js.UndefOr[ImpactValue] = js.native
  
  var nodes: js.Array[NodeResult] = js.native
  
  var tags: js.Array[TagValue] = js.native
}
object Result {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpactNull: Self = StObject.set(x, "impact", null)
    
    @scala.inline
    def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[NodeResult]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: NodeResult*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[TagValue]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: TagValue*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
