package typings
package chromeLib.chromeNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontName extends js.Object {
  /** The display name of the font. */
  var displayName: java.lang.String
  /** The font ID. */
  var fontId: java.lang.String
}

object FontName {
  @scala.inline
  def apply(displayName: java.lang.String, fontId: java.lang.String): FontName = {
    val __obj = js.Dynamic.literal(displayName = displayName, fontId = fontId)
  
    __obj.asInstanceOf[FontName]
  }
}

