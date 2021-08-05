package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTarget extends StObject {
  
  /**
    * A description for the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * The name for the maintenance window target.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.undefined
  
  /**
    * The type of target that is being registered with the maintenance window.
    */
  var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined
  
  /**
    * The targets, either instances or tags. Specify instances using the following format:  Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;  Tags are specified using the following format:  Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
  
  /**
    * The ID of the maintenance window to register the target with.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  
  /**
    * The ID of the target.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}
object MaintenanceWindowTarget {
  
  inline def apply(): MaintenanceWindowTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTarget]
  }
  
  extension [Self <: MaintenanceWindowTarget](x: Self) {
    
    inline def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    inline def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    inline def setResourceType(value: MaintenanceWindowResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    inline def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    inline def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
