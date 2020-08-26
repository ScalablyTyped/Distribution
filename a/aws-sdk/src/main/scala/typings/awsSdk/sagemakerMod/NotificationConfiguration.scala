package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * The ARN for the SNS topic to which notifications should be published.
    */
  var NotificationTopicArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationTopicArn] = js.native
}

object NotificationConfiguration {
  @scala.inline
  def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  @scala.inline
  implicit class NotificationConfigurationOps[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotificationTopicArn(value: NotificationTopicArn): Self = this.set("NotificationTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("NotificationTopicArn", js.undefined)
  }
  
}

