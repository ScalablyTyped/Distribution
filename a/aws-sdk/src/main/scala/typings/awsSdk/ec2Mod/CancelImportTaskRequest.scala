package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImportTaskRequest extends js.Object {
  /**
    * The reason for canceling the task.
    */
  var CancelReason: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the import image or import snapshot task to be canceled.
    */
  var ImportTaskId: js.UndefOr[typings.awsSdk.ec2Mod.ImportTaskId] = js.native
}

object CancelImportTaskRequest {
  @scala.inline
  def apply(
    CancelReason: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    ImportTaskId: ImportTaskId = null
  ): CancelImportTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (CancelReason != null) __obj.updateDynamic("CancelReason")(CancelReason.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelImportTaskRequest]
  }
}

