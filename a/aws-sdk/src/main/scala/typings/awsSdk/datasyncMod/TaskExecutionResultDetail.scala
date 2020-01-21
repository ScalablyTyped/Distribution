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
  def apply(
    ErrorCode: String = null,
    ErrorDetail: String = null,
    PrepareDuration: Int | Double = null,
    PrepareStatus: PhaseStatus = null,
    TotalDuration: Int | Double = null,
    TransferDuration: Int | Double = null,
    TransferStatus: PhaseStatus = null,
    VerifyDuration: Int | Double = null,
    VerifyStatus: PhaseStatus = null
  ): TaskExecutionResultDetail = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail.asInstanceOf[js.Any])
    if (PrepareDuration != null) __obj.updateDynamic("PrepareDuration")(PrepareDuration.asInstanceOf[js.Any])
    if (PrepareStatus != null) __obj.updateDynamic("PrepareStatus")(PrepareStatus.asInstanceOf[js.Any])
    if (TotalDuration != null) __obj.updateDynamic("TotalDuration")(TotalDuration.asInstanceOf[js.Any])
    if (TransferDuration != null) __obj.updateDynamic("TransferDuration")(TransferDuration.asInstanceOf[js.Any])
    if (TransferStatus != null) __obj.updateDynamic("TransferStatus")(TransferStatus.asInstanceOf[js.Any])
    if (VerifyDuration != null) __obj.updateDynamic("VerifyDuration")(VerifyDuration.asInstanceOf[js.Any])
    if (VerifyStatus != null) __obj.updateDynamic("VerifyStatus")(VerifyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskExecutionResultDetail]
  }
}

