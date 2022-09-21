package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSelector extends StObject {
  
  /**
    * Apply audio timing corrections to help synchronize audio and video in your output. To apply timing corrections, your input must meet the following requirements: * Container: MP4, or MOV, with an accurate time-to-sample (STTS) table. * Audio track: AAC. Choose from the following audio timing correction settings: * Disabled (Default): Apply no correction. * Auto: Recommended for most inputs. MediaConvert analyzes the audio timing in your input and determines which correction setting to use, if needed. * Track: Adjust the duration of each audio frame by a constant amount to align the audio track length with STTS duration. Track-level correction does not affect pitch, and is recommended for tonal audio content such as music. * Frame: Adjust the duration of each audio frame by a variable amount to align audio frames with STTS timestamps. No corrections are made to already-aligned frames. Frame-level correction may affect the pitch of corrected frames, and is recommended for atonal audio content such as speech or percussion.
    */
  var AudioDurationCorrection: js.UndefOr[typings.awsSdk.mediaconvertMod.AudioDurationCorrection] = js.undefined
  
  /**
    * Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3 three-letter language code
    */
  var CustomLanguageCode: js.UndefOr[stringMin3Max3PatternAZaZ3] = js.undefined
  
  /**
    * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
    */
  var DefaultSelection: js.UndefOr[AudioDefaultSelection] = js.undefined
  
  /**
    * Specifies audio data from an external file source.
    */
  var ExternalAudioFileInput: js.UndefOr[
    stringPatternS3MM2PPWWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaAHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDII
  ] = js.undefined
  
  /**
    * Settings specific to audio sources in an HLS alternate rendition group. Specify the properties (renditionGroupId, renditionName or renditionLanguageCode) to identify the unique audio track among the alternative rendition groups present in the HLS manifest. If no unique track is found, or multiple tracks match the properties provided, the job fails. If no properties in hlsRenditionGroupSettings are specified, the default audio track within the video segment is chosen. If there is no audio within video segment, the alternative audio with DEFAULT=YES is chosen instead.
    */
  var HlsRenditionGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.HlsRenditionGroupSettings] = js.undefined
  
  /**
    * Selects a specific language code from within an audio source.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.mediaconvertMod.LanguageCode] = js.undefined
  
  /**
    * Specifies a time delta in milliseconds to offset the audio from the input video.
    */
  var Offset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
    */
  var Pids: js.UndefOr[listOfIntegerMin1Max2147483647] = js.undefined
  
  /**
    * Use this setting for input streams that contain Dolby E, to have the service extract specific program data from the track. To select multiple programs, create multiple selectors with the same Track and different Program numbers. In the console, this setting is visible when you set Selector type to Track. Choose the program number from the dropdown list. If you are sending a JSON file, provide the program ID, which is part of the audio metadata. If your input file has incorrect metadata, you can choose All channels instead of a program number to have the service ignore the program IDs and include all the programs in the track.
    */
  var ProgramSelection: js.UndefOr[integerMin0Max8] = js.undefined
  
  /**
    * Use these settings to reorder the audio channels of one input to match those of another input. This allows you to combine the two files into a single output, one after the other.
    */
  var RemixSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.RemixSettings] = js.undefined
  
  /**
    * Specifies the type of the audio selector.
    */
  var SelectorType: js.UndefOr[AudioSelectorType] = js.undefined
  
  /**
    * Identify a track from the input audio to include in this selector by entering the track index number. To include several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job file, provide the track numbers in an array. For example, "tracks": [1,2,3].
    */
  var Tracks: js.UndefOr[listOfIntegerMin1Max2147483647] = js.undefined
}
object AudioSelector {
  
  inline def apply(): AudioSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelector]
  }
  
  extension [Self <: AudioSelector](x: Self) {
    
    inline def setAudioDurationCorrection(value: AudioDurationCorrection): Self = StObject.set(x, "AudioDurationCorrection", value.asInstanceOf[js.Any])
    
    inline def setAudioDurationCorrectionUndefined: Self = StObject.set(x, "AudioDurationCorrection", js.undefined)
    
    inline def setCustomLanguageCode(value: stringMin3Max3PatternAZaZ3): Self = StObject.set(x, "CustomLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCustomLanguageCodeUndefined: Self = StObject.set(x, "CustomLanguageCode", js.undefined)
    
    inline def setDefaultSelection(value: AudioDefaultSelection): Self = StObject.set(x, "DefaultSelection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectionUndefined: Self = StObject.set(x, "DefaultSelection", js.undefined)
    
    inline def setExternalAudioFileInput(
      value: stringPatternS3MM2PPWWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaAHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDII
    ): Self = StObject.set(x, "ExternalAudioFileInput", value.asInstanceOf[js.Any])
    
    inline def setExternalAudioFileInputUndefined: Self = StObject.set(x, "ExternalAudioFileInput", js.undefined)
    
    inline def setHlsRenditionGroupSettings(value: HlsRenditionGroupSettings): Self = StObject.set(x, "HlsRenditionGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsRenditionGroupSettingsUndefined: Self = StObject.set(x, "HlsRenditionGroupSettings", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
    
    inline def setPids(value: listOfIntegerMin1Max2147483647): Self = StObject.set(x, "Pids", value.asInstanceOf[js.Any])
    
    inline def setPidsUndefined: Self = StObject.set(x, "Pids", js.undefined)
    
    inline def setPidsVarargs(value: integerMin1Max2147483647*): Self = StObject.set(x, "Pids", js.Array(value*))
    
    inline def setProgramSelection(value: integerMin0Max8): Self = StObject.set(x, "ProgramSelection", value.asInstanceOf[js.Any])
    
    inline def setProgramSelectionUndefined: Self = StObject.set(x, "ProgramSelection", js.undefined)
    
    inline def setRemixSettings(value: RemixSettings): Self = StObject.set(x, "RemixSettings", value.asInstanceOf[js.Any])
    
    inline def setRemixSettingsUndefined: Self = StObject.set(x, "RemixSettings", js.undefined)
    
    inline def setSelectorType(value: AudioSelectorType): Self = StObject.set(x, "SelectorType", value.asInstanceOf[js.Any])
    
    inline def setSelectorTypeUndefined: Self = StObject.set(x, "SelectorType", js.undefined)
    
    inline def setTracks(value: listOfIntegerMin1Max2147483647): Self = StObject.set(x, "Tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "Tracks", js.undefined)
    
    inline def setTracksVarargs(value: integerMin1Max2147483647*): Self = StObject.set(x, "Tracks", js.Array(value*))
  }
}
