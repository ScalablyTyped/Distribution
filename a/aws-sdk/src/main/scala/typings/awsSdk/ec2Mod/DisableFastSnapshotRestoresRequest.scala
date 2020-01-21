package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableFastSnapshotRestoresRequest extends js.Object {
  /**
    * One or more Availability Zones. For example, us-east-2a.
    */
  var AvailabilityZones: AvailabilityZoneStringList = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of one or more snapshots. For example, snap-1234567890abcdef0.
    */
  var SourceSnapshotIds: SnapshotIdStringList = js.native
}

object DisableFastSnapshotRestoresRequest {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneStringList,
    SourceSnapshotIds: SnapshotIdStringList,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DisableFastSnapshotRestoresRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], SourceSnapshotIds = SourceSnapshotIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFastSnapshotRestoresRequest]
  }
}

