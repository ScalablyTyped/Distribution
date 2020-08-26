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
  def apply(): VgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgwTelemetry]
  }
  @scala.inline
  implicit class VgwTelemetryOps[Self <: VgwTelemetry] (val x: Self) extends AnyVal {
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
    def setAcceptedRouteCount(value: Integer): Self = this.set("AcceptedRouteCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptedRouteCount: Self = this.set("AcceptedRouteCount", js.undefined)
    @scala.inline
    def setCertificateArn(value: String): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    @scala.inline
    def setLastStatusChange(value: DateTime): Self = this.set("LastStatusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStatusChange: Self = this.set("LastStatusChange", js.undefined)
    @scala.inline
    def setOutsideIpAddress(value: String): Self = this.set("OutsideIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutsideIpAddress: Self = this.set("OutsideIpAddress", js.undefined)
    @scala.inline
    def setStatus(value: TelemetryStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
  }
  
}

