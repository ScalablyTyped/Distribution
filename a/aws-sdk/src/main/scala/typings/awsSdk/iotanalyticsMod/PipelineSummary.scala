package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSummary extends js.Object {
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * When the pipeline was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.native
}

object PipelineSummary {
  @scala.inline
  def apply(): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineSummary]
  }
  @scala.inline
  implicit class PipelineSummaryOps[Self <: PipelineSummary] (val x: Self) extends AnyVal {
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
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineName: Self = this.set("pipelineName", js.undefined)
    @scala.inline
    def setReprocessingSummariesVarargs(value: ReprocessingSummary*): Self = this.set("reprocessingSummaries", js.Array(value :_*))
    @scala.inline
    def setReprocessingSummaries(value: ReprocessingSummaries): Self = this.set("reprocessingSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReprocessingSummaries: Self = this.set("reprocessingSummaries", js.undefined)
  }
  
}

