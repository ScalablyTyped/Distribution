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
    chromeDashAppsLib.Anon_SYNCED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_SYNCED))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
}

