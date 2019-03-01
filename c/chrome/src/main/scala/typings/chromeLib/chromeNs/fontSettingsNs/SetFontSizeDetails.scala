package typings
package chromeLib.chromeNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFontSizeDetails extends js.Object {
  /** The font size in pixels. */
  var pixelSize: scala.Double
}

object SetFontSizeDetails {
  @scala.inline
  def apply(pixelSize: scala.Double): SetFontSizeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pixelSize")(pixelSize)
    __obj.asInstanceOf[SetFontSizeDetails]
  }
}

