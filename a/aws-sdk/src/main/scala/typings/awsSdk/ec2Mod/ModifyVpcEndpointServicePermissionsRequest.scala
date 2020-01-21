package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointServicePermissionsRequest extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this list. To grant permissions to all principals, specify an asterisk (*).
    */
  var AddAllowedPrincipals: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
    */
  var RemoveAllowedPrincipals: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the service.
    */
  var ServiceId: String = js.native
}

object ModifyVpcEndpointServicePermissionsRequest {
  @scala.inline
  def apply(
    ServiceId: String,
    AddAllowedPrincipals: ValueStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RemoveAllowedPrincipals: ValueStringList = null
  ): ModifyVpcEndpointServicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    if (AddAllowedPrincipals != null) __obj.updateDynamic("AddAllowedPrincipals")(AddAllowedPrincipals.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (RemoveAllowedPrincipals != null) __obj.updateDynamic("RemoveAllowedPrincipals")(RemoveAllowedPrincipals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServicePermissionsRequest]
  }
}

