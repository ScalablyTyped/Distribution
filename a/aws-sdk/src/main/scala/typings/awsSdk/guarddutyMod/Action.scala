package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * The GuardDuty finding activity type.
    */
  var ActionType: js.UndefOr[String] = js.native
  /**
    * Information about the AWS_API_CALL action described in this finding.
    */
  var AwsApiCallAction: js.UndefOr[typings.awsSdk.guarddutyMod.AwsApiCallAction] = js.native
  /**
    * Information about the DNS_REQUEST action described in this finding.
    */
  var DnsRequestAction: js.UndefOr[typings.awsSdk.guarddutyMod.DnsRequestAction] = js.native
  /**
    * Information about the NETWORK_CONNECTION action described in this finding.
    */
  var NetworkConnectionAction: js.UndefOr[typings.awsSdk.guarddutyMod.NetworkConnectionAction] = js.native
  /**
    * Information about the PORT_PROBE action described in this finding.
    */
  var PortProbeAction: js.UndefOr[typings.awsSdk.guarddutyMod.PortProbeAction] = js.native
}

object Action {
  @scala.inline
  def apply(
    ActionType: String = null,
    AwsApiCallAction: AwsApiCallAction = null,
    DnsRequestAction: DnsRequestAction = null,
    NetworkConnectionAction: NetworkConnectionAction = null,
    PortProbeAction: PortProbeAction = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType.asInstanceOf[js.Any])
    if (AwsApiCallAction != null) __obj.updateDynamic("AwsApiCallAction")(AwsApiCallAction.asInstanceOf[js.Any])
    if (DnsRequestAction != null) __obj.updateDynamic("DnsRequestAction")(DnsRequestAction.asInstanceOf[js.Any])
    if (NetworkConnectionAction != null) __obj.updateDynamic("NetworkConnectionAction")(NetworkConnectionAction.asInstanceOf[js.Any])
    if (PortProbeAction != null) __obj.updateDynamic("PortProbeAction")(PortProbeAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

