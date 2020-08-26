package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryTrigger extends js.Object {
  /**
    * The branches to be included in the trigger configuration. If you specify an empty array, the trigger applies to all branches.  Although no content is required in the array, you must include the array itself. 
    */
  var branches: js.UndefOr[BranchNameList] = js.native
  /**
    * Any custom data associated with the trigger to be included in the information sent to the target of the trigger.
    */
  var customData: js.UndefOr[RepositoryTriggerCustomData] = js.native
  /**
    * The ARN of the resource that is the target for a trigger (for example, the ARN of a topic in Amazon SNS).
    */
  var destinationArn: Arn = js.native
  /**
    * The repository events that cause the trigger to run actions in another service, such as sending a notification through Amazon SNS.   The valid value "all" cannot be used with any other values. 
    */
  var events: RepositoryTriggerEventList = js.native
  /**
    * The name of the trigger.
    */
  var name: RepositoryTriggerName = js.native
}

object RepositoryTrigger {
  @scala.inline
  def apply(destinationArn: Arn, events: RepositoryTriggerEventList, name: RepositoryTriggerName): RepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTrigger]
  }
  @scala.inline
  implicit class RepositoryTriggerOps[Self <: RepositoryTrigger] (val x: Self) extends AnyVal {
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
    def setDestinationArn(value: Arn): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: RepositoryTriggerEventEnum*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: RepositoryTriggerEventList): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: RepositoryTriggerName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchesVarargs(value: BranchName*): Self = this.set("branches", js.Array(value :_*))
    @scala.inline
    def setBranches(value: BranchNameList): Self = this.set("branches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    @scala.inline
    def setCustomData(value: RepositoryTriggerCustomData): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
  }
  
}

