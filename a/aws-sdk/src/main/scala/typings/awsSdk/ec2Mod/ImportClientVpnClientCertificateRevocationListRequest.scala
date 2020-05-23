package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportClientVpnClientCertificateRevocationListRequest extends js.Object {
  /**
    * The client certificate revocation list file. For more information, see Generate a Client Certificate Revocation List in the AWS Client VPN Administrator Guide.
    */
  var CertificateRevocationList: String = js.native
  /**
    * The ID of the Client VPN endpoint to which the client certificate revocation list applies.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object ImportClientVpnClientCertificateRevocationListRequest {
  @scala.inline
  def apply(
    CertificateRevocationList: String,
    ClientVpnEndpointId: ClientVpnEndpointId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ImportClientVpnClientCertificateRevocationListRequest = {
    val __obj = js.Dynamic.literal(CertificateRevocationList = CertificateRevocationList.asInstanceOf[js.Any], ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportClientVpnClientCertificateRevocationListRequest]
  }
}

