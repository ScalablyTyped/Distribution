package typings
package chromeDashAppsLib.chromeNs.syncFileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStatusInfo extends js.Object {
  /** Optional error that is only returned if there was a problem retrieving the FileStatus for the given file. */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /** One of the Entry's originally given to getFileStatuses. */
  var fileEntry: filesystemLib.FileEntry
  /**
    * Status value
    * @see FileStatus
    */
  var status: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CONFLICTING, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.synced | chromeDashAppsLib.chromeDashAppsLibStrings.pending | chromeDashAppsLib.chromeDashAppsLibStrings.conflicting
    ]
  ]
}

object FileStatusInfo {
  @scala.inline
  def apply(
    fileEntry: filesystemLib.FileEntry,
    status: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CONFLICTING, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.synced | chromeDashAppsLib.chromeDashAppsLibStrings.pending | chromeDashAppsLib.chromeDashAppsLibStrings.conflicting
      ]
    ],
    error: java.lang.String = null
  ): FileStatusInfo = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry, status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[FileStatusInfo]
  }
}

