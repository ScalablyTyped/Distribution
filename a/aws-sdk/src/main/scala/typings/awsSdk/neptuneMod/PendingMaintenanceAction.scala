package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingMaintenanceAction extends StObject {
  
  /**
    * The type of pending maintenance action that is available for the resource.
    */
  var Action: js.UndefOr[String] = js.undefined
  
  /**
    * The date of the maintenance window when the action is applied. The maintenance action is applied to the resource during its first maintenance window after this date. If this date is specified, any next-maintenance opt-in requests are ignored.
    */
  var AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The effective date when the pending maintenance action is applied to the resource. This date takes into account opt-in requests received from the ApplyPendingMaintenanceAction API, the AutoAppliedAfterDate, and the ForcedApplyDate. This value is blank if an opt-in request has not been received and nothing has been specified as AutoAppliedAfterDate or ForcedApplyDate.
    */
  var CurrentApplyDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A description providing more detail about the maintenance action.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The date when the maintenance action is automatically applied. The maintenance action is applied to the resource on this date regardless of the maintenance window for the resource. If this date is specified, any immediate opt-in requests are ignored.
    */
  var ForcedApplyDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Indicates the type of opt-in request that has been received for the resource.
    */
  var OptInStatus: js.UndefOr[String] = js.undefined
}
object PendingMaintenanceAction {
  
  @scala.inline
  def apply(): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
  
  @scala.inline
  implicit class PendingMaintenanceActionMutableBuilder[Self <: PendingMaintenanceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setAutoAppliedAfterDate(value: TStamp): Self = StObject.set(x, "AutoAppliedAfterDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAppliedAfterDateUndefined: Self = StObject.set(x, "AutoAppliedAfterDate", js.undefined)
    
    @scala.inline
    def setCurrentApplyDate(value: TStamp): Self = StObject.set(x, "CurrentApplyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplyDateUndefined: Self = StObject.set(x, "CurrentApplyDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setForcedApplyDate(value: TStamp): Self = StObject.set(x, "ForcedApplyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcedApplyDateUndefined: Self = StObject.set(x, "ForcedApplyDate", js.undefined)
    
    @scala.inline
    def setOptInStatus(value: String): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
  }
}
