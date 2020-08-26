package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPendingMaintenanceActionMessage extends js.Object {
  /**
    * The pending maintenance action to apply to this resource. Valid values: system-update, db-upgrade 
    */
  var ApplyAction: String = js.native
  /**
    * A value that specifies the type of opt-in request, or undoes an opt-in request. An opt-in request of type immediate can't be undone. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
    */
  var OptInType: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN).
    */
  var ResourceIdentifier: String = js.native
}

object ApplyPendingMaintenanceActionMessage {
  @scala.inline
  def apply(ApplyAction: String, OptInType: String, ResourceIdentifier: String): ApplyPendingMaintenanceActionMessage = {
    val __obj = js.Dynamic.literal(ApplyAction = ApplyAction.asInstanceOf[js.Any], OptInType = OptInType.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
  }
  @scala.inline
  implicit class ApplyPendingMaintenanceActionMessageOps[Self <: ApplyPendingMaintenanceActionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyAction(value: String): Self = this.set("ApplyAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptInType(value: String): Self = this.set("OptInType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceIdentifier(value: String): Self = this.set("ResourceIdentifier", value.asInstanceOf[js.Any])
  }
  
}

