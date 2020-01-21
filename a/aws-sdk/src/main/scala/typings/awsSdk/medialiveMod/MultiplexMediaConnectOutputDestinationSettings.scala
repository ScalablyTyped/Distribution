package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexMediaConnectOutputDestinationSettings extends js.Object {
  /**
    * The MediaConnect entitlement ARN available as a Flow source.
    */
  var EntitlementArn: js.UndefOr[stringMin1] = js.native
}

object MultiplexMediaConnectOutputDestinationSettings {
  @scala.inline
  def apply(EntitlementArn: stringMin1 = null): MultiplexMediaConnectOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexMediaConnectOutputDestinationSettings]
  }
}

