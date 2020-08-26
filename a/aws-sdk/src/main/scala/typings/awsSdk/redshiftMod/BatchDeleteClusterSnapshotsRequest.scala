package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteClusterSnapshotsRequest extends js.Object {
  /**
    * A list of identifiers for the snapshots that you want to delete.
    */
  var Identifiers: DeleteClusterSnapshotMessageList = js.native
}

object BatchDeleteClusterSnapshotsRequest {
  @scala.inline
  def apply(Identifiers: DeleteClusterSnapshotMessageList): BatchDeleteClusterSnapshotsRequest = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsRequest]
  }
  @scala.inline
  implicit class BatchDeleteClusterSnapshotsRequestOps[Self <: BatchDeleteClusterSnapshotsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentifiersVarargs(value: DeleteClusterSnapshotMessage*): Self = this.set("Identifiers", js.Array(value :_*))
    @scala.inline
    def setIdentifiers(value: DeleteClusterSnapshotMessageList): Self = this.set("Identifiers", value.asInstanceOf[js.Any])
  }
  
}

