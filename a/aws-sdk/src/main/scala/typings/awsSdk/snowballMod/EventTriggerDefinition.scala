package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTriggerDefinition extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event trigger associated with this job.
    */
  var EventResourceARN: js.UndefOr[ResourceARN] = js.native
}

object EventTriggerDefinition {
  @scala.inline
  def apply(): EventTriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTriggerDefinition]
  }
  @scala.inline
  implicit class EventTriggerDefinitionOps[Self <: EventTriggerDefinition] (val x: Self) extends AnyVal {
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
    def setEventResourceARN(value: ResourceARN): Self = this.set("EventResourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventResourceARN: Self = this.set("EventResourceARN", js.undefined)
  }
  
}

