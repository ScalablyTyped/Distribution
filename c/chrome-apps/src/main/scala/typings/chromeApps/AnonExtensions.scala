package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensions extends js.Object {
  var extensions: js.UndefOr[js.Array[Asterisk | String | AnonIncludedirectories]] = js.undefined
  /** File types to handle */
  var types: js.UndefOr[js.Array[Asterisk | String | AnonIncludedirectories]] = js.undefined
}

object AnonExtensions {
  @scala.inline
  def apply(
    extensions: js.Array[Asterisk | String | AnonIncludedirectories] = null,
    types: js.Array[Asterisk | String | AnonIncludedirectories] = null
  ): AnonExtensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensions]
  }
}

