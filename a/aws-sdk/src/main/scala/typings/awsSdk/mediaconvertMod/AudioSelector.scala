package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSelector extends StObject {
  
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
    stringPatternS3MM2PPWWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVV
  ] = js.undefined
  
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
  
  @scala.inline
  def apply(): AudioSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelector]
  }
  
  @scala.inline
  implicit class AudioSelectorMutableBuilder[Self <: AudioSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomLanguageCode(value: stringMin3Max3PatternAZaZ3): Self = StObject.set(x, "CustomLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLanguageCodeUndefined: Self = StObject.set(x, "CustomLanguageCode", js.undefined)
    
    @scala.inline
    def setDefaultSelection(value: AudioDefaultSelection): Self = StObject.set(x, "DefaultSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectionUndefined: Self = StObject.set(x, "DefaultSelection", js.undefined)
    
    @scala.inline
    def setExternalAudioFileInput(
      value: stringPatternS3MM2PPWWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVV
    ): Self = StObject.set(x, "ExternalAudioFileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAudioFileInputUndefined: Self = StObject.set(x, "ExternalAudioFileInput", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
    
    @scala.inline
    def setPids(value: listOfIntegerMin1Max2147483647): Self = StObject.set(x, "Pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidsUndefined: Self = StObject.set(x, "Pids", js.undefined)
    
    @scala.inline
    def setPidsVarargs(value: integerMin1Max2147483647*): Self = StObject.set(x, "Pids", js.Array(value :_*))
    
    @scala.inline
    def setProgramSelection(value: integerMin0Max8): Self = StObject.set(x, "ProgramSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramSelectionUndefined: Self = StObject.set(x, "ProgramSelection", js.undefined)
    
    @scala.inline
    def setRemixSettings(value: RemixSettings): Self = StObject.set(x, "RemixSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemixSettingsUndefined: Self = StObject.set(x, "RemixSettings", js.undefined)
    
    @scala.inline
    def setSelectorType(value: AudioSelectorType): Self = StObject.set(x, "SelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTypeUndefined: Self = StObject.set(x, "SelectorType", js.undefined)
    
    @scala.inline
    def setTracks(value: listOfIntegerMin1Max2147483647): Self = StObject.set(x, "Tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "Tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: integerMin1Max2147483647*): Self = StObject.set(x, "Tracks", js.Array(value :_*))
  }
}
