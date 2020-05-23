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
  def apply(eventArn: eventArn, awsAccountId: accountId = null): EventAccountFilter = {
    val __obj = js.Dynamic.literal(eventArn = eventArn.asInstanceOf[js.Any])
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAccountFilter]
  }
}

