package typings.breeze.breeze

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisitNodeResult extends StObject {
  
  var entityType: js.UndefOr[EntityType] = js.undefined
  
  var extraMetadata: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var ignore: js.UndefOr[Boolean] = js.undefined
  
  var node: js.UndefOr[Any] = js.undefined
  
  var nodeId: js.UndefOr[Any] = js.undefined
  
  var nodeRefId: js.UndefOr[Any] = js.undefined
}
object VisitNodeResult {
  
  inline def apply(): VisitNodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitNodeResult]
  }
  
  extension [Self <: VisitNodeResult](x: Self) {
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setExtraMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "extraMetadata", value.asInstanceOf[js.Any])
    
    inline def setExtraMetadataUndefined: Self = StObject.set(x, "extraMetadata", js.undefined)
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: Any): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeRefId(value: Any): Self = StObject.set(x, "nodeRefId", value.asInstanceOf[js.Any])
    
    inline def setNodeRefIdUndefined: Self = StObject.set(x, "nodeRefId", js.undefined)
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
