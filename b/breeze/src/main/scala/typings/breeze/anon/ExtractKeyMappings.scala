package typings.breeze.anon

import typings.breeze.breeze.KeyMapping
import typings.breeze.breeze.NodeContext
import typings.breeze.breeze.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractKeyMappings extends StObject {
  
  var extractKeyMappings: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[KeyMapping]]] = js.undefined
  
  var extractResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.undefined
  
  var extractSaveResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[js.Any]]] = js.undefined
  
  var name: String
  
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): EntityType
}
object ExtractKeyMappings {
  
  inline def apply(name: String, visitNode: (js.Object, QueryContext, NodeContext) => EntityType): ExtractKeyMappings = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[ExtractKeyMappings]
  }
  
  extension [Self <: ExtractKeyMappings](x: Self) {
    
    inline def setExtractKeyMappings(value: /* data */ js.Object => js.Array[KeyMapping]): Self = StObject.set(x, "extractKeyMappings", js.Any.fromFunction1(value))
    
    inline def setExtractKeyMappingsUndefined: Self = StObject.set(x, "extractKeyMappings", js.undefined)
    
    inline def setExtractResults(value: /* data */ js.Object => js.Object): Self = StObject.set(x, "extractResults", js.Any.fromFunction1(value))
    
    inline def setExtractResultsUndefined: Self = StObject.set(x, "extractResults", js.undefined)
    
    inline def setExtractSaveResults(value: /* data */ js.Object => js.Array[js.Any]): Self = StObject.set(x, "extractSaveResults", js.Any.fromFunction1(value))
    
    inline def setExtractSaveResultsUndefined: Self = StObject.set(x, "extractSaveResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisitNode(value: (js.Object, QueryContext, NodeContext) => EntityType): Self = StObject.set(x, "visitNode", js.Any.fromFunction3(value))
  }
}
