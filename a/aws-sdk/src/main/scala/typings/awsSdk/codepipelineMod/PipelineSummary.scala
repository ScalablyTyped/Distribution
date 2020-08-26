package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSummary extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[PipelineName] = js.native
  /**
    * The date and time of the last update to the pipeline, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.native
  /**
    * The version number of the pipeline.
    */
  var version: js.UndefOr[PipelineVersion] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setName(value: PipelineName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUpdated(value: Timestamp): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setVersion(value: PipelineVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

