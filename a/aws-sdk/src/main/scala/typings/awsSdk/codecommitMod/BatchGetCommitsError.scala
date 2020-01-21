package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCommitsError extends js.Object {
  /**
    * A commit ID that either could not be found or was not in a valid format.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * An error code that specifies whether the commit ID was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * An error message that provides detail about why the commit ID either was not found or was not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
}

object BatchGetCommitsError {
  @scala.inline
  def apply(commitId: ObjectId = null, errorCode: ErrorCode = null, errorMessage: ErrorMessage = null): BatchGetCommitsError = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCommitsError]
  }
}

