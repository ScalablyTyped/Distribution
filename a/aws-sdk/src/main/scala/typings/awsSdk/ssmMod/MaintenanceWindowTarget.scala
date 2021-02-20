package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTarget extends StObject {
  
  /**
    * A description for the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  
  /**
    * The name for the maintenance window target.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  
  /**
    * The type of target that is being registered with the maintenance window.
    */
  var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.native
  
  /**
    * The targets, either instances or tags. Specify instances using the following format:  Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;  Tags are specified using the following format:  Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  
  /**
    * The ID of the maintenance window to register the target with.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  
  /**
    * The ID of the target.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}
object MaintenanceWindowTarget {
  
  @scala.inline
  def apply(): MaintenanceWindowTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTarget]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTargetMutableBuilder[Self <: MaintenanceWindowTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    @scala.inline
    def setResourceType(value: MaintenanceWindowResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
