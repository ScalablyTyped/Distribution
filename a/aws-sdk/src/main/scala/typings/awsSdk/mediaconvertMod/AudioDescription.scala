package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioDescription extends StObject {
  
  /**
    * When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L), Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center (C) by default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec must be AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.
    */
  var AudioChannelTaggingSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AudioChannelTaggingSettings] = js.native
  
  /**
    * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
    */
  var AudioNormalizationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AudioNormalizationSettings] = js.native
  
  /**
    * Specifies which audio data to use from each input. In the simplest case, specify an "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
    */
  var AudioSourceName: js.UndefOr[string] = js.native
  
  /**
    * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired Commentary, 4-255 = Reserved.
    */
  var AudioType: js.UndefOr[integerMin0Max255] = js.native
  
  /**
    * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
    */
  var AudioTypeControl: js.UndefOr[typings.awsSdk.mediaconvertMod.AudioTypeControl] = js.native
  
  /**
    * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio encoding. The settings in this group vary depending on the value that you choose for Audio codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3, Mp3Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS, Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS, OpusSettings
    */
  var CodecSettings: js.UndefOr[AudioCodecSettings] = js.native
  
  /**
    * Specify the language for this audio output track. The service puts this language code into your output audio track when you set Language code control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED). The service also uses your specified custom language code when you set Language code control (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a language code. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
    */
  var CustomLanguageCode: js.UndefOr[stringPatternAZaZ23AZaZ] = js.native
  
  /**
    * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.mediaconvertMod.LanguageCode] = js.native
  
  /**
    * Specify which source for language code takes precedence for this audio track. When you choose Follow input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code on the input track, the service uses the code that you specify in the setting Language code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you specify.
    */
  var LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl] = js.native
  
  /**
    * Advanced audio remixing settings.
    */
  var RemixSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.RemixSettings] = js.native
  
  /**
    * Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for display on the end-viewer's player device. For outputs in other output groups, the service ignores this setting.
    */
  var StreamName: js.UndefOr[stringPatternWS] = js.native
}
object AudioDescription {
  
  @scala.inline
  def apply(): AudioDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioDescription]
  }
  
  @scala.inline
  implicit class AudioDescriptionMutableBuilder[Self <: AudioDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioChannelTaggingSettings(value: AudioChannelTaggingSettings): Self = StObject.set(x, "AudioChannelTaggingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioChannelTaggingSettingsUndefined: Self = StObject.set(x, "AudioChannelTaggingSettings", js.undefined)
    
    @scala.inline
    def setAudioNormalizationSettings(value: AudioNormalizationSettings): Self = StObject.set(x, "AudioNormalizationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioNormalizationSettingsUndefined: Self = StObject.set(x, "AudioNormalizationSettings", js.undefined)
    
    @scala.inline
    def setAudioSourceName(value: string): Self = StObject.set(x, "AudioSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSourceNameUndefined: Self = StObject.set(x, "AudioSourceName", js.undefined)
    
    @scala.inline
    def setAudioType(value: integerMin0Max255): Self = StObject.set(x, "AudioType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTypeControl(value: AudioTypeControl): Self = StObject.set(x, "AudioTypeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTypeControlUndefined: Self = StObject.set(x, "AudioTypeControl", js.undefined)
    
    @scala.inline
    def setAudioTypeUndefined: Self = StObject.set(x, "AudioType", js.undefined)
    
    @scala.inline
    def setCodecSettings(value: AudioCodecSettings): Self = StObject.set(x, "CodecSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecSettingsUndefined: Self = StObject.set(x, "CodecSettings", js.undefined)
    
    @scala.inline
    def setCustomLanguageCode(value: stringPatternAZaZ23AZaZ): Self = StObject.set(x, "CustomLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLanguageCodeUndefined: Self = StObject.set(x, "CustomLanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeControl(value: AudioLanguageCodeControl): Self = StObject.set(x, "LanguageCodeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeControlUndefined: Self = StObject.set(x, "LanguageCodeControl", js.undefined)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setRemixSettings(value: RemixSettings): Self = StObject.set(x, "RemixSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemixSettingsUndefined: Self = StObject.set(x, "RemixSettings", js.undefined)
    
    @scala.inline
    def setStreamName(value: stringPatternWS): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
