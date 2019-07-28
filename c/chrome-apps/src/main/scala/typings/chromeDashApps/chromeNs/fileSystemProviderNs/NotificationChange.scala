package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.Anon_CHANGED
import typings.chromeDashApps.chromeDashAppsStrings.CHANGED
import typings.chromeDashApps.chromeDashAppsStrings.DELETED
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationChange extends js.Object {
  /**
    * The type of the change which happened to the entry.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[Anon_CHANGED, String, Exclude[String, CHANGED | DELETED]]
  /** The path of the changed entry. */
  var entryPath: String
}

object NotificationChange {
  @scala.inline
  def apply(
    changeType: ToStringLiteral[Anon_CHANGED, String, Exclude[String, CHANGED | DELETED]],
    entryPath: String
  ): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath)
  
    __obj.asInstanceOf[NotificationChange]
  }
}

