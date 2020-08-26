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
  def apply(): OrganizationAffectedEntitiesErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationAffectedEntitiesErrorItem]
  }
  @scala.inline
  implicit class OrganizationAffectedEntitiesErrorItemOps[Self <: OrganizationAffectedEntitiesErrorItem] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: accountId): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorName(value: String): Self = this.set("errorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorName: Self = this.set("errorName", js.undefined)
    @scala.inline
    def setEventArn(value: eventArn): Self = this.set("eventArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventArn: Self = this.set("eventArn", js.undefined)
  }
  
}

