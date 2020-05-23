package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoDescription extends js.Object {
  /**
    * Video codec settings.
    */
  var CodecSettings: js.UndefOr[VideoCodecSettings] = js.native
  /**
    * Output video height, in pixels. Must be an even number. For most codecs, you can leave this field and width blank in order to use the height and width (resolution) from the source. Note, however, that leaving blank is not recommended. For the Frame Capture codec, height and width are required.
    */
  var Height: js.UndefOr[integer] = js.native
  /**
    * The name of this VideoDescription. Outputs will use this name to uniquely identify this Description.  Description names should be unique within this Live Event.
    */
  var Name: string = js.native
  /**
    * Indicates how to respond to the AFD values in the input stream. RESPOND causes input video to be clipped, depending on the AFD value, input display aspect ratio, and output display aspect ratio, and (except for FRAME_CAPTURE codec) includes the values in the output. PASSTHROUGH (does not apply to FRAME_CAPTURE codec) ignores the AFD values and includes the values in the output, so input video is not clipped. NONE ignores the AFD values and does not include the values through to the output, so input video is not clipped.
    */
  var RespondToAfd: js.UndefOr[VideoDescriptionRespondToAfd] = js.native
  /**
    * STRETCH_TO_OUTPUT configures the output position to stretch the video to the specified output resolution (height and width). This option will override any position value. DEFAULT may insert black boxes (pillar boxes or letter boxes) around the video to provide the specified output resolution.
    */
  var ScalingBehavior: js.UndefOr[VideoDescriptionScalingBehavior] = js.native
  /**
    * Changes the strength of the anti-alias filter used for scaling. 0 is the softest setting, 100 is the sharpest. A setting of 50 is recommended for most content.
    */
  var Sharpness: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Output video width, in pixels. Must be an even number. For most codecs, you can leave this field and height blank in order to use the height and width (resolution) from the source. Note, however, that leaving blank is not recommended. For the Frame Capture codec, height and width are required.
    */
  var Width: js.UndefOr[integer] = js.native
}

object VideoDescription {
  @scala.inline
  def apply(
    Name: string,
    CodecSettings: VideoCodecSettings = null,
    Height: js.UndefOr[integer] = js.undefined,
    RespondToAfd: VideoDescriptionRespondToAfd = null,
    ScalingBehavior: VideoDescriptionScalingBehavior = null,
    Sharpness: js.UndefOr[integerMin0Max100] = js.undefined,
    Width: js.UndefOr[integer] = js.undefined
  ): VideoDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (CodecSettings != null) __obj.updateDynamic("CodecSettings")(CodecSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height.get.asInstanceOf[js.Any])
    if (RespondToAfd != null) __obj.updateDynamic("RespondToAfd")(RespondToAfd.asInstanceOf[js.Any])
    if (ScalingBehavior != null) __obj.updateDynamic("ScalingBehavior")(ScalingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(Sharpness)) __obj.updateDynamic("Sharpness")(Sharpness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDescription]
  }
}

