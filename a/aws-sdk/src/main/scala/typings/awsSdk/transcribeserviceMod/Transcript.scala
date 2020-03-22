package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transcript extends js.Object {
  /**
    * The S3 object location of the redacted transcript. Use this URI to access the redacated transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var RedactedTranscriptFileUri: js.UndefOr[Uri] = js.native
  /**
    * The S3 object location of the the transcript. Use this URI to access the transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.native
}

object Transcript {
  @scala.inline
  def apply(RedactedTranscriptFileUri: Uri = null, TranscriptFileUri: Uri = null): Transcript = {
    val __obj = js.Dynamic.literal()
    if (RedactedTranscriptFileUri != null) __obj.updateDynamic("RedactedTranscriptFileUri")(RedactedTranscriptFileUri.asInstanceOf[js.Any])
    if (TranscriptFileUri != null) __obj.updateDynamic("TranscriptFileUri")(TranscriptFileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transcript]
  }
}

