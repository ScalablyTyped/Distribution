package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AffectedEntity extends js.Object {
  /**
    * The 12-digit AWS account number that contains the affected entity.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  /**
    * The unique identifier for the entity. Format: arn:aws:health:entity-region:aws-account:entity/entity-id . Example: arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K 
    */
  var entityArn: js.UndefOr[typings.awsSdk.healthMod.entityArn] = js.native
  /**
    * The URL of the affected entity.
    */
  var entityUrl: js.UndefOr[typings.awsSdk.healthMod.entityUrl] = js.native
  /**
    * The ID of the affected entity.
    */
  var entityValue: js.UndefOr[typings.awsSdk.healthMod.entityValue] = js.native
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typings.awsSdk.healthMod.eventArn] = js.native
  /**
    * The most recent time that the entity was updated.
    */
  var lastUpdatedTime: js.UndefOr[timestamp] = js.native
  /**
    * The most recent status of the entity affected by the event. The possible values are IMPAIRED, UNIMPAIRED, and UNKNOWN.
    */
  var statusCode: js.UndefOr[entityStatusCode] = js.native
  /**
    * A map of entity tags attached to the affected entity.
    */
  var tags: js.UndefOr[tagSet] = js.native
}

object AffectedEntity {
  @scala.inline
  def apply(
    awsAccountId: accountId = null,
    entityArn: entityArn = null,
    entityUrl: entityUrl = null,
    entityValue: entityValue = null,
    eventArn: eventArn = null,
    lastUpdatedTime: timestamp = null,
    statusCode: entityStatusCode = null,
    tags: tagSet = null
  ): AffectedEntity = {
    val __obj = js.Dynamic.literal()
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId.asInstanceOf[js.Any])
    if (entityArn != null) __obj.updateDynamic("entityArn")(entityArn.asInstanceOf[js.Any])
    if (entityUrl != null) __obj.updateDynamic("entityUrl")(entityUrl.asInstanceOf[js.Any])
    if (entityValue != null) __obj.updateDynamic("entityValue")(entityValue.asInstanceOf[js.Any])
    if (eventArn != null) __obj.updateDynamic("eventArn")(eventArn.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffectedEntity]
  }
}

