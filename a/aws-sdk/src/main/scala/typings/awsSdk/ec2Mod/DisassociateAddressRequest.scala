package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateAddressRequest extends js.Object {
  /**
    * [EC2-VPC] The association ID. Required for EC2-VPC.
    */
  var AssociationId: js.UndefOr[ElasticIpAssociationId] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object DisassociateAddressRequest {
  @scala.inline
  def apply(
    AssociationId: ElasticIpAssociationId = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    PublicIp: String = null
  ): DisassociateAddressRequest = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAddressRequest]
  }
}

