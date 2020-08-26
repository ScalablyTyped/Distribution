package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAccountFilter extends js.Object {
  /**
    * The 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: typings.awsSdk.healthMod.eventArn = js.native
}

object EventAccountFilter {
  @scala.inline
  def apply(eventArn: eventArn): EventAccountFilter = {
    val __obj = js.Dynamic.literal(eventArn = eventArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAccountFilter]
  }
  @scala.inline
  implicit class EventAccountFilterOps[Self <: EventAccountFilter] (val x: Self) extends AnyVal {
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
    def setEventArn(value: eventArn): Self = this.set("eventArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsAccountId(value: accountId): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
  }
  
}

