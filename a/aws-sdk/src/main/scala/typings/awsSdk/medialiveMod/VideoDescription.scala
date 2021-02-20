package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoDescription extends StObject {
  
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
    * Indicates how MediaLive will respond to the AFD values that might be in the input video. If you do not know what AFD signaling is, or if your downstream system has not given you guidance, choose PASSTHROUGH.
  RESPOND: MediaLive clips the input video using a formula that uses the AFD values (configured in afdSignaling ), the input display aspect ratio, and the output display aspect ratio. MediaLive also includes the AFD values in the output, unless the codec for this encode is FRAME_CAPTURE.
  PASSTHROUGH: MediaLive ignores the AFD values and does not clip the video. But MediaLive does include the values in the output.
  NONE: MediaLive does not clip the input video and does not include the AFD values in the output
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
  def apply(Name: string): VideoDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDescription]
  }
  
  @scala.inline
  implicit class VideoDescriptionMutableBuilder[Self <: VideoDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecSettings(value: VideoCodecSettings): Self = StObject.set(x, "CodecSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecSettingsUndefined: Self = StObject.set(x, "CodecSettings", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondToAfd(value: VideoDescriptionRespondToAfd): Self = StObject.set(x, "RespondToAfd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondToAfdUndefined: Self = StObject.set(x, "RespondToAfd", js.undefined)
    
    @scala.inline
    def setScalingBehavior(value: VideoDescriptionScalingBehavior): Self = StObject.set(x, "ScalingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingBehaviorUndefined: Self = StObject.set(x, "ScalingBehavior", js.undefined)
    
    @scala.inline
    def setSharpness(value: integerMin0Max100): Self = StObject.set(x, "Sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharpnessUndefined: Self = StObject.set(x, "Sharpness", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
