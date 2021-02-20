package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcesMoveInfo extends StObject {
  
  /**
    * The IDs of the resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The target resource group.
    */
  var targetResourceGroup: js.UndefOr[String] = js.native
}
object ResourcesMoveInfo {
  
  @scala.inline
  def apply(): ResourcesMoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesMoveInfo]
  }
  
  @scala.inline
  implicit class ResourcesMoveInfoMutableBuilder[Self <: ResourcesMoveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setTargetResourceGroup(value: String): Self = StObject.set(x, "targetResourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourceGroupUndefined: Self = StObject.set(x, "targetResourceGroup", js.undefined)
  }
}
