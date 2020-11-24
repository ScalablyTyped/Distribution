package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transcript extends js.Object {
  
  /**
    * The S3 object location of the redacted transcript. Use this URI to access the redacted transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var RedactedTranscriptFileUri: js.UndefOr[Uri] = js.native
  
  /**
    * The S3 object location of the transcript. Use this URI to access the transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.native
}
object Transcript {
  
  @scala.inline
  def apply(): Transcript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transcript]
  }
  
  @scala.inline
  implicit class TranscriptOps[Self <: Transcript] (val x: Self) extends AnyVal {
    
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
    def setRedactedTranscriptFileUri(value: Uri): Self = this.set("RedactedTranscriptFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactedTranscriptFileUri: Self = this.set("RedactedTranscriptFileUri", js.undefined)
    
    @scala.inline
    def setTranscriptFileUri(value: Uri): Self = this.set("TranscriptFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscriptFileUri: Self = this.set("TranscriptFileUri", js.undefined)
  }
}
