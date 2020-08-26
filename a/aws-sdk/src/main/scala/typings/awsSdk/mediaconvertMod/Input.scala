package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
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
    stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFM
  ] = js.native
  /**
    * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
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
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
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
    def setAudioSelectorGroups(value: mapOfAudioSelectorGroup): Self = this.set("AudioSelectorGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioSelectorGroups: Self = this.set("AudioSelectorGroups", js.undefined)
    @scala.inline
    def setAudioSelectors(value: mapOfAudioSelector): Self = this.set("AudioSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioSelectors: Self = this.set("AudioSelectors", js.undefined)
    @scala.inline
    def setCaptionSelectors(value: mapOfCaptionSelector): Self = this.set("CaptionSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionSelectors: Self = this.set("CaptionSelectors", js.undefined)
    @scala.inline
    def setCrop(value: Rectangle): Self = this.set("Crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("Crop", js.undefined)
    @scala.inline
    def setDeblockFilter(value: InputDeblockFilter): Self = this.set("DeblockFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeblockFilter: Self = this.set("DeblockFilter", js.undefined)
    @scala.inline
    def setDecryptionSettings(value: InputDecryptionSettings): Self = this.set("DecryptionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecryptionSettings: Self = this.set("DecryptionSettings", js.undefined)
    @scala.inline
    def setDenoiseFilter(value: InputDenoiseFilter): Self = this.set("DenoiseFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDenoiseFilter: Self = this.set("DenoiseFilter", js.undefined)
    @scala.inline
    def setFileInput(
      value: stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFM
    ): Self = this.set("FileInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileInput: Self = this.set("FileInput", js.undefined)
    @scala.inline
    def setFilterEnable(value: InputFilterEnable): Self = this.set("FilterEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterEnable: Self = this.set("FilterEnable", js.undefined)
    @scala.inline
    def setFilterStrength(value: integerMinNegative5Max5): Self = this.set("FilterStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterStrength: Self = this.set("FilterStrength", js.undefined)
    @scala.inline
    def setImageInserter(value: ImageInserter): Self = this.set("ImageInserter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageInserter: Self = this.set("ImageInserter", js.undefined)
    @scala.inline
    def setInputClippingsVarargs(value: InputClipping*): Self = this.set("InputClippings", js.Array(value :_*))
    @scala.inline
    def setInputClippings(value: listOfInputClipping): Self = this.set("InputClippings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClippings: Self = this.set("InputClippings", js.undefined)
    @scala.inline
    def setPosition(value: Rectangle): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("Position", js.undefined)
    @scala.inline
    def setProgramNumber(value: integerMin1Max2147483647): Self = this.set("ProgramNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramNumber: Self = this.set("ProgramNumber", js.undefined)
    @scala.inline
    def setPsiControl(value: InputPsiControl): Self = this.set("PsiControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePsiControl: Self = this.set("PsiControl", js.undefined)
    @scala.inline
    def setSupplementalImpsVarargs(value: stringPatternS3ASSETMAPXml*): Self = this.set("SupplementalImps", js.Array(value :_*))
    @scala.inline
    def setSupplementalImps(value: listOfStringPatternS3ASSETMAPXml): Self = this.set("SupplementalImps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupplementalImps: Self = this.set("SupplementalImps", js.undefined)
    @scala.inline
    def setTimecodeSource(value: InputTimecodeSource): Self = this.set("TimecodeSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimecodeSource: Self = this.set("TimecodeSource", js.undefined)
    @scala.inline
    def setTimecodeStart(value: stringMin11Max11Pattern01D20305D205D): Self = this.set("TimecodeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimecodeStart: Self = this.set("TimecodeStart", js.undefined)
    @scala.inline
    def setVideoSelector(value: VideoSelector): Self = this.set("VideoSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSelector: Self = this.set("VideoSelector", js.undefined)
  }
  
}

