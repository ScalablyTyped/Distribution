package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetFpgaImageAttributeRequest extends js.Object {
  /**
    * The attribute.
    */
  var Attribute: js.UndefOr[ResetFpgaImageAttributeName] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId = js.native
}

object ResetFpgaImageAttributeRequest {
  @scala.inline
  def apply(
    FpgaImageId: FpgaImageId,
    Attribute: ResetFpgaImageAttributeName = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ResetFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetFpgaImageAttributeRequest]
  }
}

