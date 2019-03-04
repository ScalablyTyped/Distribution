package typings
package chromeLib.chromeNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontDetails extends js.Object {
  /** The generic font family for the font. */
  var genericFamily: java.lang.String
  /** Optional. The script for the font. If omitted, the global script font setting is affected.  */
  var script: js.UndefOr[java.lang.String] = js.undefined
}

object FontDetails {
  @scala.inline
  def apply(genericFamily: java.lang.String, script: java.lang.String = null): FontDetails = {
    val __obj = js.Dynamic.literal(genericFamily = genericFamily)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[FontDetails]
  }
}

