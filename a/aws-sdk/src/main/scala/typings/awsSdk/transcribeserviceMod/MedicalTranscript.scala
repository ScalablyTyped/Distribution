package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedicalTranscript extends js.Object {
  /**
    * The S3 object location of the medical transcript. Use this URI to access the medical transcript. This URI points to the S3 bucket you created to store the medical transcript.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.native
}

object MedicalTranscript {
  @scala.inline
  def apply(TranscriptFileUri: Uri = null): MedicalTranscript = {
    val __obj = js.Dynamic.literal()
    if (TranscriptFileUri != null) __obj.updateDynamic("TranscriptFileUri")(TranscriptFileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicalTranscript]
  }
}

