package typings.breeze.anon

import typings.breeze.breeze.DeletedEntityKey
import typings.breeze.breeze.Entity
import typings.breeze.breeze.KeyMapping
import typings.breeze.breeze.MappingContext
import typings.breeze.breeze.NodeContext
import typings.breeze.breeze.VisitNodeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractDeletedKeys extends StObject {
  
  var extractDeletedKeys: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[DeletedEntityKey]]] = js.undefined
  
  var extractKeyMappings: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[KeyMapping]]] = js.undefined
  
  var extractResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.undefined
  
  var extractSaveResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[Entity]]] = js.undefined
  
  var name: String
  
  def visitNode(node: js.Object, queryContext: MappingContext, nodeContext: NodeContext): VisitNodeResult
}
object ExtractDeletedKeys {
  
  inline def apply(name: String, visitNode: (js.Object, MappingContext, NodeContext) => VisitNodeResult): ExtractDeletedKeys = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[ExtractDeletedKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractDeletedKeys] (val x: Self) extends AnyVal {
    
    inline def setExtractDeletedKeys(value: /* data */ js.Object => js.Array[DeletedEntityKey]): Self = StObject.set(x, "extractDeletedKeys", js.Any.fromFunction1(value))
    
    inline def setExtractDeletedKeysUndefined: Self = StObject.set(x, "extractDeletedKeys", js.undefined)
    
    inline def setExtractKeyMappings(value: /* data */ js.Object => js.Array[KeyMapping]): Self = StObject.set(x, "extractKeyMappings", js.Any.fromFunction1(value))
    
    inline def setExtractKeyMappingsUndefined: Self = StObject.set(x, "extractKeyMappings", js.undefined)
    
    inline def setExtractResults(value: /* data */ js.Object => js.Object): Self = StObject.set(x, "extractResults", js.Any.fromFunction1(value))
    
    inline def setExtractResultsUndefined: Self = StObject.set(x, "extractResults", js.undefined)
    
    inline def setExtractSaveResults(value: /* data */ js.Object => js.Array[Entity]): Self = StObject.set(x, "extractSaveResults", js.Any.fromFunction1(value))
    
    inline def setExtractSaveResultsUndefined: Self = StObject.set(x, "extractSaveResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisitNode(value: (js.Object, MappingContext, NodeContext) => VisitNodeResult): Self = StObject.set(x, "visitNode", js.Any.fromFunction3(value))
  }
}
