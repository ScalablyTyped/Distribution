package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticImageActivateScheduleActionSettings extends js.Object {
  
  /**
    * The duration in milliseconds for the image to remain on the video. If omitted or set to 0 the duration is unlimited and the image will remain until it is explicitly deactivated.
    */
  var Duration: js.UndefOr[integerMin0] = js.native
  
  /**
    * The time in milliseconds for the image to fade in. The fade-in starts at the start time of the overlay. Default is 0 (no fade-in).
    */
  var FadeIn: js.UndefOr[integerMin0] = js.native
  
  /**
    * Applies only if a duration is specified. The time in milliseconds for the image to fade out. The fade-out starts when the duration time is hit, so it effectively extends the duration. Default is 0 (no fade-out).
    */
  var FadeOut: js.UndefOr[integerMin0] = js.native
  
  /**
    * The height of the image when inserted into the video, in pixels. The overlay will be scaled up or down to the specified height. Leave blank to use the native height of the overlay.
    */
  var Height: js.UndefOr[integerMin1] = js.native
  
  /**
    * The location and filename of the image file to overlay on the video. The file must be a 32-bit BMP, PNG, or TGA file, and must not be larger (in pixels) than the input video.
    */
  var Image: InputLocation = js.native
  
  /**
    * Placement of the left edge of the overlay relative to the left edge of the video frame, in pixels. 0 (the default) is the left edge of the frame. If the placement causes the overlay to extend beyond the right edge of the underlying video, then the overlay is cropped on the right.
    */
  var ImageX: js.UndefOr[integerMin0] = js.native
  
  /**
    * Placement of the top edge of the overlay relative to the top edge of the video frame, in pixels. 0 (the default) is the top edge of the frame. If the placement causes the overlay to extend beyond the bottom edge of the underlying video, then the overlay is cropped on the bottom.
    */
  var ImageY: js.UndefOr[integerMin0] = js.native
  
  /**
    * The number of the layer, 0 to 7. There are 8 layers that can be overlaid on the video, each layer with a different image. The layers are in Z order, which means that overlays with higher values of layer are inserted on top of overlays with lower values of layer. Default is 0.
    */
  var Layer: js.UndefOr[integerMin0Max7] = js.native
  
  /**
    * Opacity of image where 0 is transparent and 100 is fully opaque. Default is 100.
    */
  var Opacity: js.UndefOr[integerMin0Max100] = js.native
  
  /**
    * The width of the image when inserted into the video, in pixels. The overlay will be scaled up or down to the specified width. Leave blank to use the native width of the overlay.
    */
  var Width: js.UndefOr[integerMin1] = js.native
}
object StaticImageActivateScheduleActionSettings {
  
  @scala.inline
  def apply(Image: InputLocation): StaticImageActivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticImageActivateScheduleActionSettings]
  }
  
  @scala.inline
  implicit class StaticImageActivateScheduleActionSettingsOps[Self <: StaticImageActivateScheduleActionSettings] (val x: Self) extends AnyVal {
    
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
    def setImage(value: InputLocation): Self = this.set("Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: integerMin0): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setFadeIn(value: integerMin0): Self = this.set("FadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeIn: Self = this.set("FadeIn", js.undefined)
    
    @scala.inline
    def setFadeOut(value: integerMin0): Self = this.set("FadeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeOut: Self = this.set("FadeOut", js.undefined)
    
    @scala.inline
    def setHeight(value: integerMin1): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("Height", js.undefined)
    
    @scala.inline
    def setImageX(value: integerMin0): Self = this.set("ImageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageX: Self = this.set("ImageX", js.undefined)
    
    @scala.inline
    def setImageY(value: integerMin0): Self = this.set("ImageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageY: Self = this.set("ImageY", js.undefined)
    
    @scala.inline
    def setLayer(value: integerMin0Max7): Self = this.set("Layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("Layer", js.undefined)
    
    @scala.inline
    def setOpacity(value: integerMin0Max100): Self = this.set("Opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("Opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: integerMin1): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
  }
}
