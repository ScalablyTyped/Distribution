package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VgwTelemetry extends js.Object {
  /**
    * The number of accepted routes.
    */
  var AcceptedRouteCount: js.UndefOr[Integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The date and time of the last change in status.
    */
  var LastStatusChange: js.UndefOr[DateTime] = js.native
  /**
    * The Internet-routable IP address of the virtual private gateway's outside interface.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.native
  /**
    * The status of the VPN tunnel.
    */
  var Status: js.UndefOr[TelemetryStatus] = js.native
  /**
    * If an error occurs, a description of the error.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object VgwTelemetry {
  @scala.inline
  def apply(
    AcceptedRouteCount: js.UndefOr[Integer] = js.undefined,
    CertificateArn: String = null,
    LastStatusChange: DateTime = null,
    OutsideIpAddress: String = null,
    Status: TelemetryStatus = null,
    StatusMessage: String = null
  ): VgwTelemetry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptedRouteCount)) __obj.updateDynamic("AcceptedRouteCount")(AcceptedRouteCount.get.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (LastStatusChange != null) __obj.updateDynamic("LastStatusChange")(LastStatusChange.asInstanceOf[js.Any])
    if (OutsideIpAddress != null) __obj.updateDynamic("OutsideIpAddress")(OutsideIpAddress.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgwTelemetry]
  }
}

