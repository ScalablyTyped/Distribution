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
  @scala.inline
  implicit class GetIdentityNotificationAttributesResponseOps[Self <: GetIdentityNotificationAttributesResponse] (val x: Self) extends AnyVal {
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
    def setNotificationAttributes(value: NotificationAttributes): Self = this.set("NotificationAttributes", value.asInstanceOf[js.Any])
  }
  
}

