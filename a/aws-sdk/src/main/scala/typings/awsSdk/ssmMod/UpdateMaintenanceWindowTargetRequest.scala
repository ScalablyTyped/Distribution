package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMaintenanceWindowTargetRequest extends StObject {
  
  /**
    * An optional description for the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  
  /**
    * A name for the update.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  
  /**
    * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  
  /**
    * The targets to add or replace.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  
  /**
    * The maintenance window ID with which to modify the target.
    */
  var WindowId: MaintenanceWindowId = js.native
  
  /**
    * The target ID to modify.
    */
  var WindowTargetId: MaintenanceWindowTargetId = js.native
}
object UpdateMaintenanceWindowTargetRequest {
  
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTargetId: MaintenanceWindowTargetId): UpdateMaintenanceWindowTargetRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetRequest]
  }
  
  @scala.inline
  implicit class UpdateMaintenanceWindowTargetRequestMutableBuilder[Self <: UpdateMaintenanceWindowTargetRequest] (val x: Self) extends AnyVal {
    
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
    def setReplace(value: Boolean): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
  }
}
