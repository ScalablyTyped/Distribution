package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonResultsAdapter extends StObject {
  
  def extractDeletedKeys(data: js.Object): js.Array[DeletedEntityKey]
  
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping]
  
  def extractResults(data: js.Object): js.Object
  
  def extractSaveResults(data: js.Object): js.Array[Entity]
  
  var name: String
  
  def visitNode(node: js.Object, queryContext: MappingContext, nodeContext: NodeContext): VisitNodeResult
}
object JsonResultsAdapter {
  
  inline def apply(
    extractDeletedKeys: js.Object => js.Array[DeletedEntityKey],
    extractKeyMappings: js.Object => js.Array[KeyMapping],
    extractResults: js.Object => js.Object,
    extractSaveResults: js.Object => js.Array[Entity],
    name: String,
    visitNode: (js.Object, MappingContext, NodeContext) => VisitNodeResult
  ): JsonResultsAdapter = {
    val __obj = js.Dynamic.literal(extractDeletedKeys = js.Any.fromFunction1(extractDeletedKeys), extractKeyMappings = js.Any.fromFunction1(extractKeyMappings), extractResults = js.Any.fromFunction1(extractResults), extractSaveResults = js.Any.fromFunction1(extractSaveResults), name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[JsonResultsAdapter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonResultsAdapter] (val x: Self) extends AnyVal {
    
    inline def setExtractDeletedKeys(value: js.Object => js.Array[DeletedEntityKey]): Self = StObject.set(x, "extractDeletedKeys", js.Any.fromFunction1(value))
    
    inline def setExtractKeyMappings(value: js.Object => js.Array[KeyMapping]): Self = StObject.set(x, "extractKeyMappings", js.Any.fromFunction1(value))
    
    inline def setExtractResults(value: js.Object => js.Object): Self = StObject.set(x, "extractResults", js.Any.fromFunction1(value))
    
    inline def setExtractSaveResults(value: js.Object => js.Array[Entity]): Self = StObject.set(x, "extractSaveResults", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisitNode(value: (js.Object, MappingContext, NodeContext) => VisitNodeResult): Self = StObject.set(x, "visitNode", js.Any.fromFunction3(value))
  }
}
