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
}

