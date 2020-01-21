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
}

