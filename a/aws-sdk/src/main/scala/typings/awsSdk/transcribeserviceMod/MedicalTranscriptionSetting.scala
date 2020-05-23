package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedicalTranscriptionSetting extends js.Object {
  /**
    * Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the transcription output of each channel into a single transcription. Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel, including the start time and end time of the item and alternative transcriptions of item. The alternative transcriptions also come with confidence scores provided by Amazon Transcribe Medical. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException 
    */
  var ChannelIdentification: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of alternatives that you tell the service to return. If you specify the MaxAlternatives field, you must set the ShowAlternatives field to true.
    */
  var MaxAlternatives: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxAlternatives] = js.native
  /**
    * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this number, multiple speakers are identified as a single speaker. If you specify the MaxSpeakerLabels field, you must set the ShowSpeakerLabels field to true.
    */
  var MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.native
  /**
    * Determines whether alternative transcripts are generated along with the transcript that has the highest confidence. If you set ShowAlternatives field to true, you must also set the maximum number of alternatives to return in the MaxAlternatives field.
    */
  var ShowAlternatives: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the transcription job uses speaker recognition to identify different speakers in the input audio. Speaker recongition labels individual speakers in the audio file. If you set the ShowSpeakerLabels field to true, you must also set the maximum number of speaker labels in the MaxSpeakerLabels field. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ShowSpeakerLabels: js.UndefOr[Boolean] = js.native
  /**
    * The name of the vocabulary to use when processing a medical transcription job.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.native
}

object MedicalTranscriptionSetting {
  @scala.inline
  def apply(
    ChannelIdentification: js.UndefOr[Boolean] = js.undefined,
    MaxAlternatives: js.UndefOr[MaxAlternatives] = js.undefined,
    MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined,
    ShowAlternatives: js.UndefOr[Boolean] = js.undefined,
    ShowSpeakerLabels: js.UndefOr[Boolean] = js.undefined,
    VocabularyName: VocabularyName = null
  ): MedicalTranscriptionSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ChannelIdentification)) __obj.updateDynamic("ChannelIdentification")(ChannelIdentification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxAlternatives)) __obj.updateDynamic("MaxAlternatives")(MaxAlternatives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxSpeakerLabels)) __obj.updateDynamic("MaxSpeakerLabels")(MaxSpeakerLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowAlternatives)) __obj.updateDynamic("ShowAlternatives")(ShowAlternatives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowSpeakerLabels)) __obj.updateDynamic("ShowSpeakerLabels")(ShowSpeakerLabels.get.asInstanceOf[js.Any])
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicalTranscriptionSetting]
  }
}

