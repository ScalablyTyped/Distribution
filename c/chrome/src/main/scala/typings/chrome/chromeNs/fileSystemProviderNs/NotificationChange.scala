package typings.chrome.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationChange extends js.Object {
  /** The type of the change which happened to the entry. */
  var changeType: String
  /** The path of the changed entry. */
  var entryPath: String
}

object NotificationChange {
  @scala.inline
  def apply(changeType: String, entryPath: String): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType, entryPath = entryPath)
  
    __obj.asInstanceOf[NotificationChange]
  }
}

