package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonResultsAdapter extends StObject {
  
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping]
  
  def extractResults(data: js.Object): js.Object
  
  def extractSaveResults(data: js.Object): js.Array[js.Any]
  
  var name: String
  
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): typings.breeze.anon.EntityType
}
object JsonResultsAdapter {
  
  inline def apply(
    extractKeyMappings: js.Object => js.Array[KeyMapping],
    extractResults: js.Object => js.Object,
    extractSaveResults: js.Object => js.Array[js.Any],
    name: String,
    visitNode: (js.Object, QueryContext, NodeContext) => typings.breeze.anon.EntityType
  ): JsonResultsAdapter = {
    val __obj = js.Dynamic.literal(extractKeyMappings = js.Any.fromFunction1(extractKeyMappings), extractResults = js.Any.fromFunction1(extractResults), extractSaveResults = js.Any.fromFunction1(extractSaveResults), name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[JsonResultsAdapter]
  }
  
  extension [Self <: JsonResultsAdapter](x: Self) {
    
    inline def setExtractKeyMappings(value: js.Object => js.Array[KeyMapping]): Self = StObject.set(x, "extractKeyMappings", js.Any.fromFunction1(value))
    
    inline def setExtractResults(value: js.Object => js.Object): Self = StObject.set(x, "extractResults", js.Any.fromFunction1(value))
    
    inline def setExtractSaveResults(value: js.Object => js.Array[js.Any]): Self = StObject.set(x, "extractSaveResults", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisitNode(value: (js.Object, QueryContext, NodeContext) => typings.breeze.anon.EntityType): Self = StObject.set(x, "visitNode", js.Any.fromFunction3(value))
  }
}
