package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenanceWindowTargetResult extends StObject {
  
  /**
    * The updated description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * The updated name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * The updated owner.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.undefined
  
  /**
    * The updated targets.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
  
  /**
    * The maintenance window ID specified in the update request.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  
  /**
    * The target ID specified in the update request.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}
object UpdateMaintenanceWindowTargetResult {
  
  @scala.inline
  def apply(): UpdateMaintenanceWindowTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetResult]
  }
  
  @scala.inline
  implicit class UpdateMaintenanceWindowTargetResultMutableBuilder[Self <: UpdateMaintenanceWindowTargetResult] (val x: Self) extends AnyVal {
    
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
