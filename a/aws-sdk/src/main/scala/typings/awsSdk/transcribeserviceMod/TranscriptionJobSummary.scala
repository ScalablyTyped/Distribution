package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranscriptionJobSummary extends js.Object {
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.native
  /**
    * The content redaction settings of the transcription job.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.transcribeserviceMod.ContentRedaction] = js.native
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.native
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * Indicates the location of the output of the transcription job. If the value is CUSTOMER_BUCKET then the location is the S3 bucket specified in the outputBucketName field when the transcription job was started with the StartTranscriptionJob operation. If the value is SERVICE_BUCKET then the output is stored by Amazon Transcribe and can be retrieved using the URI in the GetTranscriptionJob response's TranscriptFileUri field.
    */
  var OutputLocationType: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputLocationType] = js.native
  /**
    * A timestamp that shows when the job started processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobName] = js.native
  /**
    * The status of the transcription job. When the status is COMPLETED, use the GetTranscriptionJob operation to get the results of the transcription.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
}

object TranscriptionJobSummary {
  @scala.inline
  def apply(): TranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJobSummary]
  }
  @scala.inline
  implicit class TranscriptionJobSummaryOps[Self <: TranscriptionJobSummary] (val x: Self) extends AnyVal {
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
    def setCompletionTime(value: DateTime): Self = this.set("CompletionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionTime: Self = this.set("CompletionTime", js.undefined)
    @scala.inline
    def setContentRedaction(value: ContentRedaction): Self = this.set("ContentRedaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentRedaction: Self = this.set("ContentRedaction", js.undefined)
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setOutputLocationType(value: OutputLocationType): Self = this.set("OutputLocationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocationType: Self = this.set("OutputLocationType", js.undefined)
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = this.set("TranscriptionJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscriptionJobName: Self = this.set("TranscriptionJobName", js.undefined)
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = this.set("TranscriptionJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscriptionJobStatus: Self = this.set("TranscriptionJobStatus", js.undefined)
  }
  
}

