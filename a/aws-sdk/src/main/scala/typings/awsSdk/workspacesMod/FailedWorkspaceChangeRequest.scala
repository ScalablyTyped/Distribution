package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedWorkspaceChangeRequest extends js.Object {
  /**
    * The error code that is returned if the WorkSpace cannot be rebooted.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.native
  /**
    * The text of the error message that is returned if the WorkSpace cannot be rebooted.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceId] = js.native
}

object FailedWorkspaceChangeRequest {
  @scala.inline
  def apply(ErrorCode: ErrorType = null, ErrorMessage: Description = null, WorkspaceId: WorkspaceId = null): FailedWorkspaceChangeRequest = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedWorkspaceChangeRequest]
  }
}

