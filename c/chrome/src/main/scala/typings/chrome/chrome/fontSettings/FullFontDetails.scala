package typings.chrome.chrome.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullFontDetails extends js.Object {
  /** The font ID. See the description in getFont. */
  var fontId: String
  /** The generic font family for which the font setting has changed. */
  var genericFamily: String
  /** The level of control this extension has over the setting. */
  var levelOfControl: String
  /** Optional. The script code for which the font setting has changed.  */
  var script: js.UndefOr[String] = js.undefined
}

object FullFontDetails {
  @scala.inline
  def apply(fontId: String, genericFamily: String, levelOfControl: String, script: String = null): FullFontDetails = {
    val __obj = js.Dynamic.literal(fontId = fontId, genericFamily = genericFamily, levelOfControl = levelOfControl)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[FullFontDetails]
  }
}

