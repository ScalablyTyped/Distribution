package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedicalTranscriptionJob extends js.Object {
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.native
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed. The FailureReason field contains one of the following values:    Unsupported media format- The media format specified in the MediaFormat field of the request isn't valid. See the description of the MediaFormat field for a list of valid values.    The media format provided does not match the detected media format- The media format of the audio file doesn't match the format specified in the MediaFormat field in the request. Check the media format of your media file and make sure the two values match.    Invalid sample rate for audio file- The sample rate specified in the MediaSampleRateHertz of the request isn't valid. The sample rate must be between 8000 and 48000 Hertz.    The sample rate provided does not match the detected sample rate- The sample rate in the audio file doesn't match the sample rate specified in the MediaSampleRateHertz field in the request. Check the sample rate of your media file and make sure that the two values match.    Invalid file size: file size too large- The size of your audio file is larger than what Amazon Transcribe Medical can process. For more information, see Guidlines and Quotas in the Amazon Transcribe Medical Guide     Invalid number of channels: number of channels too large- Your audio contains more channels than Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon Transcribe Medical Endpoints and Quotas in the Amazon Web Services General Reference   
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.native
  /**
    * The language code for the language spoken in the source audio file. US English (en-US) is the only supported language for medical transcriptions. Any other value you enter for language code results in a BadRequestException error.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  var Media: js.UndefOr[typings.awsSdk.transcribeserviceMod.Media] = js.native
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  /**
    * The sample rate, in Hertz, of the source audio containing medical information. If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave the MediaSampleHertz blank and let Amazon Transcribe Medical determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  /**
    * The name for a given medical transcription job.
    */
  var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.native
  /**
    * Object that contains object.
    */
  var Settings: js.UndefOr[MedicalTranscriptionSetting] = js.native
  /**
    * The medical specialty of any clinicians providing a dictation or having a conversation. PRIMARYCARE is the only available setting for this object. This specialty enables you to generate transcriptions for the following medical fields:   Family Medicine  
    */
  var Specialty: js.UndefOr[typings.awsSdk.transcribeserviceMod.Specialty] = js.native
  /**
    * A timestamp that shows when the job started processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * An object that contains the MedicalTranscript. The MedicalTranscript contains the TranscriptFileUri.
    */
  var Transcript: js.UndefOr[MedicalTranscript] = js.native
  /**
    * The completion status of a medical transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
  /**
    * The type of speech in the transcription job. CONVERSATION is generally used for patient-physician dialogues. DICTATION is the setting for physicians speaking their notes after seeing a patient. For more information, see how-it-works-med 
    */
  var Type: js.UndefOr[typings.awsSdk.transcribeserviceMod.Type] = js.native
}

object MedicalTranscriptionJob {
  @scala.inline
  def apply(
    CompletionTime: DateTime = null,
    CreationTime: DateTime = null,
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    Media: Media = null,
    MediaFormat: MediaFormat = null,
    MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
    MedicalTranscriptionJobName: TranscriptionJobName = null,
    Settings: MedicalTranscriptionSetting = null,
    Specialty: Specialty = null,
    StartTime: DateTime = null,
    Transcript: MedicalTranscript = null,
    TranscriptionJobStatus: TranscriptionJobStatus = null,
    Type: Type = null
  ): MedicalTranscriptionJob = {
    val __obj = js.Dynamic.literal()
    if (CompletionTime != null) __obj.updateDynamic("CompletionTime")(CompletionTime.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (Media != null) __obj.updateDynamic("Media")(Media.asInstanceOf[js.Any])
    if (MediaFormat != null) __obj.updateDynamic("MediaFormat")(MediaFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(MediaSampleRateHertz)) __obj.updateDynamic("MediaSampleRateHertz")(MediaSampleRateHertz.get.asInstanceOf[js.Any])
    if (MedicalTranscriptionJobName != null) __obj.updateDynamic("MedicalTranscriptionJobName")(MedicalTranscriptionJobName.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (Specialty != null) __obj.updateDynamic("Specialty")(Specialty.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Transcript != null) __obj.updateDynamic("Transcript")(Transcript.asInstanceOf[js.Any])
    if (TranscriptionJobStatus != null) __obj.updateDynamic("TranscriptionJobStatus")(TranscriptionJobStatus.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicalTranscriptionJob]
  }
}

