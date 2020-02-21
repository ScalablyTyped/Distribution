package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailBlanking extends js.Object {
  /**
    * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var AvailBlankingImage: js.UndefOr[stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG] = js.native
}

object AvailBlanking {
  @scala.inline
  def apply(AvailBlankingImage: stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG = null): AvailBlanking = {
    val __obj = js.Dynamic.literal()
    if (AvailBlankingImage != null) __obj.updateDynamic("AvailBlankingImage")(AvailBlankingImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailBlanking]
  }
}

