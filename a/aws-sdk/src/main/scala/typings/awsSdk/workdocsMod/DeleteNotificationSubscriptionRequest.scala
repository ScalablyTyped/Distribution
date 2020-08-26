package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNotificationSubscriptionRequest extends js.Object {
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType = js.native
  /**
    * The ID of the subscription.
    */
  var SubscriptionId: IdType = js.native
}

object DeleteNotificationSubscriptionRequest {
  @scala.inline
  def apply(OrganizationId: IdType, SubscriptionId: IdType): DeleteNotificationSubscriptionRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], SubscriptionId = SubscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationSubscriptionRequest]
  }
  @scala.inline
  implicit class DeleteNotificationSubscriptionRequestOps[Self <: DeleteNotificationSubscriptionRequest] (val x: Self) extends AnyVal {
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
    def setOrganizationId(value: IdType): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionId(value: IdType): Self = this.set("SubscriptionId", value.asInstanceOf[js.Any])
  }
  
}

