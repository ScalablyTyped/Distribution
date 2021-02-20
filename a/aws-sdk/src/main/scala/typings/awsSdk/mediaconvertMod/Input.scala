package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends StObject {
  
  /**
    * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
    */
  var AudioSelectorGroups: js.UndefOr[mapOfAudioSelectorGroup] = js.native
  
  /**
    * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use multiple Audio selectors per input.
    */
  var AudioSelectors: js.UndefOr[mapOfAudioSelector] = js.native
  
  /**
    * Use captions selectors to specify the captions data from your input that you use in your outputs. You can use up to 20 captions selectors per input.
    */
  var CaptionSelectors: js.UndefOr[mapOfCaptionSelector] = js.native
  
  /**
    * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame. If you specify a value here, it will override any value that you specify in the output setting Cropping selection (crop).
    */
  var Crop: js.UndefOr[Rectangle] = js.native
  
  /**
    * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manually controllable for MPEG2 and uncompressed video inputs.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.native
  
  /**
    * Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your content.
    */
  var DecryptionSettings: js.UndefOr[InputDecryptionSettings] = js.native
  
  /**
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.native
  
  /**
    * Specify the source file for your transcoding job. You can use multiple inputs in a single job. The service concatenates these inputs, in the order that you specify them in the job, to create the outputs. If your input format is IMF, specify your input by providing the path to your CPL. For example, "s3://bucket/vf/cpl.xml". If the CPL is in an incomplete IMP, make sure to use *Supplemental IMPs* (SupplementalImps) to specify any supplemental IMPs that contain assets referenced by the CPL.
    */
  var FileInput: js.UndefOr[
    stringPatternS3MM2PPMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEE
  ] = js.native
  
  /**
    * Specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The input is filtered regardless of input type.
    */
  var FilterEnable: js.UndefOr[InputFilterEnable] = js.native
  
  /**
    * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The range is -5 to 5. Default is 0.
    */
  var FilterStrength: js.UndefOr[integerMinNegative5Max5] = js.native
  
  /**
    * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typings.awsSdk.mediaconvertMod.ImageInserter] = js.native
  
  /**
    * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If you provide only an end time, it will be the entire input up to that point. When you specify more than one input clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify them.
    */
  var InputClippings: js.UndefOr[listOfInputClipping] = js.native
  
  /**
    * When you have a progressive segmented frame (PsF) input, use this setting to flag the input as PsF. MediaConvert doesn't automatically detect PsF. Therefore, flagging your input as PsF results in better preservation of video quality when you do deinterlacing and frame rate conversion. If you don't specify, the default value is Auto (AUTO). Auto is the correct setting for all inputs that are not PsF. Don't set this value to PsF when your input is interlaced. Doing so creates horizontal interlacing artifacts.
    */
  var InputScanType: js.UndefOr[typings.awsSdk.mediaconvertMod.InputScanType] = js.native
  
  /**
    * Use Selection placement (position) to define the video area in your output frame. The area outside of the rectangle that you specify here is black. If you specify a value here, it will override any value that you specify in the output setting Selection placement (position). If you specify a value here, this will override any AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If you specify a value here, this will ignore anything that you specify for the setting Scaling Behavior (scalingBehavior).
    */
  var Position: js.UndefOr[Rectangle] = js.native
  
  /**
    * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you specify doesn't exist, the transcoding service will use this default.
    */
  var ProgramNumber: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
    */
  var PsiControl: js.UndefOr[InputPsiControl] = js.native
  
  /**
    * Provide a list of any necessary supplemental IMPs. You need supplemental IMPs if the CPL that you're using for your input is in an incomplete IMP. Specify either the supplemental IMP directories with a trailing slash or the ASSETMAP.xml files. For example ["s3://bucket/ov/", "s3://bucket/vf2/ASSETMAP.xml"]. You don't need to specify the IMP that contains your input CPL, because the service automatically detects it.
    */
  var SupplementalImps: js.UndefOr[listOfStringPatternS3ASSETMAPXml] = js.native
  
  /**
    * Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  var TimecodeSource: js.UndefOr[InputTimecodeSource] = js.native
  
  /**
    * Specify the timecode that you want the service to use for this input's initial frame. To use this setting, you must set the Timecode source setting, located under the input settings (InputTimecodeSource), to Specified start (SPECIFIEDSTART). For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  var TimecodeStart: js.UndefOr[stringMin11Max11Pattern01D20305D205D] = js.native
  
  /**
    * Selector for video.
    */
  var VideoSelector: js.UndefOr[typings.awsSdk.mediaconvertMod.VideoSelector] = js.native
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioSelectorGroups(value: mapOfAudioSelectorGroup): Self = StObject.set(x, "AudioSelectorGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSelectorGroupsUndefined: Self = StObject.set(x, "AudioSelectorGroups", js.undefined)
    
    @scala.inline
    def setAudioSelectors(value: mapOfAudioSelector): Self = StObject.set(x, "AudioSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSelectorsUndefined: Self = StObject.set(x, "AudioSelectors", js.undefined)
    
    @scala.inline
    def setCaptionSelectors(value: mapOfCaptionSelector): Self = StObject.set(x, "CaptionSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionSelectorsUndefined: Self = StObject.set(x, "CaptionSelectors", js.undefined)
    
    @scala.inline
    def setCrop(value: Rectangle): Self = StObject.set(x, "Crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "Crop", js.undefined)
    
    @scala.inline
    def setDeblockFilter(value: InputDeblockFilter): Self = StObject.set(x, "DeblockFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeblockFilterUndefined: Self = StObject.set(x, "DeblockFilter", js.undefined)
    
    @scala.inline
    def setDecryptionSettings(value: InputDecryptionSettings): Self = StObject.set(x, "DecryptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecryptionSettingsUndefined: Self = StObject.set(x, "DecryptionSettings", js.undefined)
    
    @scala.inline
    def setDenoiseFilter(value: InputDenoiseFilter): Self = StObject.set(x, "DenoiseFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenoiseFilterUndefined: Self = StObject.set(x, "DenoiseFilter", js.undefined)
    
    @scala.inline
    def setFileInput(
      value: stringPatternS3MM2PPMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEE
    ): Self = StObject.set(x, "FileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputUndefined: Self = StObject.set(x, "FileInput", js.undefined)
    
    @scala.inline
    def setFilterEnable(value: InputFilterEnable): Self = StObject.set(x, "FilterEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEnableUndefined: Self = StObject.set(x, "FilterEnable", js.undefined)
    
    @scala.inline
    def setFilterStrength(value: integerMinNegative5Max5): Self = StObject.set(x, "FilterStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterStrengthUndefined: Self = StObject.set(x, "FilterStrength", js.undefined)
    
    @scala.inline
    def setImageInserter(value: ImageInserter): Self = StObject.set(x, "ImageInserter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageInserterUndefined: Self = StObject.set(x, "ImageInserter", js.undefined)
    
    @scala.inline
    def setInputClippings(value: listOfInputClipping): Self = StObject.set(x, "InputClippings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClippingsUndefined: Self = StObject.set(x, "InputClippings", js.undefined)
    
    @scala.inline
    def setInputClippingsVarargs(value: InputClipping*): Self = StObject.set(x, "InputClippings", js.Array(value :_*))
    
    @scala.inline
    def setInputScanType(value: InputScanType): Self = StObject.set(x, "InputScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputScanTypeUndefined: Self = StObject.set(x, "InputScanType", js.undefined)
    
    @scala.inline
    def setPosition(value: Rectangle): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    @scala.inline
    def setProgramNumber(value: integerMin1Max2147483647): Self = StObject.set(x, "ProgramNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramNumberUndefined: Self = StObject.set(x, "ProgramNumber", js.undefined)
    
    @scala.inline
    def setPsiControl(value: InputPsiControl): Self = StObject.set(x, "PsiControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPsiControlUndefined: Self = StObject.set(x, "PsiControl", js.undefined)
    
    @scala.inline
    def setSupplementalImps(value: listOfStringPatternS3ASSETMAPXml): Self = StObject.set(x, "SupplementalImps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalImpsUndefined: Self = StObject.set(x, "SupplementalImps", js.undefined)
    
    @scala.inline
    def setSupplementalImpsVarargs(value: stringPatternS3ASSETMAPXml*): Self = StObject.set(x, "SupplementalImps", js.Array(value :_*))
    
    @scala.inline
    def setTimecodeSource(value: InputTimecodeSource): Self = StObject.set(x, "TimecodeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeSourceUndefined: Self = StObject.set(x, "TimecodeSource", js.undefined)
    
    @scala.inline
    def setTimecodeStart(value: stringMin11Max11Pattern01D20305D205D): Self = StObject.set(x, "TimecodeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeStartUndefined: Self = StObject.set(x, "TimecodeStart", js.undefined)
    
    @scala.inline
    def setVideoSelector(value: VideoSelector): Self = StObject.set(x, "VideoSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSelectorUndefined: Self = StObject.set(x, "VideoSelector", js.undefined)
  }
}
