package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConnectionAction extends js.Object {
  /**
    * Indicates whether EC2 blocked the network connection to your instance.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  /**
    * The network connection direction.
    */
  var ConnectionDirection: js.UndefOr[String] = js.native
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalIpDetails] = js.native
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalPortDetails] = js.native
  /**
    * The network connection protocol.
    */
  var Protocol: js.UndefOr[String] = js.native
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  /**
    * The remote port information of the connection.
    */
  var RemotePortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemotePortDetails] = js.native
}

object NetworkConnectionAction {
  @scala.inline
  def apply(
    Blocked: js.UndefOr[Boolean] = js.undefined,
    ConnectionDirection: String = null,
    LocalIpDetails: LocalIpDetails = null,
    LocalPortDetails: LocalPortDetails = null,
    Protocol: String = null,
    RemoteIpDetails: RemoteIpDetails = null,
    RemotePortDetails: RemotePortDetails = null
  ): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Blocked)) __obj.updateDynamic("Blocked")(Blocked.get.asInstanceOf[js.Any])
    if (ConnectionDirection != null) __obj.updateDynamic("ConnectionDirection")(ConnectionDirection.asInstanceOf[js.Any])
    if (LocalIpDetails != null) __obj.updateDynamic("LocalIpDetails")(LocalIpDetails.asInstanceOf[js.Any])
    if (LocalPortDetails != null) __obj.updateDynamic("LocalPortDetails")(LocalPortDetails.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails.asInstanceOf[js.Any])
    if (RemotePortDetails != null) __obj.updateDynamic("RemotePortDetails")(RemotePortDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConnectionAction]
  }
}

