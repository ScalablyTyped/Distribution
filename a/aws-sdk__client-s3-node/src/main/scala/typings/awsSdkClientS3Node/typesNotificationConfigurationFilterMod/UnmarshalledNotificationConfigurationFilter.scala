package typings.awsSdkClientS3Node.typesNotificationConfigurationFilterMod

import typings.awsSdkClientS3Node.typesS3KeyFilterMod.UnmarshalledS3KeyFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledNotificationConfigurationFilter extends NotificationConfigurationFilter {
  /**
    * <p>Container for object key name prefix and suffix filtering rules.</p>
    */
  @JSName("Key")
  var Key_UnmarshalledNotificationConfigurationFilter: js.UndefOr[UnmarshalledS3KeyFilter] = js.undefined
}

object UnmarshalledNotificationConfigurationFilter {
  @scala.inline
  def apply(Key: UnmarshalledS3KeyFilter = null): UnmarshalledNotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledNotificationConfigurationFilter]
  }
}

