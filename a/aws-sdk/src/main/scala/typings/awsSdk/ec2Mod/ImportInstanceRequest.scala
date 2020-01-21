package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportInstanceRequest extends js.Object {
  /**
    * A description for the instance being imported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The disk image.
    */
  var DiskImages: js.UndefOr[DiskImageList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The launch specification.
    */
  var LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification] = js.native
  /**
    * The instance operating system.
    */
  var Platform: PlatformValues = js.native
}

object ImportInstanceRequest {
  @scala.inline
  def apply(
    Platform: PlatformValues,
    Description: String = null,
    DiskImages: DiskImageList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LaunchSpecification: ImportInstanceLaunchSpecification = null
  ): ImportInstanceRequest = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DiskImages != null) __obj.updateDynamic("DiskImages")(DiskImages.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (LaunchSpecification != null) __obj.updateDynamic("LaunchSpecification")(LaunchSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportInstanceRequest]
  }
}

