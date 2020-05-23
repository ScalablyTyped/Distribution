package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertableImage extends js.Object {
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
  def apply(
    Duration: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    FadeIn: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    FadeOut: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    Height: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    ImageInserterInput: stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA = null,
    ImageX: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    ImageY: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    Layer: js.UndefOr[integerMin0Max99] = js.undefined,
    Opacity: js.UndefOr[integerMin0Max100] = js.undefined,
    StartTime: stringPattern01D20305D205D = null,
    Width: js.UndefOr[integerMin0Max2147483647] = js.undefined
  ): InsertableImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FadeIn)) __obj.updateDynamic("FadeIn")(FadeIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FadeOut)) __obj.updateDynamic("FadeOut")(FadeOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height.get.asInstanceOf[js.Any])
    if (ImageInserterInput != null) __obj.updateDynamic("ImageInserterInput")(ImageInserterInput.asInstanceOf[js.Any])
    if (!js.isUndefined(ImageX)) __obj.updateDynamic("ImageX")(ImageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ImageY)) __obj.updateDynamic("ImageY")(ImageY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Layer)) __obj.updateDynamic("Layer")(Layer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Opacity)) __obj.updateDynamic("Opacity")(Opacity.get.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertableImage]
  }
}

