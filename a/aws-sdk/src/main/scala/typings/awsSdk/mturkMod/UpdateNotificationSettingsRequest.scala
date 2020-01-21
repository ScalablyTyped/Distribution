package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotificationSettingsRequest extends js.Object {
  /**
    *  Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification. You must specify either the Notification parameter or the Active parameter for the call to UpdateNotificationSettings to succeed. 
    */
  var Active: js.UndefOr[Boolean] = js.native
  /**
    *  The ID of the HIT type whose notification specification is being updated. 
    */
  var HITTypeId: EntityId = js.native
  /**
    *  The notification specification for the HIT type. 
    */
  var Notification: js.UndefOr[NotificationSpecification] = js.native
}

object UpdateNotificationSettingsRequest {
  @scala.inline
  def apply(
    HITTypeId: EntityId,
    Active: js.UndefOr[scala.Boolean] = js.undefined,
    Notification: NotificationSpecification = null
  ): UpdateNotificationSettingsRequest = {
    val __obj = js.Dynamic.literal(HITTypeId = HITTypeId.asInstanceOf[js.Any])
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationSettingsRequest]
  }
}

