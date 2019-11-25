package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureVisibleTabOptions extends js.Object {
  /**
    * Optional. The format of an image.
    * One of: "jpeg", or "png"
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * When format is "jpeg", controls the quality of the resulting image. This value is ignored for PNG images. As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store it will decrease.
    */
  var quality: js.UndefOr[Double] = js.undefined
}

object CaptureVisibleTabOptions {
  @scala.inline
  def apply(format: String = null, quality: Int | Double = null): CaptureVisibleTabOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureVisibleTabOptions]
  }
}

