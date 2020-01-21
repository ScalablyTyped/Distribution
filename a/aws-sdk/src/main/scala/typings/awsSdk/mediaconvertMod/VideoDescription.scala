package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoDescription extends js.Object {
  /**
    * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
    */
  var AfdSignaling: js.UndefOr[typings.awsSdk.mediaconvertMod.AfdSignaling] = js.native
  /**
    * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
    */
  var AntiAlias: js.UndefOr[typings.awsSdk.mediaconvertMod.AntiAlias] = js.native
  /**
    * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * FRAME_CAPTURE, FrameCaptureSettings * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings
    */
  var CodecSettings: js.UndefOr[VideoCodecSettings] = js.native
  /**
    * Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
    */
  var ColorMetadata: js.UndefOr[typings.awsSdk.mediaconvertMod.ColorMetadata] = js.native
  /**
    * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame.
    */
  var Crop: js.UndefOr[Rectangle] = js.native
  /**
    * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
    */
  var DropFrameTimecode: js.UndefOr[typings.awsSdk.mediaconvertMod.DropFrameTimecode] = js.native
  /**
    * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit AFD value which the service will write on all  frames of this video output.
    */
  var FixedAfd: js.UndefOr[integerMin0Max15] = js.native
  /**
    * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you don't provide a value here, the service will use the input height.
    */
  var Height: js.UndefOr[integerMin32Max8192] = js.native
  /**
    * Use Selection placement (position) to define the video area in your output frame. The area outside of the rectangle that you specify here is black.
    */
  var Position: js.UndefOr[Rectangle] = js.native
  /**
    * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
    */
  var RespondToAfd: js.UndefOr[typings.awsSdk.mediaconvertMod.RespondToAfd] = js.native
  /**
    * Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
    */
  var ScalingBehavior: js.UndefOr[typings.awsSdk.mediaconvertMod.ScalingBehavior] = js.native
  /**
    * Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width of the anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
    */
  var Sharpness: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
    */
  var TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion] = js.native
  /**
    * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
    */
  var VideoPreprocessors: js.UndefOr[VideoPreprocessor] = js.native
  /**
    * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value here, the service will use the input width.
    */
  var Width: js.UndefOr[integerMin32Max8192] = js.native
}

object VideoDescription {
  @scala.inline
  def apply(
    AfdSignaling: AfdSignaling = null,
    AntiAlias: AntiAlias = null,
    CodecSettings: VideoCodecSettings = null,
    ColorMetadata: ColorMetadata = null,
    Crop: Rectangle = null,
    DropFrameTimecode: DropFrameTimecode = null,
    FixedAfd: Int | Double = null,
    Height: Int | Double = null,
    Position: Rectangle = null,
    RespondToAfd: RespondToAfd = null,
    ScalingBehavior: ScalingBehavior = null,
    Sharpness: Int | Double = null,
    TimecodeInsertion: VideoTimecodeInsertion = null,
    VideoPreprocessors: VideoPreprocessor = null,
    Width: Int | Double = null
  ): VideoDescription = {
    val __obj = js.Dynamic.literal()
    if (AfdSignaling != null) __obj.updateDynamic("AfdSignaling")(AfdSignaling.asInstanceOf[js.Any])
    if (AntiAlias != null) __obj.updateDynamic("AntiAlias")(AntiAlias.asInstanceOf[js.Any])
    if (CodecSettings != null) __obj.updateDynamic("CodecSettings")(CodecSettings.asInstanceOf[js.Any])
    if (ColorMetadata != null) __obj.updateDynamic("ColorMetadata")(ColorMetadata.asInstanceOf[js.Any])
    if (Crop != null) __obj.updateDynamic("Crop")(Crop.asInstanceOf[js.Any])
    if (DropFrameTimecode != null) __obj.updateDynamic("DropFrameTimecode")(DropFrameTimecode.asInstanceOf[js.Any])
    if (FixedAfd != null) __obj.updateDynamic("FixedAfd")(FixedAfd.asInstanceOf[js.Any])
    if (Height != null) __obj.updateDynamic("Height")(Height.asInstanceOf[js.Any])
    if (Position != null) __obj.updateDynamic("Position")(Position.asInstanceOf[js.Any])
    if (RespondToAfd != null) __obj.updateDynamic("RespondToAfd")(RespondToAfd.asInstanceOf[js.Any])
    if (ScalingBehavior != null) __obj.updateDynamic("ScalingBehavior")(ScalingBehavior.asInstanceOf[js.Any])
    if (Sharpness != null) __obj.updateDynamic("Sharpness")(Sharpness.asInstanceOf[js.Any])
    if (TimecodeInsertion != null) __obj.updateDynamic("TimecodeInsertion")(TimecodeInsertion.asInstanceOf[js.Any])
    if (VideoPreprocessors != null) __obj.updateDynamic("VideoPreprocessors")(VideoPreprocessors.asInstanceOf[js.Any])
    if (Width != null) __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDescription]
  }
}

