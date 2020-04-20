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
}

