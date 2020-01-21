package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImportDataError extends js.Object {
  /**
    * The type of error that occurred for a specific import task.
    */
  var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.native
  /**
    * The description of the error that occurred for a specific import task.
    */
  var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.native
  /**
    * The unique import ID associated with the error that occurred.
    */
  var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.native
}

object BatchDeleteImportDataError {
  @scala.inline
  def apply(
    errorCode: BatchDeleteImportDataErrorCode = null,
    errorDescription: BatchDeleteImportDataErrorDescription = null,
    importTaskId: ImportTaskIdentifier = null
  ): BatchDeleteImportDataError = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription.asInstanceOf[js.Any])
    if (importTaskId != null) __obj.updateDynamic("importTaskId")(importTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteImportDataError]
  }
}

