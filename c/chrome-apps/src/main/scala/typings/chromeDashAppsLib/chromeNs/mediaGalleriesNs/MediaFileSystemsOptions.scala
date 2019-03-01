package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFileSystemsOptions extends js.Object {
  /**
    * Whether to prompt the user for permission to additional media galleries before returning
    * the permitted set. Default is silent. If the value 'yes' is passed, or if the application
    * has not been granted access to any media galleries and the value 'if_needed' is passed,
    * then the media gallery configuration dialog will be displayed.
    *
    * **no**
    * Do not act interactively.
    * **yes**
    * Ask the user to manage permitted media galleries.
    * **if_needed**
    * Ask the user to manage permitted galleries only if the return set would otherwise be empty.
    */
  var interactive: js.UndefOr[Interactive] = js.undefined
}

object MediaFileSystemsOptions {
  @scala.inline
  def apply(interactive: Interactive = null): MediaFileSystemsOptions = {
    val __obj = js.Dynamic.literal()
    if (interactive != null) __obj.updateDynamic("interactive")(interactive)
    __obj.asInstanceOf[MediaFileSystemsOptions]
  }
}

