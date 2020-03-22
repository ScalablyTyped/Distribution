package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyFpgaImageRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The description for the new AFI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The name for the new AFI. The default is the name of the source AFI.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The ID of the source AFI.
    */
  var SourceFpgaImageId: FpgaImageId = js.native
  /**
    * The Region that contains the source AFI.
    */
  var SourceRegion: String = js.native
}

object CopyFpgaImageRequest {
  @scala.inline
  def apply(
    SourceFpgaImageId: FpgaImageId,
    SourceRegion: String,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Name: String = null
  ): CopyFpgaImageRequest = {
    val __obj = js.Dynamic.literal(SourceFpgaImageId = SourceFpgaImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFpgaImageRequest]
  }
}

