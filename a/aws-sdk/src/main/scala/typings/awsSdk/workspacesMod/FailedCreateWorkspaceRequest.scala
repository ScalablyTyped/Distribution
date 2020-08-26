package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCreateWorkspaceRequest extends js.Object {
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.native
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * Information about the WorkSpace.
    */
  var WorkspaceRequest: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceRequest] = js.native
}

object FailedCreateWorkspaceRequest {
  @scala.inline
  def apply(): FailedCreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateWorkspaceRequest]
  }
  @scala.inline
  implicit class FailedCreateWorkspaceRequestOps[Self <: FailedCreateWorkspaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: ErrorType): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: Description): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setWorkspaceRequest(value: WorkspaceRequest): Self = this.set("WorkspaceRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceRequest: Self = this.set("WorkspaceRequest", js.undefined)
  }
  
}

