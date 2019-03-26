package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationChange extends js.Object {
  /**
    * The type of the change which happened to the entry.
    * @see ChangeType
    */
  var changeType: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CHANGEDDELETED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.CHANGED | chromeDashAppsLib.chromeDashAppsLibStrings.DELETED
    ]
  ]
  /** The path of the changed entry. */
  var entryPath: java.lang.String
}

object NotificationChange {
  @scala.inline
  def apply(
    changeType: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CHANGEDDELETED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.CHANGED | chromeDashAppsLib.chromeDashAppsLibStrings.DELETED
      ]
    ],
    entryPath: java.lang.String
  ): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath)
  
    __obj.asInstanceOf[NotificationChange]
  }
}

