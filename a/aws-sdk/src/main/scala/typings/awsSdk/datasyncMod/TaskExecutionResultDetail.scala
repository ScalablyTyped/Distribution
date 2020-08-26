package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskExecutionResultDetail extends js.Object {
  /**
    * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[String] = js.native
  /**
    * The total time in milliseconds that AWS DataSync spent in the PREPARING phase. 
    */
  var PrepareDuration: js.UndefOr[Duration] = js.native
  /**
    * The status of the PREPARING phase.
    */
  var PrepareStatus: js.UndefOr[PhaseStatus] = js.native
  /**
    * The total time in milliseconds that AWS DataSync took to transfer the file from the source to the destination location.
    */
  var TotalDuration: js.UndefOr[Duration] = js.native
  /**
    * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
    */
  var TransferDuration: js.UndefOr[Duration] = js.native
  /**
    * The status of the TRANSFERRING Phase.
    */
  var TransferStatus: js.UndefOr[PhaseStatus] = js.native
  /**
    * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
    */
  var VerifyDuration: js.UndefOr[Duration] = js.native
  /**
    * The status of the VERIFYING Phase.
    */
  var VerifyStatus: js.UndefOr[PhaseStatus] = js.native
}

object TaskExecutionResultDetail {
  @scala.inline
  def apply(): TaskExecutionResultDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskExecutionResultDetail]
  }
  @scala.inline
  implicit class TaskExecutionResultDetailOps[Self <: TaskExecutionResultDetail] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorDetail(value: String): Self = this.set("ErrorDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetail: Self = this.set("ErrorDetail", js.undefined)
    @scala.inline
    def setPrepareDuration(value: Duration): Self = this.set("PrepareDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepareDuration: Self = this.set("PrepareDuration", js.undefined)
    @scala.inline
    def setPrepareStatus(value: PhaseStatus): Self = this.set("PrepareStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepareStatus: Self = this.set("PrepareStatus", js.undefined)
    @scala.inline
    def setTotalDuration(value: Duration): Self = this.set("TotalDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDuration: Self = this.set("TotalDuration", js.undefined)
    @scala.inline
    def setTransferDuration(value: Duration): Self = this.set("TransferDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferDuration: Self = this.set("TransferDuration", js.undefined)
    @scala.inline
    def setTransferStatus(value: PhaseStatus): Self = this.set("TransferStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferStatus: Self = this.set("TransferStatus", js.undefined)
    @scala.inline
    def setVerifyDuration(value: Duration): Self = this.set("VerifyDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyDuration: Self = this.set("VerifyDuration", js.undefined)
    @scala.inline
    def setVerifyStatus(value: PhaseStatus): Self = this.set("VerifyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyStatus: Self = this.set("VerifyStatus", js.undefined)
  }
  
}

