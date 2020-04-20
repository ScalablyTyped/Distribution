package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningImageFormat extends js.Object {
  /**
    * The default format of a code signing image.
    */
  var defaultFormat: ImageFormat = js.native
  /**
    * The supported formats of a code signing image.
    */
  var supportedFormats: ImageFormats = js.native
}

object SigningImageFormat {
  @scala.inline
  def apply(defaultFormat: ImageFormat, supportedFormats: ImageFormats): SigningImageFormat = {
    val __obj = js.Dynamic.literal(defaultFormat = defaultFormat.asInstanceOf[js.Any], supportedFormats = supportedFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningImageFormat]
  }
}

