package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventType extends js.Object {
  /**
    * The entity type ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  /**
    * Timestamp of when the event type was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The event type description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The event type entity types.
    */
  var entityTypes: js.UndefOr[NonEmptyListOfStrings] = js.native
  /**
    * The event type event variables.
    */
  var eventVariables: js.UndefOr[ListOfStrings] = js.native
  /**
    * The event type labels.
    */
  var labels: js.UndefOr[ListOfStrings] = js.native
  /**
    * Timestamp of when the event type was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The event type name.
    */
  var name: js.UndefOr[String] = js.native
}

object EventType {
  @scala.inline
  def apply(): EventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventType]
  }
  @scala.inline
  implicit class EventTypeOps[Self <: EventType] (val x: Self) extends AnyVal {
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: time): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = this.set("entityTypes", js.Array(value :_*))
    @scala.inline
    def setEntityTypes(value: NonEmptyListOfStrings): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    @scala.inline
    def setEventVariablesVarargs(value: String*): Self = this.set("eventVariables", js.Array(value :_*))
    @scala.inline
    def setEventVariables(value: ListOfStrings): Self = this.set("eventVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventVariables: Self = this.set("eventVariables", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: ListOfStrings): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

