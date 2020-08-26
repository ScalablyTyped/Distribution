package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedActionHistoryItem extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of the managed action.
    */
  var ActionType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  /**
    * The date and time that the action started executing.
    */
  var ExecutedTime: js.UndefOr[Timestamp] = js.native
  /**
    * If the action failed, a description of the failure.
    */
  var FailureDescription: js.UndefOr[String] = js.native
  /**
    * If the action failed, the type of failure.
    */
  var FailureType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.FailureType] = js.native
  /**
    * The date and time that the action finished executing.
    */
  var FinishedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the action.
    */
  var Status: js.UndefOr[ActionHistoryStatus] = js.native
}

object ManagedActionHistoryItem {
  @scala.inline
  def apply(): ManagedActionHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedActionHistoryItem]
  }
  @scala.inline
  implicit class ManagedActionHistoryItemOps[Self <: ManagedActionHistoryItem] (val x: Self) extends AnyVal {
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
    def setExecutedTime(value: Timestamp): Self = this.set("ExecutedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutedTime: Self = this.set("ExecutedTime", js.undefined)
    @scala.inline
    def setFailureDescription(value: String): Self = this.set("FailureDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureDescription: Self = this.set("FailureDescription", js.undefined)
    @scala.inline
    def setFailureType(value: FailureType): Self = this.set("FailureType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureType: Self = this.set("FailureType", js.undefined)
    @scala.inline
    def setFinishedTime(value: Timestamp): Self = this.set("FinishedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishedTime: Self = this.set("FinishedTime", js.undefined)
    @scala.inline
    def setStatus(value: ActionHistoryStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

