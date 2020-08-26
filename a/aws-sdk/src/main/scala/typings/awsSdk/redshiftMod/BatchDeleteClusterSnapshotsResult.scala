package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteClusterSnapshotsResult extends js.Object {
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.native
  /**
    * A list of the snapshot identifiers that were deleted. 
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.native
}

object BatchDeleteClusterSnapshotsResult {
  @scala.inline
  def apply(): BatchDeleteClusterSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsResult]
  }
  @scala.inline
  implicit class BatchDeleteClusterSnapshotsResultOps[Self <: BatchDeleteClusterSnapshotsResult] (val x: Self) extends AnyVal {
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
    def setErrors(value: BatchSnapshotOperationErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
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

