package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDevicePolicyConfigurationRequest extends js.Object {
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[CertificateChain] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}

object UpdateDevicePolicyConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, DeviceCaCertificate: CertificateChain = null): UpdateDevicePolicyConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    if (DeviceCaCertificate != null) __obj.updateDynamic("DeviceCaCertificate")(DeviceCaCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicePolicyConfigurationRequest]
  }
}

