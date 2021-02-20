package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertableImage extends StObject {
  
  /**
    * Specify the time, in milliseconds, for the image to remain on the output video. This duration includes fade-in time but not fade-out time.
    */
  var Duration: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Specify the length of time, in milliseconds, between the Start time that you specify for the image insertion and the time that the image appears at full opacity. Full opacity is the level that you specify for the opacity setting. If you don't specify a value for Fade-in, the image will appear abruptly at the overlay start time.
    */
  var FadeIn: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Specify the length of time, in milliseconds, between the end of the time that you have specified for the image overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a value for Fade-out, the image will disappear abruptly at the end of the inserted image duration.
    */
  var FadeOut: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Specify the height of the inserted image in pixels. If you specify a value that's larger than the video resolution height, the service will crop your overlaid image to fit. To use the native height of the image, keep this setting blank.
    */
  var Height: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Specify the HTTP, HTTPS, or Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
    */
  var ImageInserterInput: js.UndefOr[stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA] = js.native
  
  /**
    * Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required for any image overlay that you specify.
    */
  var ImageX: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required for any image overlay that you specify.
    */
  var ImageY: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of images with lower values for Layer.
    */
  var Layer: js.UndefOr[integerMin0Max99] = js.native
  
  /**
    * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is transparent and 100 is fully opaque. Default is 50.
    */
  var Opacity: js.UndefOr[integerMin0Max100] = js.native
  
  /**
    * Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
    */
  var StartTime: js.UndefOr[stringPattern01D20305D205D] = js.native
  
  /**
    * Specify the width of the inserted image in pixels. If you specify a value that's larger than the video resolution width, the service will crop your overlaid image to fit. To use the native width of the image, keep this setting blank.
    */
  var Width: js.UndefOr[integerMin0Max2147483647] = js.native
}
object InsertableImage {
  
  @scala.inline
  def apply(): InsertableImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertableImage]
  }
  
  @scala.inline
  implicit class InsertableImageMutableBuilder[Self <: InsertableImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: integerMin0Max2147483647): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setFadeIn(value: integerMin0Max2147483647): Self = StObject.set(x, "FadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeInUndefined: Self = StObject.set(x, "FadeIn", js.undefined)
    
    @scala.inline
    def setFadeOut(value: integerMin0Max2147483647): Self = StObject.set(x, "FadeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeOutUndefined: Self = StObject.set(x, "FadeOut", js.undefined)
    
    @scala.inline
    def setHeight(value: integerMin0Max2147483647): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    @scala.inline
    def setImageInserterInput(value: stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA): Self = StObject.set(x, "ImageInserterInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageInserterInputUndefined: Self = StObject.set(x, "ImageInserterInput", js.undefined)
    
    @scala.inline
    def setImageX(value: integerMin0Max2147483647): Self = StObject.set(x, "ImageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageXUndefined: Self = StObject.set(x, "ImageX", js.undefined)
    
    @scala.inline
    def setImageY(value: integerMin0Max2147483647): Self = StObject.set(x, "ImageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageYUndefined: Self = StObject.set(x, "ImageY", js.undefined)
    
    @scala.inline
    def setLayer(value: integerMin0Max99): Self = StObject.set(x, "Layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "Layer", js.undefined)
    
    @scala.inline
    def setOpacity(value: integerMin0Max100): Self = StObject.set(x, "Opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "Opacity", js.undefined)
    
    @scala.inline
    def setStartTime(value: stringPattern01D20305D205D): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setWidth(value: integerMin0Max2147483647): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
