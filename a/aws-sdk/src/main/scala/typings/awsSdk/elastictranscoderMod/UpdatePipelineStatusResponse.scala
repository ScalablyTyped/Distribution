package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineStatusResponse extends js.Object {
  /**
    * A section of the response body that provides information about the pipeline.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.elastictranscoderMod.Pipeline] = js.native
}

object UpdatePipelineStatusResponse {
  @scala.inline
  def apply(): UpdatePipelineStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineStatusResponse]
  }
  @scala.inline
  implicit class UpdatePipelineStatusResponseOps[Self <: UpdatePipelineStatusResponse] (val x: Self) extends AnyVal {
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
    def setPipeline(value: Pipeline): Self = this.set("Pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipeline: Self = this.set("Pipeline", js.undefined)
  }
  
}

