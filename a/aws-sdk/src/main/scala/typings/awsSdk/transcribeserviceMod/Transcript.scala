package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transcript extends js.Object {
  /**
    * The location where the transcription is stored. Use this URI to access the transcription. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcription in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.native
}

object Transcript {
  @scala.inline
  def apply(TranscriptFileUri: Uri = null): Transcript = {
    val __obj = js.Dynamic.literal()
    if (TranscriptFileUri != null) __obj.updateDynamic("TranscriptFileUri")(TranscriptFileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transcript]
  }
}

