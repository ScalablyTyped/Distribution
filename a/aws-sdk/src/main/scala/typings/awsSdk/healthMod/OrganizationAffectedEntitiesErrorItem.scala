package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationAffectedEntitiesErrorItem extends js.Object {
  /**
    * The 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  /**
    * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION. For example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The name of the error.
    */
  var errorName: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typings.awsSdk.healthMod.eventArn] = js.native
}

object OrganizationAffectedEntitiesErrorItem {
  @scala.inline
  def apply(
    awsAccountId: accountId = null,
    errorMessage: String = null,
    errorName: String = null,
    eventArn: eventArn = null
  ): OrganizationAffectedEntitiesErrorItem = {
    val __obj = js.Dynamic.literal()
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (errorName != null) __obj.updateDynamic("errorName")(errorName.asInstanceOf[js.Any])
    if (eventArn != null) __obj.updateDynamic("eventArn")(eventArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationAffectedEntitiesErrorItem]
  }
}

