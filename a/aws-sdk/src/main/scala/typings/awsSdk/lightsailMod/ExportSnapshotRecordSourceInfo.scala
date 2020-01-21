package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSnapshotRecordSourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the source instance or disk snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * A list of objects describing a disk snapshot.
    */
  var diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo] = js.native
  /**
    * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
    */
  var fromResourceArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the snapshot's source instance or disk.
    */
  var fromResourceName: js.UndefOr[NonEmptyString] = js.native
  /**
    * A list of objects describing an instance snapshot.
    */
  var instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo] = js.native
  /**
    * The name of the source instance or disk snapshot.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Lightsail resource type (e.g., InstanceSnapshot or DiskSnapshot).
    */
  var resourceType: js.UndefOr[ExportSnapshotRecordSourceType] = js.native
}

object ExportSnapshotRecordSourceInfo {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    diskSnapshotInfo: DiskSnapshotInfo = null,
    fromResourceArn: NonEmptyString = null,
    fromResourceName: NonEmptyString = null,
    instanceSnapshotInfo: InstanceSnapshotInfo = null,
    name: NonEmptyString = null,
    resourceType: ExportSnapshotRecordSourceType = null
  ): ExportSnapshotRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (diskSnapshotInfo != null) __obj.updateDynamic("diskSnapshotInfo")(diskSnapshotInfo.asInstanceOf[js.Any])
    if (fromResourceArn != null) __obj.updateDynamic("fromResourceArn")(fromResourceArn.asInstanceOf[js.Any])
    if (fromResourceName != null) __obj.updateDynamic("fromResourceName")(fromResourceName.asInstanceOf[js.Any])
    if (instanceSnapshotInfo != null) __obj.updateDynamic("instanceSnapshotInfo")(instanceSnapshotInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRecordSourceInfo]
  }
}

