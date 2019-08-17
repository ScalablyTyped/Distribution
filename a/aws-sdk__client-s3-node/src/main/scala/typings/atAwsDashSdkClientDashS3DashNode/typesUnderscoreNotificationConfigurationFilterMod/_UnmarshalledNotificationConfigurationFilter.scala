package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNotificationConfigurationFilterMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreS3KeyFilterMod._UnmarshalledS3KeyFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledNotificationConfigurationFilter extends _NotificationConfigurationFilter {
  /**
    * <p>Container for object key name prefix and suffix filtering rules.</p>
    */
  @JSName("Key")
  var Key__UnmarshalledNotificationConfigurationFilter: js.UndefOr[_UnmarshalledS3KeyFilter] = js.undefined
}

object _UnmarshalledNotificationConfigurationFilter {
  @scala.inline
  def apply(Key: _UnmarshalledS3KeyFilter = null): _UnmarshalledNotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[_UnmarshalledNotificationConfigurationFilter]
  }
}

