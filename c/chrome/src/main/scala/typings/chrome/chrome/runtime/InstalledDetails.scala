package typings.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledDetails extends js.Object {
  /**
    * Optional.
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @since Chrome 29.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  /**
    * The reason that this event is being dispatched.
    * One of: "install", "update", "chrome_update", or "shared_module_update"
    */
  var reason: String
}

object InstalledDetails {
  @scala.inline
  def apply(reason: String, id: String = null, previousVersion: String = null): InstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason)
    if (id != null) __obj.updateDynamic("id")(id)
    if (previousVersion != null) __obj.updateDynamic("previousVersion")(previousVersion)
    __obj.asInstanceOf[InstalledDetails]
  }
}

