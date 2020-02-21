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
    * The filters. Supported filters: volume-id | modification-state | target-size | target-iops | target-volume-type | original-size | original-iops | original-volume-type | start-time | originalMultiAttachEnabled | targetMultiAttachEnabled. 
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
    * The IDs of the volumes for which in-progress modifications will be described.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.native
}

object DescribeVolumesModificationsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    VolumeIds: VolumeIdStringList = null
  ): DescribeVolumesModificationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VolumeIds != null) __obj.updateDynamic("VolumeIds")(VolumeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumesModificationsRequest]
  }
}

