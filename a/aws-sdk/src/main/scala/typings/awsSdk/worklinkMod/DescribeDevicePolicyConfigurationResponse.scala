package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDevicePolicyConfigurationResponse extends js.Object {
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[Certificate] = js.native
}

object DescribeDevicePolicyConfigurationResponse {
  @scala.inline
  def apply(DeviceCaCertificate: Certificate = null): DescribeDevicePolicyConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceCaCertificate != null) __obj.updateDynamic("DeviceCaCertificate")(DeviceCaCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDevicePolicyConfigurationResponse]
  }
}

