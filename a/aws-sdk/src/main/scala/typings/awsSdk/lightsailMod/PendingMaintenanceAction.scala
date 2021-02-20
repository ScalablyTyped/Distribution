package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingMaintenanceAction extends StObject {
  
  /**
    * The type of pending database maintenance action.
    */
  var action: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The effective date of the pending database maintenance action.
    */
  var currentApplyDate: js.UndefOr[IsoDate] = js.native
  
  /**
    * Additional detail about the pending database maintenance action.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
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
    def setAction(value: NonEmptyString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCurrentApplyDate(value: IsoDate): Self = StObject.set(x, "currentApplyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplyDateUndefined: Self = StObject.set(x, "currentApplyDate", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
