package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAction extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  /**
    * The status of the managed action. If the action is Scheduled, you can apply it immediately with ApplyEnvironmentManagedAction.
    */
  var Status: js.UndefOr[ActionStatus] = js.native
  /**
    * The start time of the maintenance window in which the managed action will execute.
    */
  var WindowStartTime: js.UndefOr[Timestamp] = js.native
}

object ManagedAction {
  @scala.inline
  def apply(): ManagedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAction]
  }
  @scala.inline
  implicit class ManagedActionOps[Self <: ManagedAction] (val x: Self) extends AnyVal {
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
    def setActionDescription(value: String): Self = this.set("ActionDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionDescription: Self = this.set("ActionDescription", js.undefined)
    @scala.inline
    def setActionId(value: String): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionId: Self = this.set("ActionId", js.undefined)
    @scala.inline
    def setActionType(value: ActionType): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("ActionType", js.undefined)
    @scala.inline
    def setStatus(value: ActionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setWindowStartTime(value: Timestamp): Self = this.set("WindowStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowStartTime: Self = this.set("WindowStartTime", js.undefined)
  }
  
}

