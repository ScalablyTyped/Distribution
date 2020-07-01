package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputTemplate extends js.Object {
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
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.native
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

object InputTemplate {
  @scala.inline
  def apply(
    AudioSelectorGroups: mapOfAudioSelectorGroup = null,
    AudioSelectors: mapOfAudioSelector = null,
    CaptionSelectors: mapOfCaptionSelector = null,
    Crop: Rectangle = null,
    DeblockFilter: InputDeblockFilter = null,
    DenoiseFilter: InputDenoiseFilter = null,
    FilterEnable: InputFilterEnable = null,
    FilterStrength: js.UndefOr[integerMinNegative5Max5] = js.undefined,
    ImageInserter: ImageInserter = null,
    InputClippings: listOfInputClipping = null,
    Position: Rectangle = null,
    ProgramNumber: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    PsiControl: InputPsiControl = null,
    TimecodeSource: InputTimecodeSource = null,
    TimecodeStart: stringMin11Max11Pattern01D20305D205D = null,
    VideoSelector: VideoSelector = null
  ): InputTemplate = {
    val __obj = js.Dynamic.literal()
    if (AudioSelectorGroups != null) __obj.updateDynamic("AudioSelectorGroups")(AudioSelectorGroups.asInstanceOf[js.Any])
    if (AudioSelectors != null) __obj.updateDynamic("AudioSelectors")(AudioSelectors.asInstanceOf[js.Any])
    if (CaptionSelectors != null) __obj.updateDynamic("CaptionSelectors")(CaptionSelectors.asInstanceOf[js.Any])
    if (Crop != null) __obj.updateDynamic("Crop")(Crop.asInstanceOf[js.Any])
    if (DeblockFilter != null) __obj.updateDynamic("DeblockFilter")(DeblockFilter.asInstanceOf[js.Any])
    if (DenoiseFilter != null) __obj.updateDynamic("DenoiseFilter")(DenoiseFilter.asInstanceOf[js.Any])
    if (FilterEnable != null) __obj.updateDynamic("FilterEnable")(FilterEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(FilterStrength)) __obj.updateDynamic("FilterStrength")(FilterStrength.get.asInstanceOf[js.Any])
    if (ImageInserter != null) __obj.updateDynamic("ImageInserter")(ImageInserter.asInstanceOf[js.Any])
    if (InputClippings != null) __obj.updateDynamic("InputClippings")(InputClippings.asInstanceOf[js.Any])
    if (Position != null) __obj.updateDynamic("Position")(Position.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgramNumber)) __obj.updateDynamic("ProgramNumber")(ProgramNumber.get.asInstanceOf[js.Any])
    if (PsiControl != null) __obj.updateDynamic("PsiControl")(PsiControl.asInstanceOf[js.Any])
    if (TimecodeSource != null) __obj.updateDynamic("TimecodeSource")(TimecodeSource.asInstanceOf[js.Any])
    if (TimecodeStart != null) __obj.updateDynamic("TimecodeStart")(TimecodeStart.asInstanceOf[js.Any])
    if (VideoSelector != null) __obj.updateDynamic("VideoSelector")(VideoSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTemplate]
  }
}

