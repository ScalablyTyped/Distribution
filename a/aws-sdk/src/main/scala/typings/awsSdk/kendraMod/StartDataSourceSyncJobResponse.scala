package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDataSourceSyncJobResponse extends js.Object {
  /**
    * Identifies a particular synchronization job.
    */
  var ExecutionId: js.UndefOr[String] = js.native
}

object StartDataSourceSyncJobResponse {
  @scala.inline
  def apply(ExecutionId: String = null): StartDataSourceSyncJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDataSourceSyncJobResponse]
  }
}

