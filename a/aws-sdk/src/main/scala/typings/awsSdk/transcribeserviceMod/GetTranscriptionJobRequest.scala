package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptionJobRequest extends js.Object {
  /**
    * The name of the job.
    */
  var TranscriptionJobName: typings.awsSdk.transcribeserviceMod.TranscriptionJobName = js.native
}

object GetTranscriptionJobRequest {
  @scala.inline
  def apply(TranscriptionJobName: TranscriptionJobName): GetTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptionJobRequest]
  }
  @scala.inline
  implicit class GetTranscriptionJobRequestOps[Self <: GetTranscriptionJobRequest] (val x: Self) extends AnyVal {
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
    def setTranscriptionJobName(value: TranscriptionJobName): Self = this.set("TranscriptionJobName", value.asInstanceOf[js.Any])
  }
  
}

