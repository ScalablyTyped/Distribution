package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationChange extends js.Object {
  /** The type of the change which happened to the entry. */
  var changeType: java.lang.String
  /** The path of the changed entry. */
  var entryPath: java.lang.String
}

object NotificationChange {
  @scala.inline
  def apply(changeType: java.lang.String, entryPath: java.lang.String): NotificationChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeType")(changeType)
    __obj.updateDynamic("entryPath")(entryPath)
    __obj.asInstanceOf[NotificationChange]
  }
}

