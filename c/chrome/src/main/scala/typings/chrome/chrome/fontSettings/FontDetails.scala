package typings.chrome.chrome.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontDetails extends js.Object {
  /** The generic font family for the font. */
  var genericFamily: String
  /** Optional. The script for the font. If omitted, the global script font setting is affected.  */
  var script: js.UndefOr[String] = js.undefined
}

object FontDetails {
  @scala.inline
  def apply(genericFamily: String, script: String = null): FontDetails = {
    val __obj = js.Dynamic.literal(genericFamily = genericFamily.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDetails]
  }
}

