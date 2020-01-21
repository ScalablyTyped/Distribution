package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSnapshotResult extends js.Object {
  /**
    * A list of objects describing the API operation.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object ExportSnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): ExportSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotResult]
  }
}

