package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    description - A description of the snapshot.    encrypted - Indicates whether the snapshot is encrypted (true | false)    owner-alias - Value from an Amazon-maintained list (amazon | self | all | aws-marketplace | microsoft) of snapshot owners. Not to be confused with the user-configured AWS account alias, which is set from the IAM console.    owner-id - The ID of the AWS account that owns the snapshot.    progress - The progress of the snapshot, as a percentage (for example, 80%).    snapshot-id - The snapshot ID.    start-time - The time stamp when the snapshot was initiated.    status - The status of the snapshot (pending | completed | error).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    volume-id - The ID of the volume the snapshot is for.    volume-size - The size of the volume, in GiB.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of snapshot results returned by DescribeSnapshots in paginated output. When this parameter is used, DescribeSnapshots only returns MaxResults results in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another DescribeSnapshots request with the returned NextToken value. This value can be between 5 and 1000; if MaxResults is given a value larger than 1000, only 1000 results are returned. If this parameter is not used, then DescribeSnapshots returns all results. You cannot specify this parameter and the snapshot IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The NextToken value returned from a previous paginated DescribeSnapshots request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Describes the snapshots owned by these owners.
    */
  var OwnerIds: js.UndefOr[OwnerStringList] = js.native
  /**
    * The IDs of the AWS accounts that can create volumes from the snapshot.
    */
  var RestorableByUserIds: js.UndefOr[RestorableByStringList] = js.native
  /**
    * The snapshot IDs. Default: Describes the snapshots for which you have create volume permissions.
    */
  var SnapshotIds: js.UndefOr[SnapshotIdStringList] = js.native
}

object DescribeSnapshotsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    OwnerIds: OwnerStringList = null,
    RestorableByUserIds: RestorableByStringList = null,
    SnapshotIds: SnapshotIdStringList = null
  ): DescribeSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OwnerIds != null) __obj.updateDynamic("OwnerIds")(OwnerIds.asInstanceOf[js.Any])
    if (RestorableByUserIds != null) __obj.updateDynamic("RestorableByUserIds")(RestorableByUserIds.asInstanceOf[js.Any])
    if (SnapshotIds != null) __obj.updateDynamic("SnapshotIds")(SnapshotIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotsRequest]
  }
}

