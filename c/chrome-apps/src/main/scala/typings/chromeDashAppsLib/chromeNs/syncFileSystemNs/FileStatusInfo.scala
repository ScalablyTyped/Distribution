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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONFLICTING[keyof chrome-apps.Anon_CONFLICTING] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONFLICTING[keyof chrome-apps.Anon_CONFLICTING] */ js.Any
      ]
    ],
    error: java.lang.String = null
  ): FileStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileEntry")(fileEntry)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[FileStatusInfo]
  }
}

