package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetPortSettingsOutput extends js.Object {
  /**
    * The port settings for the requested fleet ID.
    */
  var InboundPermissions: js.UndefOr[IpPermissionsList] = js.native
}

object DescribeFleetPortSettingsOutput {
  @scala.inline
  def apply(InboundPermissions: IpPermissionsList = null): DescribeFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (InboundPermissions != null) __obj.updateDynamic("InboundPermissions")(InboundPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
  }
}

