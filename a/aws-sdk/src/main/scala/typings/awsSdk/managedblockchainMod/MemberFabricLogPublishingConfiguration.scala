package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFabricLogPublishingConfiguration extends js.Object {
  /**
    * Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs help you determine when a member in your account joins the network, or when new peers register with a member CA.
    */
  var CaLogs: js.UndefOr[LogConfigurations] = js.native
}

object MemberFabricLogPublishingConfiguration {
  @scala.inline
  def apply(CaLogs: LogConfigurations = null): MemberFabricLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CaLogs != null) __obj.updateDynamic("CaLogs")(CaLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberFabricLogPublishingConfiguration]
  }
}

