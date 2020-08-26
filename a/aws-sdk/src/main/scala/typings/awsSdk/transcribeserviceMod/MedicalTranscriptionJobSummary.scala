package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedicalTranscriptionJobSummary extends js.Object {
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.native
  /**
    * A timestamp that shows when the medical transcription job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.native
  /**
    * The language of the transcript in the source audio file.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The name of a medical transcription job.
    */
  var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.native
  /**
    * Indicates the location of the transcription job's output. The CUSTOMER_BUCKET is the S3 location provided in the OutputBucketName field when the 
    */
  var OutputLocationType: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputLocationType] = js.native
  /**
    * The medical specialty of the transcription job. Primary care is the only valid value.
    */
  var Specialty: js.UndefOr[typings.awsSdk.transcribeserviceMod.Specialty] = js.native
  /**
    * A timestamp that shows when the job began processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The status of the medical transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
  /**
    * The speech of the clinician in the input audio.
    */
  var Type: js.UndefOr[typings.awsSdk.transcribeserviceMod.Type] = js.native
}

object MedicalTranscriptionJobSummary {
  @scala.inline
  def apply(): MedicalTranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscriptionJobSummary]
  }
  @scala.inline
  implicit class MedicalTranscriptionJobSummaryOps[Self <: MedicalTranscriptionJobSummary] (val x: Self) extends AnyVal {
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
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = this.set("MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedicalTranscriptionJobName: Self = this.set("MedicalTranscriptionJobName", js.undefined)
    @scala.inline
    def setOutputLocationType(value: OutputLocationType): Self = this.set("OutputLocationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocationType: Self = this.set("OutputLocationType", js.undefined)
    @scala.inline
    def setSpecialty(value: Specialty): Self = this.set("Specialty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialty: Self = this.set("Specialty", js.undefined)
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = this.set("TranscriptionJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscriptionJobStatus: Self = this.set("TranscriptionJobStatus", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

