package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  /** The type of the change which happened to the observed entry. If it is DELETED, then the observed entry will be automatically removed from the list of observed entries. */
  var changeType: java.lang.String
  /** Optional. List of changes to entries within the observed directory (including the entry itself)  */
  var changes: js.UndefOr[js.Array[NotificationChange]] = js.undefined
  /** The identifier of the file system related to this change. */
  var fileSystemId: java.lang.String
  /** The path of the observed entry. */
  var observedPath: java.lang.String
  /** Mode of the observed entry. */
  var recursive: scala.Boolean
  /** Optional. Tag for the notification. Required if the file system was mounted with the supportsNotifyTag option. Note, that this flag is necessary to provide notifications about changes which changed even when the system was shutdown.  */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    changeType: java.lang.String,
    fileSystemId: java.lang.String,
    observedPath: java.lang.String,
    recursive: scala.Boolean,
    changes: js.Array[NotificationChange] = null,
    tag: java.lang.String = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(changeType = changeType, fileSystemId = fileSystemId, observedPath = observedPath, recursive = recursive)
    if (changes != null) __obj.updateDynamic("changes")(changes)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[NotificationOptions]
  }
}

