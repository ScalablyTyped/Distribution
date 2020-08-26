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
  def apply(): StartDataSourceSyncJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDataSourceSyncJobResponse]
  }
  @scala.inline
  implicit class StartDataSourceSyncJobResponseOps[Self <: StartDataSourceSyncJobResponse] (val x: Self) extends AnyVal {
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
    def setExecutionId(value: String): Self = this.set("ExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("ExecutionId", js.undefined)
  }
  
}

