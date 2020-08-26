package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReprocessingSummary extends js.Object {
  /**
    * The time the pipeline reprocessing was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The 'reprocessingId' returned by "StartPipelineReprocessing".
    */
  var id: js.UndefOr[ReprocessingId] = js.native
  /**
    * The status of the pipeline reprocessing.
    */
  var status: js.UndefOr[ReprocessingStatus] = js.native
}

object ReprocessingSummary {
  @scala.inline
  def apply(): ReprocessingSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReprocessingSummary]
  }
  @scala.inline
  implicit class ReprocessingSummaryOps[Self <: ReprocessingSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setId(value: ReprocessingId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setStatus(value: ReprocessingStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

