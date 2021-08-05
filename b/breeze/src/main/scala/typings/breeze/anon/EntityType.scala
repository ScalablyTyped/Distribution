package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityType extends StObject {
  
  var entityType: js.UndefOr[typings.breeze.breeze.EntityType] = js.undefined
  
  var ignore: js.UndefOr[Boolean] = js.undefined
  
  var nodeId: js.UndefOr[js.Any] = js.undefined
  
  var nodeRefId: js.UndefOr[js.Any] = js.undefined
}
object EntityType {
  
  inline def apply(): EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityType]
  }
  
  extension [Self <: EntityType](x: Self) {
    
    inline def setEntityType(value: typings.breeze.breeze.EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setNodeId(value: js.Any): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeRefId(value: js.Any): Self = StObject.set(x, "nodeRefId", value.asInstanceOf[js.Any])
    
    inline def setNodeRefIdUndefined: Self = StObject.set(x, "nodeRefId", js.undefined)
  }
}
