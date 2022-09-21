package typings.breeze.breeze

import typings.breeze.anon.EntityTypeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeContext extends StObject {
  
  var navigationProperty: js.UndefOr[EntityTypeName] = js.undefined
  
  var nodeType: String
  
  var propertyName: String
}
object NodeContext {
  
  inline def apply(nodeType: String, propertyName: String): NodeContext = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeContext]
  }
  
  extension [Self <: NodeContext](x: Self) {
    
    inline def setNavigationProperty(value: EntityTypeName): Self = StObject.set(x, "navigationProperty", value.asInstanceOf[js.Any])
    
    inline def setNavigationPropertyUndefined: Self = StObject.set(x, "navigationProperty", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
