package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicalTranscriptionSetting extends StObject {
  
  /**
    * Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the transcription output of each channel into a single transcription. Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel, including the start time and end time of the item and alternative transcriptions of item. The alternative transcriptions also come with confidence scores provided by Amazon Transcribe Medical. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException 
    */
  var ChannelIdentification: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of alternatives that you tell the service to return. If you specify the MaxAlternatives field, you must set the ShowAlternatives field to true.
    */
  var MaxAlternatives: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxAlternatives] = js.undefined
  
  /**
    * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this number, multiple speakers are identified as a single speaker. If you specify the MaxSpeakerLabels field, you must set the ShowSpeakerLabels field to true.
    */
  var MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined
  
  /**
    * Determines whether alternative transcripts are generated along with the transcript that has the highest confidence. If you set ShowAlternatives field to true, you must also set the maximum number of alternatives to return in the MaxAlternatives field.
    */
  var ShowAlternatives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the transcription job uses speaker recognition to identify different speakers in the input audio. Speaker recognition labels individual speakers in the audio file. If you set the ShowSpeakerLabels field to true, you must also set the maximum number of speaker labels in the MaxSpeakerLabels field. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ShowSpeakerLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the vocabulary to use when processing a medical transcription job.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.undefined
}
object MedicalTranscriptionSetting {
  
  @scala.inline
  def apply(): MedicalTranscriptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscriptionSetting]
  }
  
  @scala.inline
  implicit class MedicalTranscriptionSettingMutableBuilder[Self <: MedicalTranscriptionSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelIdentification(value: Boolean): Self = StObject.set(x, "ChannelIdentification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdentificationUndefined: Self = StObject.set(x, "ChannelIdentification", js.undefined)
    
    @scala.inline
    def setMaxAlternatives(value: MaxAlternatives): Self = StObject.set(x, "MaxAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAlternativesUndefined: Self = StObject.set(x, "MaxAlternatives", js.undefined)
    
    @scala.inline
    def setMaxSpeakerLabels(value: MaxSpeakers): Self = StObject.set(x, "MaxSpeakerLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeakerLabelsUndefined: Self = StObject.set(x, "MaxSpeakerLabels", js.undefined)
    
    @scala.inline
    def setShowAlternatives(value: Boolean): Self = StObject.set(x, "ShowAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAlternativesUndefined: Self = StObject.set(x, "ShowAlternatives", js.undefined)
    
    @scala.inline
    def setShowSpeakerLabels(value: Boolean): Self = StObject.set(x, "ShowSpeakerLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSpeakerLabelsUndefined: Self = StObject.set(x, "ShowSpeakerLabels", js.undefined)
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
