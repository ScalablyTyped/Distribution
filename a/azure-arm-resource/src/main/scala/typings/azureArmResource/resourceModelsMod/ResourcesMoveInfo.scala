package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcesMoveInfo extends StObject {
  
  /**
    * The IDs of the resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The target resource group.
    */
  var targetResourceGroup: js.UndefOr[String] = js.undefined
}
object ResourcesMoveInfo {
  
  inline def apply(): ResourcesMoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesMoveInfo]
  }
  
  extension [Self <: ResourcesMoveInfo](x: Self) {
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setTargetResourceGroup(value: String): Self = StObject.set(x, "targetResourceGroup", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceGroupUndefined: Self = StObject.set(x, "targetResourceGroup", js.undefined)
  }
}
