package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingMaintenanceAction extends js.Object {
  
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
  implicit class PendingMaintenanceActionOps[Self <: PendingMaintenanceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: NonEmptyString): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setCurrentApplyDate(value: IsoDate): Self = this.set("currentApplyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentApplyDate: Self = this.set("currentApplyDate", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
