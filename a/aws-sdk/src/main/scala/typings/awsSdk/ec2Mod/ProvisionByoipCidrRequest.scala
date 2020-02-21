package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionByoipCidrRequest extends js.Object {
  /**
    * The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can specify is /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap with another address range that you've brought to this or another Region.
    */
  var Cidr: String = js.native
  /**
    * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP.
    */
  var CidrAuthorizationContext: js.UndefOr[typings.awsSdk.ec2Mod.CidrAuthorizationContext] = js.native
  /**
    * A description for the address range and the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet. Default: true
    */
  var PubliclyAdvertisable: js.UndefOr[Boolean] = js.native
}

object ProvisionByoipCidrRequest {
  @scala.inline
  def apply(
    Cidr: String,
    CidrAuthorizationContext: CidrAuthorizationContext = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PubliclyAdvertisable: js.UndefOr[scala.Boolean] = js.undefined
  ): ProvisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    if (CidrAuthorizationContext != null) __obj.updateDynamic("CidrAuthorizationContext")(CidrAuthorizationContext.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(PubliclyAdvertisable)) __obj.updateDynamic("PubliclyAdvertisable")(PubliclyAdvertisable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrRequest]
  }
}

