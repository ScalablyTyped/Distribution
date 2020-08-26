package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelinePauseStateSettings extends js.Object {
  /**
    * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
    */
  var PipelineId: typings.awsSdk.medialiveMod.PipelineId = js.native
}

object PipelinePauseStateSettings {
  @scala.inline
  def apply(PipelineId: PipelineId): PipelinePauseStateSettings = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelinePauseStateSettings]
  }
  @scala.inline
  implicit class PipelinePauseStateSettingsOps[Self <: PipelinePauseStateSettings] (val x: Self) extends AnyVal {
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
    def setPipelineId(value: PipelineId): Self = this.set("PipelineId", value.asInstanceOf[js.Any])
  }
  
}

