package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesModificationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    modification-state - The current modification state (modifying | optimizing | completed | failed).    original-iops - The original IOPS rate of the volume.    original-size - The original size of the volume, in GiB.    original-volume-type - The original volume type of the volume (standard | io1 | gp2 | sc1 | st1).    originalMultiAttachEnabled - Indicates whether Multi-Attach support was enabled (true | false).    start-time - The modification start time.    target-iops - The target IOPS rate of the volume.    target-size - The target size of the volume, in GiB.    target-volume-type - The target volume type of the volume (standard | io1 | gp2 | sc1 | st1).    targetMultiAttachEnabled - Indicates whether Multi-Attach support is to be enabled (true | false).    volume-id - The ID of the volume.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results (up to a limit of 500) to be returned in a paginated request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The nextToken value returned by a previous paginated request.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the volumes.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.native
}

object DescribeVolumesModificationsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    VolumeIds: VolumeIdStringList = null
  ): DescribeVolumesModificationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VolumeIds != null) __obj.updateDynamic("VolumeIds")(VolumeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumesModificationsRequest]
  }
}

