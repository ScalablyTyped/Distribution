package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
  
  /**
    * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified notification type. A value of true specifies that Amazon SES will include headers in notifications, and a value of false specifies that Amazon SES will not include headers in notifications. This value can only be set when NotificationType is already set to use a particular Amazon SNS topic.
    */
  var Enabled: typings.awsSdk.sesMod.Enabled = js.native
  
  /**
    * The identity for which to enable or disable headers in notifications. Examples: user@example.com, example.com.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
  
  /**
    * The notification type for which to enable or disable headers in notifications. 
    */
  var NotificationType: typings.awsSdk.sesMod.NotificationType = js.native
}
object SetIdentityHeadersInNotificationsEnabledRequest {
  
  @scala.inline
  def apply(Enabled: Enabled, Identity: Identity, NotificationType: NotificationType): SetIdentityHeadersInNotificationsEnabledRequest = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityHeadersInNotificationsEnabledRequest]
  }
  
  @scala.inline
  implicit class SetIdentityHeadersInNotificationsEnabledRequestOps[Self <: SetIdentityHeadersInNotificationsEnabledRequest] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = this.set("NotificationType", value.asInstanceOf[js.Any])
  }
}
