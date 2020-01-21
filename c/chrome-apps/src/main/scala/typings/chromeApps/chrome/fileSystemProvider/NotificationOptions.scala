package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.AnonCHANGED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CHANGED
import typings.chromeApps.chromeAppsStrings.DELETED
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  /**
    * The type of the change which happened to the observed entry.
    * If it is DELETED, then the observed entry will be automatically
    * removed from the list of observed entries.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[AnonCHANGED, String, Exclude[String, CHANGED | DELETED]]
  /** List of changes to entries within the observed directory (including the entry itself)  */
  var changes: js.UndefOr[js.Array[NotificationChange]] = js.undefined
  /** The identifier of the file system related to this change. */
  var fileSystemId: String
  /** The path of the observed entry. */
  var observedPath: String
  /** Mode of the observed entry. */
  var recursive: Boolean
  /**
    * Tag for the notification.
    * Required if the file system was mounted with the supportsNotifyTag option.
    * Note, that this flag is necessary to provide notifications about changes
    * which changed even when the system was shutdown.
    */
  var tag: js.UndefOr[String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    changeType: ToStringLiteral[AnonCHANGED, String, Exclude[String, CHANGED | DELETED]],
    fileSystemId: String,
    observedPath: String,
    recursive: Boolean,
    changes: js.Array[NotificationChange] = null,
    tag: String = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], observedPath = observedPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

