package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFpgaImageAttributeRequest extends js.Object {
  /**
    * The AFI attribute.
    */
  var Attribute: FpgaImageAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId = js.native
}

object DescribeFpgaImageAttributeRequest {
  @scala.inline
  def apply(
    Attribute: FpgaImageAttributeName,
    FpgaImageId: FpgaImageId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): DescribeFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFpgaImageAttributeRequest]
  }
}

