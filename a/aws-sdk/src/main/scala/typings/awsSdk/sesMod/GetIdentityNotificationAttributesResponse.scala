package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityNotificationAttributesResponse extends js.Object {
  /**
    * A map of Identity to IdentityNotificationAttributes.
    */
  var NotificationAttributes: typings.awsSdk.sesMod.NotificationAttributes = js.native
}

object GetIdentityNotificationAttributesResponse {
  @scala.inline
  def apply(NotificationAttributes: NotificationAttributes): GetIdentityNotificationAttributesResponse = {
    val __obj = js.Dynamic.literal(NotificationAttributes = NotificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityNotificationAttributesResponse]
  }
}

