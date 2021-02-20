package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  /**
    * Instructs Amazon Transcribe to process each audio channel separately and then merge the transcription output of each channel into a single transcription.  Amazon Transcribe also produces a transcription of each item detected on an audio channel, including the start time and end time of the item and alternative transcriptions of the item including the confidence that Amazon Transcribe has in the transcription. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ChannelIdentification: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of alternative transcriptions that the service should return. If you specify the MaxAlternatives field, you must set the ShowAlternatives field to true.
    */
  var MaxAlternatives: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxAlternatives] = js.native
  
  /**
    * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this number, multiple speakers are identified as a single speaker. If you specify the MaxSpeakerLabels field, you must set the ShowSpeakerLabels field to true.
    */
  var MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.native
  
  /**
    * Determines whether the transcription contains alternative transcriptions. If you set the ShowAlternatives field to true, you must also set the maximum number of alternatives to return in the MaxAlternatives field.
    */
  var ShowAlternatives: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the transcription job uses speaker recognition to identify different speakers in the input audio. Speaker recognition labels individual speakers in the audio file. If you set the ShowSpeakerLabels field to true, you must also set the maximum number of speaker labels MaxSpeakerLabels field. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ShowSpeakerLabels: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as placeholder text. Set to remove to remove filtered text from the transcript without using placeholder text.
    */
  var VocabularyFilterMethod: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilterMethod] = js.native
  
  /**
    * The name of the vocabulary filter to use when transcribing the audio. The filter that you specify must have the same language code as the transcription job.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilterName] = js.native
  
  /**
    * The name of a vocabulary to use when processing the transcription job.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setVocabularyFilterMethod(value: VocabularyFilterMethod): Self = StObject.set(x, "VocabularyFilterMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterMethodUndefined: Self = StObject.set(x, "VocabularyFilterMethod", js.undefined)
    
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
