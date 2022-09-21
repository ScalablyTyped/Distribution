package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  /**
    * The component ID.
    */
  var componentId: Component
  
  /**
    * The component type.
    */
  var componentType: ComponentType
}
object Step {
  
  inline def apply(componentId: Component, componentType: ComponentType): Step = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setComponentId(value: Component): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
  }
}
