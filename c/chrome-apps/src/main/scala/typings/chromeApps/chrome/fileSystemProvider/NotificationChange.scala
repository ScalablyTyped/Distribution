package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.AnonCHANGED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CHANGED
import typings.chromeApps.chromeAppsStrings.DELETED
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationChange extends js.Object {
  /**
    * The type of the change which happened to the entry.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[AnonCHANGED, CHANGED | DELETED, Exclude[CHANGED | DELETED, CHANGED | DELETED]]
  /** The path of the changed entry. */
  var entryPath: String
}

object NotificationChange {
  @scala.inline
  def apply(
    changeType: ToStringLiteral[AnonCHANGED, CHANGED | DELETED, Exclude[CHANGED | DELETED, CHANGED | DELETED]],
    entryPath: String
  ): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChange]
  }
}

