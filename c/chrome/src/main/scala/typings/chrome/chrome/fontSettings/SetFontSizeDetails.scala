package typings.chrome.chrome.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFontSizeDetails extends js.Object {
  /** The font size in pixels. */
  var pixelSize: Double
}

object SetFontSizeDetails {
  @scala.inline
  def apply(pixelSize: Double): SetFontSizeDetails = {
    val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontSizeDetails]
  }
}

