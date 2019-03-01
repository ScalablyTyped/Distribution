package typings
package chromeLib.chromeNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultFontSizeDetails extends js.Object {
  /** The font size in pixels. */
  var pixelSize: scala.Double
}

object DefaultFontSizeDetails {
  @scala.inline
  def apply(pixelSize: scala.Double): DefaultFontSizeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pixelSize")(pixelSize)
    __obj.asInstanceOf[DefaultFontSizeDetails]
  }
}

