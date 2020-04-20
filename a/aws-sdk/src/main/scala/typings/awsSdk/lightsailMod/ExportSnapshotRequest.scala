package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSnapshotRequest extends js.Object {
  /**
    * The name of the instance or disk snapshot to be exported to Amazon EC2.
    */
  var sourceSnapshotName: ResourceName = js.native
}

object ExportSnapshotRequest {
  @scala.inline
  def apply(sourceSnapshotName: ResourceName): ExportSnapshotRequest = {
    val __obj = js.Dynamic.literal(sourceSnapshotName = sourceSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRequest]
  }
}

