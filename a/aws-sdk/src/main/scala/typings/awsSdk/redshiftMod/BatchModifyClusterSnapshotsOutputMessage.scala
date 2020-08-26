package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.native
  /**
    * A list of the snapshots that were modified.
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.native
}

object BatchModifyClusterSnapshotsOutputMessage {
  @scala.inline
  def apply(): BatchModifyClusterSnapshotsOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
  }
  @scala.inline
  implicit class BatchModifyClusterSnapshotsOutputMessageOps[Self <: BatchModifyClusterSnapshotsOutputMessage] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: SnapshotErrorMessage*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchSnapshotOperationErrors): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: SnapshotIdentifierList): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
  }
  
}

